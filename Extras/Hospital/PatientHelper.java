package com.hospital;

import com.hospital.Patient;
import java.util.Scanner;

public class PatientHelper{
	private Patient[] patients;
	private int index=0;
	Scanner sc=new Scanner(System.in);

	public PatientHelper(){
		System.out.print("Enter no. of Patients:");
		int n=sc.nextInt();
		sc.nextLine();
		this.patients=new Patient[n];
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
			patients[i]=new Patient(id,name, phoneNo, age, docName);
		}
		sc.close();
	}

	public Patient getPatient(int i){
		return patients[i];
	}

	public int getIndex(){return index;}

	public void setIndex(int newVar){this.index=newVar;}

	public int getListSize(){return patients.length;}
}
