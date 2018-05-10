/**
 * Purpose : Class that implements the interface DisplayDetails
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

public class DisplayDetailsImpl implements DisplayDetails{

	/*
	 * Purpose : Display doctor list 
	 */
	@Override
	public void displayDoctor(List<Doctor> doctorList) {
		for(Doctor doctor : doctorList) {
			System.out.println(doctor.toString());
		}
	}

	/* 
	 * Purpose : Display patient list
	 */
	@Override
	public void displayPatient(List<Patient> patientList) {
		for(Patient patient: patientList) {
			System.out.println(patient.toString());
		}
	}

	/* 
	 * Purpose : Display appointment list
	 */
	@Override
	public void displayAppointment(List<Appointment> appointmentList) {
		for(Appointment appointment : appointmentList) {
			System.out.println(appointment.toString());
		}
	}

	/*
	 * Purpose : Display popular doctor 
	 */
	@Override
	public void displayPopularDoctor(List<Doctor> doctorList) {
		for(Doctor doctor : doctorList) {
			if(doctor.getNumberOfPatients()==5) {
				System.out.println("\n\t\t\tPopular doctor is : Dr."+doctor.getName());
			}
		}
	}

	/* 
	 * Purpose : Display popular Specialization
	 */
	@Override
	public void displayPopularSpecialization(List<Doctor> doctorList) {
		for(Doctor doctor : doctorList) {
			if(doctor.getNumberOfPatients()==5) {
				System.out.println("\n\t\t\tPopular specialization of clinic : "+doctor.getSpecialization());
			}
		}
	}
}


