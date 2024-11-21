import java.util.Scanner;

class WrongAge extends Exception
{
	public WrongAge(String message)
	{super(message);}
}

class Father
{
	int fage;
	public Father(int fage) throws WrongAge{
		if(fage<0)
		{throw new WrongAge("Age cannot be negative");}

		this.fage=fage;
	}

	public String toString(){
		return "Father\'s age:"+fage;
	}
}

class Son extends Father
{
	int sage;
	public Son(int fage, int sage) throws WrongAge
	{
		super(fage);

		if(sage>=fage)
		{throw new WrongAge("Son\'s age >= Father\'s age");}

		this.sage=sage;
	}

	public String toString()
	{ return super.toString()+"\n"+"Son\'s age:"+sage;}
}

public class Main
{
	public static void main(String args[]) 
	{
		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter father\'s age:");
			int fage=sc.nextInt();
			System.out.print("Enter son\'s age:");
			int sage=sc.nextInt();

			Son son = new Son(fage, sage);
			System.out.println(son);
		}
		catch(WrongAge e)
		{System.err.println("Error!:"+e.getMessage());}

	}
}

