import java.util.Scanner;


public class Student{

        private String name;
        private final String USN;
        private int[] marks, credits, grades;
        private double SGPA;
        public Student(String name, String USN, int[] marks, int[] credits){

            this.name=name;
            this.USN=USN;
            this.marks=marks;
            this.credits=credits;
            this.grades=new int[marks.length];
        }

        public void setGrades(){
            for(int i=0;i<marks.length;i++){
                if(marks[i]>=90 && marks[i]<=100){
                    grades[i]=10;
                }
                else if(marks[i]>=80 && marks[i]<90){
                    grades[i]=9;
                }
                else if(marks[i]>=70 && marks[i]<80){
                    grades[i]=8;
                }
                else if(marks[i]>=60 && marks[i]<70){
                    grades[i]=7;
                }
                else if(marks[i]>=50 && marks[i]<60){
                    grades[i]=6;
                }
                else
                    grades[i]=0;
            }
        }

        public void setSGPA(){
            int creditSum=0;
            int sum=0;
            for(int i=0;i<marks.length;i++){
                creditSum+=credits[i];
                sum+=grades[i]*credits[i];
            }

            this.SGPA=(float)sum/creditSum;
        }

        private String makeString(int[] array){
            StringBuffer s=new StringBuffer("");
            for(int ele: array)
                s.append(ele+"\t");
            return s.toString();
        }

        public void display(){
            System.out.println("""
                                Name:   %s
                                USN:    %s
                                Marks:  %s
                                Credits:%s
                                SGPA:   %.2f""".formatted(name, USN, makeString(marks), makeString(credits), SGPA));
        }
}

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name:");
        String name=sc.nextLine();

        System.out.print("Enter USN:");
        String USN=sc.next().toUpperCase();

        System.out.print("Enter no. of subjects:");
        int n=sc.nextInt();

        int[] marks=new int[n];
        int[] credits=new int[n];

        System.out.println("\nEnter the grade and marks of "+n+" subjects:");
        for(int i=0;i<n;i++){
            credits[i]=sc.nextInt();
            marks[i]=sc.nextInt();
        }

        //Create Student

        Student s=new Student(name, USN, marks, credits);

        s.setGrades();
        s.setSGPA();
        s.display();

        sc.close();
    }
}
