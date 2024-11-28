class Newthread implements Runnable
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

public class MainAlt
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Newthread("BMS College of Engineering",10000));
		Thread t2 = new Thread(new Newthread("CSE",5000));

		try
		{
			t1.start();
			t2.start();
		}
		catch(Exception e)
		{System.out.println("Exception\n"+e);}
	}
}
