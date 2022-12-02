package com.caresoft.clinicapp.models;
import com.caresoft.clinicapp.interfaces.HIPAACompliantUser;
import java.util.ArrayList;
import java.util.Date;
public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
//	Constructor: ID
	public Physician(Integer id){
		super(id);
	}
//	HIPAACompliantUser abstracts
	public boolean assignPin(int pin){
		if(String.valueOf(pin).length() == 4){
			this.setPin(pin);
			return true;
		}
		return false;
	}

	public boolean accessAuthorized(Integer confirmedAuthID){
		System.out.printf("%d : %d", this.getId(), confirmedAuthID);
		return this.getId().equals(confirmedAuthID);
	}

	public void newPatientNotes(String notes, String patientName, Date date) {
		String report = String.format("Datetime Submitted: %s \n", date);
		report += String.format("Reported By ID: %s\n", this.id);
		report += String.format("Patient Name: %s\n", patientName);
		report += String.format("Notes: %s \n", notes);
		this.patientNotes.add(report);
	}

//	Setters & Getters
	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}
