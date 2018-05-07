package com.bridgelabz.controller;
import java.util.List;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public class DisplayDetailsImpl implements DisplayDetails{

	@Override
	public void displayDoctor(List<Doctor> doctorList) {
		for(Doctor doctor : doctorList) {
			System.out.println(doctor.toString());
		}
	}

	@Override
	public void displayPatient(List<Patient> patientList) {
		for(Patient patient: patientList) {
			System.out.println(patient.toString());
		}
	}

	@Override
	public void displayAppointment(List<Appointment> appointmentList) {
		for(Appointment appointment : appointmentList) {
			System.out.println(appointment.toString());
		}
	}

	@Override
	public void displayPopularDoctor(List<Doctor> doctorList) {
		for(Doctor doctor : doctorList) {
			if(doctor.getNumberOfPatients()==5) {
				System.out.println("\n\t\t\tPopular doctor is : Dr."+doctor.getName());
			}
		}
	}

	@Override
	public void displayPopularSpecialization(List<Doctor> doctorList) {
		for(Doctor doctor : doctorList) {
			if(doctor.getNumberOfPatients()==5) {
				System.out.println("\n\t\t\tPopular specialization of clinic : "+doctor.getSpecialization());
			}
		}
	}
}


