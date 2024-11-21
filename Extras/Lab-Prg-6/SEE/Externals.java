package SEE;

import java.util.Scanner;
import CIE.*;

class ExternalsException extends Exception
{
	public ExternalsException(String message)
	{super(message);}
}

public class Externals extends Student
{
	private int[] marks;

        private Externals(String usn, String name, int semester, int[] marks){
		super(usn,name,semester);
		this.marks=marks;
	}

	private Externals(Student s, int[] marks)
	{
		super(s);
		this.marks=marks;
	}
        /**
        public Externals(int[] marks)
        {
                this.marks=marks;
        }
        **/
	public static Externals getNewInstanceOf() throws ExternalsException {
        	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter student details and array of SEE marks");
        	String usn = sc.next().strip().toUpperCase();
	        String name = sc.next();
	        int semester = sc.nextInt();
	        int[] marks = new int[5];
	        for (int i = 0; i < marks.length; i++) {
			int mark = sc.nextInt();
			if(mark>70){throw new ExternalsException("External mark exceeded");}
	                marks[i] = mark;
	        }
		sc.nextLine();
	        return new Externals(usn, name, semester, marks);
	}
	
    	public static Externals getNewInstanceOf(Student s) throws ExternalsException{
	        Scanner sc = new Scanner(System.in);
        	System.out.print("Enter SEE marks details:");
	        int[] marks = new int[5];
        	for (int i = 0; i < marks.length; i++) {
			int mark = sc.nextInt();
			if(mark>70){throw new ExternalsException("External mark exceeded");}
	                marks[i] = mark;
	        }
		sc.nextLine();
	        return new Externals(s, marks);
	}
        public int getMarks(int i){return marks[i];}

}
