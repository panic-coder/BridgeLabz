package com.bridgelabz.model;

public class Patient {
	private String name;
	private long id;
	private String phone;
	private long age;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "\n\t\t\tPatient \n\t\t\t\tName  : " + name + "\n\t\t\t\tID    : " + id + "\n\t\t\t\tPhone : " + phone + "\n\t\t\t\tAge   : " + age;
	}
}
