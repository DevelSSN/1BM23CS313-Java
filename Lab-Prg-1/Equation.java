public class Equation{

	private double root1;
	private double root2;
	private int a;
	private int b;
	private int c;
	private int determinant;
	private boolean real;

	public Equation (int a, int b, int c){

		this.a=a;
		this.b=b;
		this.c=c;
		this.determinant=b*b-4*a*c;
		real=determinant>=0;
	}

	public void setRoots(){
		if (determinant>0){
			System.out.println("Unequal Roots");
			root1=(-b+Math.sqrt(determinant))/(2*a);
			root2=(-b-Math.sqrt(determinant))/(2*a);
		}

		else if (determinant==0){
			System.out.println("Equal Roots");
			root1=(float)(-b)/(2*a);
			root2=root1;
		}

		else{
			System.out.println("No Real Roots");
		}
	}

	public double getRoot1(){
		return root1;
	}

	public double getRoot2(){
		return root2;
	}

	public boolean isReal(){
		return real;
	}

}

class Main{
	public static void main(String args[]){
		Equation e=new Equation(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));

		e.setRoots();
		if (e.isReal())
			System.out.println("Roots are:"+e.getRoot1()+" "+e.getRoot2());

	}
}
