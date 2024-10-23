package com.hospital;

import com.hospital.PatientHelper;
import com.hospital.Patient;
import java.util.Scanner;

public class InPatient extends Patient{
    private String bedNo;
    private double[] bills;
    private int noOfDays;
    private double discount;

    public InPatient(String id, String name, long phoneNo, int age, String docName, String bedNo, double[] bills, int noOfDays){
        super(id, name, phoneNo, age, docName);
        this.bedNo=bedNo;
        this.bills=bills;
        this.noOfDays=noOfDays;

        double sum=0.0D;
        for(double bill:this.bills){
            sum+=bill;
        }

        discount=(sum>50000)?(0.15*sum):
                        (sum>25000&&sum<=50000)?(0.10*sum):
                        (sum>10000&&sum<=25000)?(0.05*sum):0.0D;
    }
}
