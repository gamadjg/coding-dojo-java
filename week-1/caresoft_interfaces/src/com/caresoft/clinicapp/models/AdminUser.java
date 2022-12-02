package com.caresoft.clinicapp.models;
import com.caresoft.clinicapp.interfaces.HIPAACompliantAdmin;
import com.caresoft.clinicapp.interfaces.HIPAACompliantUser;
import java.util.ArrayList;
import java.util.Date;
public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
	private String role;
	private ArrayList<String> securityIncidents;

//	Constructor:ID, role
	public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
	}

//	HIPAACompliantUser abstracts
	public boolean assignPin(int pin){
		if(String.valueOf(pin).length() >= 6){
			this.setPin(pin);
			return true;
		}
		return false;
	}

	public boolean accessAuthorized(Integer confirmedAuthID){
		if(this.getId().equals(confirmedAuthID)){
			return true;
		}
		authIncident();
		return false;
	}

//	HIPAACompliantAdmin abstracts
	public ArrayList<String> reportSecurityIncidents(){
		return getSecurityIncidents();
	}

//	AdminUser methods
	public void newIncident(String notes) {
		String report = String.format(
				"Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n",
				new Date(), this.id, notes
		);
		this.securityIncidents.add(report);

	}
	public void authIncident() {
		String report = String.format(
				"Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n",
				new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
		);
		this.securityIncidents.add(report);
	}

	// Setters & Getters
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
}
