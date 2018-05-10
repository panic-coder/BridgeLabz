/**
 * Purpose : Interface to add functionalities to search doctor by id, name, specialization,
 * and availability & search patient by id, name and contact  
 * 
 * @author Kumar Shubham
 * @since  03/05/2018
 *
 */
package com.bridgelabz.controller;

import java.util.List;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public interface SearchDetails {
	void searchDoctorById(List<Doctor> doctorList);
	void searchDoctorByName(List<Doctor> doctorList);
	void searchDoctorBySpecialization(List<Doctor> doctorList);
	void searchDoctorByAvailability(List<Doctor> doctorList);
	void searchPatientById(List<Patient> patientList);
	void searchPatientByName(List<Patient> patientList);
	void searchPatientByContact(List<Patient> patientList);
}
