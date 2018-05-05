package com.bridgelabz.model;

public class Appointment {
	Patient patient;
	Doctor doctor;
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
		return "Appointment [patient=" + patient + ", doctor=" + doctor + "]";
	}
}
