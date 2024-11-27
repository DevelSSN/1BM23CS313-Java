class Newthread extends Thread
{
	String name;
	int time;
	Newthread(String name, int time)
	{
		this.name=name;
		this.time=time;
	}

	@Override
	public void run() 
	{
		try
		{
			while(true)
			{
				System.out.println(name);
				Thread.sleep(time);
			}
		}
		catch(InterruptedException e)
		{System.out.println("Thread interrupted:\n"+e);}
	}
}

public class Main
{
	public static void main(String[] args)
	{
		Newthread t1 = new Newthread("BMS College of Engineering",10000);
		Newthread t2 = new Newthread("CSE",5000);

		try
		{
			t1.start();
			t2.start();
		}
		catch(Exception e)
		{System.out.println("Exception\n"+e);}
	}
}
