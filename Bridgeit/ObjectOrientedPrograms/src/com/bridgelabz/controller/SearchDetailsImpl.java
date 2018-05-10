/**
 * Purpose : Class that implements interface SearchDetails
 * 
 * @author Kumar Shubham
 * @since  03/05/2018
 *
 */
package com.bridgelabz.controller;

import java.util.List;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.utility.Utility;

public class SearchDetailsImpl implements SearchDetails {
	Utility utility = new Utility();
	
	/* 
	 * Purpose : Search doctor by id
	 */
	@Override
	public void searchDoctorById(List<Doctor> doctorList) {
		System.out.println("\n\t\t\tEnter the ID to be searched");
		long id = utility.inputInteger();
		int count = 0;
		for(Doctor doctor : doctorList) {
			if(doctor.getId()==id) {
				System.out.println(doctor.toString());
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("\n\t\t\tNo doctor found of id "+id);
		}
	}

	/*
	 * Purpose : Search doctor by name
	 */
	@Override
	public void searchDoctorByName(List<Doctor> doctorList) {
		System.out.println("\n\t\t\tEnter the name to be searched");
		String name = utility.inputString();
		int count = 0;
		for(Doctor doctor : doctorList) {
			if(doctor.getName().equals(name)) {
				System.out.println(doctor.toString());
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("\n\t\t\tNo doctor found of name "+name);
		}
	}

	/*
	 * Purpose : Search doctor by specialization
	 */
	@Override
	public void searchDoctorBySpecialization(List<Doctor> doctorList) {
		System.out.println("\n\t\t\tEnter the specialization to be searched");
		String specialization = utility.inputString();
		int count = 0;
		for(Doctor doctor : doctorList) {
			if(doctor.getSpecialization().equals(specialization)) {
				System.out.println(doctor.toString());
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("\n\t\t\tNo doctor found of specialization "+specialization);
		}
	}

	/* 
	 * Purpose : Search doctor by availability
	 */
	@Override
	public void searchDoctorByAvailability(List<Doctor> doctorList) {
		System.out.println("\n\t\t\tEnter the availability as AM, PM or both to be searched");
		String availability = utility.inputString();
		int count = 0;
		for(Doctor doctor : doctorList) {
			if(doctor.getAvailability().equals(availability)) {
				System.out.println(doctor.toString());
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("No doctor found of availability "+availability);
		}
	}

	/* 
	 * Purpose : Search patient by id
	 */
	@Override
	public void searchPatientById(List<Patient> patientList) {
		System.out.println("\n\t\t\tEnter the ID to be searched");
		long id = utility.inputInteger();
		int count = 0;
		for(Patient patient : patientList) {
			if(patient.getId()==id) {
				System.out.println(patient.toString());
				count++;
			}
		}
		if(count==0) {
			System.out.println("\n\t\t\tNo patient found of id "+id);
		}
	}

	/* 
	 * Purpose : Search patient by name
	 */
	@Override
	public void searchPatientByName(List<Patient> patientList) {
		System.out.println("\n\t\t\tEnter the Name to be searched");
		String name = utility.inputString();
		int count = 0;
		for(Patient patient : patientList) {
			if(patient.getName().equals(name)) {
				System.out.println(patient.toString());
				count++;
			}
		}
		if(count==0) {
			System.out.println("\n\t\t\tNo patient found of name "+name);
		}
	}

	/*
	 * Purpose : Search patient by contact 
	 */
	@Override
	public void searchPatientByContact(List<Patient> patientList) {
		System.out.println("\n\t\t\tEnter the phone number to be searched");
		String number = utility.inputString();
		int count = 0;
		for(Patient patient : patientList) {
			if(patient.getPhone().equals(number)) {
				System.out.println(patient.toString());
				count++;
			}
		}
		if(count==0) {
			System.out.println("\n\t\t\tNo patient found with phone number "+number);
		}
	}

}
