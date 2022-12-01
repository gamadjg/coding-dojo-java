package com.caresoft.clinicapp.models;
import com.caresoft.clinicapp.interfaces.HIPAACompliantUser;
import java.util.ArrayList;
import java.util.Date;
public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
//	Constructor that takes an ID
	public Physician(Integer id){
		super(id);
	}
//	Implementation of HIPAACompliantUser abstracts
	public boolean assignPin(int pin){
		if(String.valueOf(pin).length() == 4){
			this.setPin(pin);
			return true;
		}
		return false;
	}

	public boolean accessAuthorized(Integer confirmedAuthID){
		if(this.getId())
		return false;
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}

//	Setters & Getters

}
