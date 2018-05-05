package com.bridgelabz.utility;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;

public class Utility {
	Scanner scanner;
	Random random;

	public Utility() {
		scanner = new Scanner(System.in);
		random = new Random();
	}

	/**
	 * Generating Random Numbers with bound
	 * 
	 * @param bound
	 * @return generated Random Number
	 */
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	/**
	 * Generating Random Numbers without bound
	 * 
	 * @return generated Random Number
	 */
	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for String
	 * 
	 * @return INPUT STRING
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	
	/**
	 * Takes input with the user via Scanner for StringLine
	 * 
	 * @return INPUT STRING LINE
	 */
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for Integer
	 * 
	 * @return INPUT INTEGER
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Double
	 * 
	 * @return INPUT DOUBLE
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Boolean
	 * 
	 * @return INPUT BOOLEAN
	 */
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	public Doctor addDoctorToList() {
		Doctor doctor = new Doctor();
		System.out.println("Enter Name");
		doctor.setName(inputString());
		System.out.println("Enter ID in number");
		doctor.setId(inputInteger());
		System.out.println("Enter Specialization");
		doctor.setSpecialization(inputString());
		System.out.println("Enter Availability");
		doctor.setAvailability(inputString());
		return doctor;
	}
	
	public Patient addPatientToList() {
		Patient patient = new Patient();
		
		System.out.println("Enter Name");
		patient.setName(inputString());
		System.out.println("Enter ID in number");
		patient.setId(inputInteger());
		System.out.println("Enter Phone Number");
		patient.setPhone(inputString());
		System.out.println("Enter Age");
		patient.setAge(inputInteger());
		return patient;
	}
	
	public Appointment addAppointmentToList(List<Doctor> doctorList, List<Patient> patientList) {
		Appointment appointment = new Appointment();
		System.out.println("Enter name of Patient");
		String patientAppointment = inputString();
		int count = 0;
		for(Patient patient : patientList) {
			if(patient.getName().equals(patientAppointment)) {
				count++;
				System.out.println("Enter the name of Doctor for Appointment");
				String doctorAppointment = inputString();
				System.out.println("Enter the ID of Doctor for Appointment");
				long doctorAppointmentId = inputInteger();
				for(Doctor doctor : doctorList) {
					if(doctor.getName().equals(doctorAppointment)) {
						if(doctor.getId()==doctorAppointmentId) {
							if(count>0) {
							appointment.setDoctor(doctor);
							appointment.setPatient(patient);
							System.out.println("Appointment fixed");
							return appointment;
						}}
					}
				}
			}
		}
		if(count==0){
			System.out.println("Sorry you are not a registered patient\nClinic closed");
			System.exit(0);
		}
		return null;
	}

}
