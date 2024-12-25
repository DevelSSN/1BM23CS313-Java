class A
{
	synchronized void foo(B b)
	{
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo");
		try { Thread.sleep(1000); }
		catch(Exception e) { System.out.println("A Interrupted"); }
		System.out.println(name + " trying B.last()"); 
		b.last(); 
	}
	synchronized void last() { System.out.println("In A.last()"); }
}
class B {
	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");
		try { Thread.sleep(1000); }
		catch(Exception e) { System.out.println("B Interrupted"); }
		System.out.println(name + " trying A.last()"); 
		a.last(); 
	}
	synchronized void last() { System.out.println("In B.last()"); }
}

class Deadlock implements Runnable
{
	A a = new A(); 
	B b = new B();
	Deadlock() {
		Thread.currentThread().setName("Main");
		Thread t = new Thread(this, "Race");
		t.start(); a.foo(b); // get lock on a in this thread.
		System.out.println("Back in Main");
	}
	public void run() { 
		b.bar(a); // get lock on b in other thread.
		System.out.println("Back in Race");
	}
	public static void main(String args[]) { new Deadlock(); }
}
