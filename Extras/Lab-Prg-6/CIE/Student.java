package CIE;

import java.util.Scanner;

public class Student
{
	private String name;
	private String usn;
	private int semester;

	public Student(){}

	public Student(String usn, String name, int semester)
	{
		this.usn=usn;
		this.name=name;
		this.semester=semester;
	}

	public Student(Student s)
	{
		this.usn = s.usn;
		this.name = s.name;
		this.semester = s.semester;
	}
	/**
	public void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter USN:");
		this.usn = sc.next().strip().toUpperCase();
		System.out.print("Enter name:");
		this.name = sc.nextLine();
		System.out.print("Enter semester:");
		this.semester=sc.nextInt();
	}
	**/

	public String getName(){return name;}
	public String getUSN(){return usn;}
	public int getSemester(){return semester;}
}
