package pkgFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

public class Patient implements Serializable{
    String fName;
    String lName;
    String phoneHome;
    String phoneWork;
    String phoneCell;
    String address;
    String city;    
    String state;
    String zip;
    String dob;
    String patSince;
    String insure;
    String planNum;
    String doctor;
    String email;
    String conName;
    String conPhone;
    String conRel;
    String gender;
    String ss; 
    String id;
    String lastVisit;

    public Patient(String fName, String lName, String phoneHome, String phoneWork, String phoneCell, String address, 
            String city, String state, String zip, String dob, String patSince, String insure, String planNum, 
            String doctor, String email, String conName, String conPhone, String conRel, String gender, String ss, 
            String id, String lastVisit) 
    {
        this.fName = fName;
        this.lName = lName;
        this.phoneHome = phoneHome;
        this.phoneWork = phoneWork;
        this.phoneCell = phoneCell;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.dob = dob;
        this.patSince = patSince;
        this.insure = insure;
        this.planNum = planNum;
        this.doctor = doctor;
        this.email = email;
        this.conName = conName;
        this.conPhone = conPhone;
        this.conRel = conRel;
        this.gender = gender;
        this.ss = ss;
        this.id=id;
        this.lastVisit=patSince;
    }    
}
