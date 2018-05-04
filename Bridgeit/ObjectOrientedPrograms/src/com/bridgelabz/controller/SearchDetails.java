package com.bridgelabz.controller;

import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public interface SearchDetails {
	Doctor searchById();
	void searchDoctorByName();
	void searchDoctorBySpecialization();
	void searchDoctorByAvailability();
	Patient searchPatientById();
	void searchPatientByName();
	void searchPatientByContact();
}
