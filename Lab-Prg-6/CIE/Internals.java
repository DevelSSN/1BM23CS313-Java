package CIE;

import java.util.Scanner;

public class Internals
{
	private int[] marks;

	public Internals(){getData();}

	/**
	public Internals(int[] marks)
	{
		this.marks=marks;
	}
	**/

	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		marks = new int[5];
		System.out.println("Enter array of marks");
		for(int i=0;i<marks.length;i++)
			marks[i]=sc.nextInt();
		sc.close();
	}

	public int[] getMarks(){return marks;}

}
