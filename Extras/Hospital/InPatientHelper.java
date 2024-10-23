package com.hospital;

import com.hospital.InPatient;
import java.util.Scanner;

public class InPatientHelper{
	private InPatient[] patients;
	private int index=0;
	Scanner sc=new Scanner(System.in);

	public InPatientHelper(){
		System.out.print("Enter no. of Patients:");
		int n=sc.nextInt();
		sc.nextLine();
		this.patients=new InPatient[n];
		getData();
	}

	private void getData(){

		System.out.println("Enter all patient details");
		for(int i=0;i<patients.length;i++){
			System.out.println("Enter patient "+(i+1)+" details");
			String id=sc.next();
			String name=sc.nextLine();
			sc.nextLine();
			long phoneNo=sc.nextLong();
			int age=sc.nextInt();
			String docName="Dr. ".concat(sc.nextLine().strip());
			sc.nextLine();
			String bedNo=sc.next();
			int noOfDays=sc.nextInt();
			System.out.print("Enter the no. of bills:");
			int n=sc.nextInt();
			System.out.println("Enter bills:");
			double[] bills=new double[n];
			for(int j=0;i<bills.length;i++)
				bills[j]=sc.nextDouble();
			patients[i]=new InPatient(id,name, phoneNo, age, docName, bedNo, bills, noOfDays);
			sc.nextLine();
		}
		sc.close();
	}

	public InPatient getPatient(int i){
		return patients[i];
	}

	public int getListSize(){
        return this.patients.length;
	}
}

