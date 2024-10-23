package com.hospital;

import com.hospital.PatientHelper;
import com.hospital.Patient;
import com.hospital.OutPatientHelper;
import com.hospital.OutPatient;
import com.hospital.InPatientHelper;
import com.hospital.InPatient;
import java.util.Scanner;

public class ListDocs{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);

            PatientHelper list=new PatientHelper();

            System.out.println("Enter the docName to search");
            String name="Dr. ".concat(sc.nextLine().strip());

            for(int i=0;i<list.getListSize();i++){
                Patient patient=list.getPatient(i);
                if(patient.getDocName()==name)
                    System.out.println(patient.getName()+" "+patient.getId());
            }

            OutPatientHelper list2=new OutPatientHelper();

            System.out.println("Enter the time slot:");
            int low=sc.nextInt();
            int high=sc.nextInt();

            for(int i=0;i<list2.getListSize();i++){
                OutPatient p=list2.getPatient(i);

                if(p.getAppt_time()>=low && p.getAppt_time()<=high)
                    System.out.println(p.getId()+" "+p.getName());
            }


            InPatientHelper list3=new InPatientHelper();

            for(int i=0;i<list3.getListSize();i++){
                InPatient pat=list3.getPatient(i);
            }
            System.out.println("Enter doc to search for his list:");
            name="Dr. ".concat(sc.nextLine().strip());

            sc.close();
        }
}
