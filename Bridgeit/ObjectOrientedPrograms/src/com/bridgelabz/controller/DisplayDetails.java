/**
 * Purpose : Interface to add functionalities to display doctor, patient, appointment,
 * popular doctor and popular specialization
 * 
 * @author Kumar Shubham
 * @since  03/05/2018
 *
 */
package com.bridgelabz.controller;

import java.util.List;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public interface DisplayDetails {
	void displayDoctor(List<Doctor> doctorList);
	void displayPatient(List<Patient> patientList);
	void displayAppointment(List<Appointment> appointmentList);
	void displayPopularDoctor(List<Doctor> doctorList);
	void displayPopularSpecialization(List<Doctor> doctorList);
}
