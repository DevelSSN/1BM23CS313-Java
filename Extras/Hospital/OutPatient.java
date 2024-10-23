package com.hospital;

import com.hospital.PatientHelper;
import com.hospital.Patient;
import java.util.Scanner;

public class OutPatient extends Patient{
    private int no_visits;
    private int appt_time;
    private double billAmt;

    public OutPatient(String id, String name, long phoneNo, int age, String docName, int no_visits, int appt_time, double billAmt){
        super(id, name, phoneNo, age, docName);
        this.no_visits=no_visits;
        this.appt_time=appt_time;
        this.billAmt=(this.no_visits==1)?(billAmt+500):billAmt;
    }
    public int getAppt_time(){return this.appt_time;}
}
