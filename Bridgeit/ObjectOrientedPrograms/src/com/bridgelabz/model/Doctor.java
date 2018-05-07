package com.bridgelabz.model;

public class Doctor {
	private String name;
	private long id;
	private String specialization;
	private String availability;
	private long numberOfPatients;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	public long getNumberOfPatients() {
		return numberOfPatients;
	}
	public void setNumberOfPatients(long numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}
	@Override
	public String toString() {
		return "\n\t\t\tDoctor \n\t\t\t\tName : " + name + "\n\t\t\t\tID   : " + id + "\n\t\t\t\tSpecialization : " + specialization + "\n\t\t\t\tAvailability   : "
				+ availability;
	}
}
