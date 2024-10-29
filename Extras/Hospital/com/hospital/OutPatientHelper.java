package com.hospital;

import com.hospital.OutPatient;
import java.util.Scanner;

public class OutPatientHelper{
	private OutPatient[] patients;
	private int index=0;
	Scanner sc=new Scanner(System.in);

	public OutPatientHelper(){
		System.out.print("Enter no. of Patients:");
		int n=sc.nextInt();
		sc.nextLine();
		this.patients=new OutPatient[n];
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
			int no_visits=sc.nextInt();
			int appt_time=sc.nextInt();
			double billAmt=sc.nextDouble();
			sc.nextDouble();
			patients[i]=new OutPatient(id,name, phoneNo, age, docName, no_visits, appt_time, billAmt);
			sc.nextLine();
		}
		sc.close();
	}

	public OutPatient getPatient(int i){
		return patients[i];
	}

	public int getListSize(){
        return this.patients.length;
	}
}

