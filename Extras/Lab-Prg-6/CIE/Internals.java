package CIE;

import java.util.Scanner;

class InternalsException extends Exception
{
	public InternalsException(String message)
	{super(message);}
}
public class Internals extends Student
{
	private int[] marks;

	private Internals(String usn, String name, int semester, int marks[]){
		super(usn,name,semester);
		this.marks=marks;
	}

	private Internals(Student s, int[] marks)
	{
		super(s);
		this.marks=marks;
	}

	/**
	public Internals(int[] marks)
	{
		this.marks=marks;
	}
	**/

	public static Internals getNewInstanceOf() throws InternalsException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student details and array of CIE marks");
		String usn = sc.next().strip().toUpperCase();
		String name = sc.next();
		int semester = sc.nextInt();
		int[] marks = new int[5];
		for(int i=0;i<marks.length;i++){
			int mark = sc.nextInt();
			if(mark>30){throw new InternalsException("Internal mark exceeded");}
			marks[i]=mark;
		}
		sc.nextLine();
		return new Internals(usn,name,semester,marks);
	}

	public static Internals getNewInstanceOf(Student s) throws InternalsException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CIE marks details:");
		int marks[] = new int[5];
		for(int i=0;i<marks.length;i++){
			int mark = sc.nextInt();
			if(mark>30){throw new InternalsException("Internal mark exceeded");}
			marks[i]=mark;
		}
		sc.nextLine();
		return new Internals(s,marks);
	}

	public int getMarks(int i){return marks[i];}

}
