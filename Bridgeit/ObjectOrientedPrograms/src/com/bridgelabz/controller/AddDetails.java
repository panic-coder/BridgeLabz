/**
 * Purpose : Interface to add functionalities to add doctor, patient and take appointment
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

public interface AddDetails {
	List<Doctor> addDoctor(List<Doctor> doctorList);
	List<Patient> addPatient(List<Patient> patientList);
	List<Appointment> takeAppointment(List<Doctor> doctorList, List<Patient> patientList, List<Appointment> appointmentList);
	<T> void save(List<T> T, String file);
	<T> List<T> read(List<T> T, String file, String model) throws Exception;
}
