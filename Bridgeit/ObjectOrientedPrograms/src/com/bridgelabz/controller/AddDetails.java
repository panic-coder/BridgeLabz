package com.bridgelabz.controller;

import java.util.List;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public interface AddDetails {
	List<Doctor> addDoctor();
	List<Patient> addPatient();
	List<Appointment> takeAppointment();
	void save();
	void read();
}
