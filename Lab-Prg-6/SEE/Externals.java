package SEE;

import java.util.Scanner;
import CIE.*;

public class Externals extends Student
{
	private int[] marks;

        public Externals(){getData();}

        /**
        public Externals(int[] marks)
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
