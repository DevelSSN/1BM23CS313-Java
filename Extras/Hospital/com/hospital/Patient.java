package com.hospital;

import java.util.Scanner;

public class Patient {

	private String id;
	private String name;
	private long phoneNo;
	private int age;
	private String docName;

	public Patient(){}
	
	public Patient(String id, String name, long phoneNo, int age, String docName)
	{
		this.id=id;
		this.name=name;
		this.phoneNo=phoneNo;
		this.age=age;
		this.docName=docName;
	}


	public void setId (String newVar) {
		id = newVar;
	}

	public String getId () {
		return id;
	}

	public void setName (String newVar) {
		name = newVar;
	}

	public String getName () {
		return name;
	}

	public void setPhoneNo (int newVar) {
		phoneNo = newVar;
	}

	public long getPhoneNo () {
		return phoneNo;
	}

	public void setAge (int newVar) {
		age = newVar;
	}

	public int getAge () {
		return age;
	}

	public void setDocName (String newVar) {
		docName = newVar;
	}

	public String getDocName () {
		return docName;
	}

	public void display(){
		System.out.println("""
							%-12s
							%-25s
							%d
							%d
							%-25s
		""".formatted(id, name, phoneNo, age, docName));
	}

}


