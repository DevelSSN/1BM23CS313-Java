import CIE.*;
import SEE.*;
import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.print("Enter the number of Students:");
			int n = sc.nextInt();
			Internals[] ai = new Internals[n];
			Externals[] ae = new Externals[n];
			int[] result=new int[5];
			for (int i = 0; i < n; i++) {
				ai[i] = Internals.getNewInstanceOf(); 
				ae[i] = Externals.getNewInstanceOf(ai[i]);
			}
			System.out.println("Details:");

			for(int i=0;i<n;i++)
			{
				System.out.println("USN:"+ai[i].getUSN()
						+"\tName:"+ai[i].getName()
						+"\tSemester:"+ai[i].getSemester());
				System.out.print("Internals:");
				for(int j=0;j<5;j++){
					System.out.print(ai[i].getMarks(j)+"\t");
					result[j]=ai[i].getMarks(j);
				}
				System.out.println();
				System.out.print("Externals:");
				for(int j=0;j<5;j++){
					System.out.print(ae[i].getMarks(j)+"\t");
					result[j]+=ae[i].getMarks(j);
				}
				System.out.println();
				System.out.print("Results:  ");
				for(int j=0;j<5;j++)
					System.out.print(result[j]+"\t");
				System.out.println();
			}
        	}
		catch(Exception e){System.err.println("Error: "+e.getMessage());}
		finally{sc.close();}
	}
}
