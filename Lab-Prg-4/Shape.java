import java.util.Scanner;

abstract class Shape
{
	protected int xDimension;
	protected int yDimension;

	Shape(){}
	Shape(int x, int y)
	{
		xDimension=x;
		yDimension=y;
	}

	abstract public void printArea();
}

class Rectangle extends Shape
{
	Rectangle(int x, int y){super(x,y);}

	public void printArea(){System.out.println("Area is:"+(xDimension*yDimension));}
}

class Circle extends Shape
{
	Circle(){}
	Circle(int x){
		super(x,x);
	}

	public void printArea(){System.out.println("Area is:"+(Math.PI*xDimension*yDimension));}
}

class Triangle extends Shape
{
	Triangle(int x, int y){super(x,y);}

	public void printArea(){System.out.println("Area is:"+(0.5*xDimension*yDimension));}
}

class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Rectangle\n2. Triangle\n3. Circle\n0. Exit");
		Shape s;
		loop:
		while(true)
		{
			System.out.print("Enter choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:	System.out.print("Enter dimensions of rectangle:");
					int x=sc.nextInt();
					int y=sc.nextInt();
					s=new Rectangle(x,y);
					s.printArea();
					break;
				case 2: System.out.print("Enter dimensions of triangle:");
                                        int a=sc.nextInt();
                                        int b=sc.nextInt();
					s=new Triangle(a,b);
					s.printArea();
					break;
				case 3: System.out.print("Enter dimensions of circle:");
                                        int ch=sc.nextInt();
					s=new Circle(ch);
					s.printArea();
					break;
				case 0: break loop;
				default: continue loop;
			}
			sc.nextLine();
		}
		System.out.println("Exiting...");
		sc.close();
	}
}
