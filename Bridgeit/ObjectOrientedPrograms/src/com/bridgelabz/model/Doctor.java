package com.bridgelabz.model;

public class Doctor {
	private String name;
	private long id;
	private String Specialization;
	private String Availability;
	
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
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		Availability = availability;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", Specialization=" + Specialization + ", Availability="
				+ Availability + "]";
	}
}
