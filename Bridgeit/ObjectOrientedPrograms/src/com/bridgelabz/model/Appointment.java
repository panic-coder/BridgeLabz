package com.bridgelabz.model;

public class Appointment {
	Patient patient;
	Doctor doctor;
	String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "\n\n\t    Appointment " + patient + doctor + "\n\t\t\tDate  : "+date;
	}
}
