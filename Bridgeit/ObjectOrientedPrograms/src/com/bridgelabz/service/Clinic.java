package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.controller.AddDetailsImpl;
import com.bridgelabz.controller.DisplayDetailsImpl;
import com.bridgelabz.controller.SearchDetailsImpl;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.utility.Utility;

public class Clinic {
	public static List<Doctor> doctorList = new ArrayList<>();
	public static List<Patient> patientList = new ArrayList<>();
	public static List<Appointment> appointmentList = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		AddDetailsImpl addDetails = new AddDetailsImpl();
		DisplayDetailsImpl displayDetails = new DisplayDetailsImpl();
		SearchDetailsImpl searchDetails = new SearchDetailsImpl();
		doctorList = addDetails.read(doctorList, "doctor","Doctor");
		patientList = addDetails.read(patientList, "patient", "Patient");
		appointmentList = addDetails.read(appointmentList, "appointment", "Appointment");
		int loop = 0;
		while (loop == 0) {
			System.out.println("\t\t\t__________________________________\n"
					+ "\t\t\t|\t       Clinic\t\t  |\n"
					+ "\t\t\t|\t      --------\t\t  |\n"
					+ "\t\t\t|\t1. Add new entries\t  |\n"
					+ "\t\t\t|\t2. Take Appointment\t  |\n"
					+ "\t\t\t|\t3. Save in file\t\t  |\n" 
					+ "\t\t\t|\t4. Display Details\t  |\n"
					+ "\t\t\t|\t5. Search Details\t  |\n" 
					+ "\t\t\t|\t6. Close the Clinic\t  |\n"
					+ "\t\t\t|_________________________________|\n");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				int loopAdd = 0;
				while (loopAdd == 0) {

					System.out.println("\t\t\t_______________________\n"
							+ "\t\t\t|       Add Menu       |\n"
							+ "\t\t\t|      ----------      |\n"
							+ "\t\t\t|    1. Add Doctor     |\n" 
							+ "\t\t\t|    2. Add Patient    |\n" 
							+ "\t\t\t|    3. Exit           |\n"
							+ "\t\t\t|______________________|\n");
					int choiceAdd = utility.inputInteger();
					switch (choiceAdd) {
					case 1:
						String admin = "Admin";
						String pass = "Admin";
						System.out.println("\n\t\t\tEnter Admin Id");
						String user = utility.inputString();
						System.out.println("\n\t\t\tEnter password");
						String password = utility.inputString();
						if(user.equals(admin) && password.equals(pass)) {
							System.out.println("\n\t\t\tEnter doctor details");
							doctorList = addDetails.addDoctor(doctorList);
						}
						else {
							System.out.println("\n\t\t\tWrong ID or password");
						}	
						break;
					case 2:
						patientList = addDetails.addPatient(patientList);
						break;
					case 3:
						loopAdd = 1;
						System.out.println("\n\t\t\tAdd Service closed\n");
						break;
					default:
						loopAdd = 1;
						System.out.println("\n\t\t\tSomething went wrong\n\t\t\tAdd menu closed\n");
						break;
					}
				}
				break;
			case 2:
				appointmentList = addDetails.takeAppointment(doctorList,patientList,appointmentList);
				break;
			case 3:
				int loopSave = 0;
				while (loopSave == 0) {
					System.out.println("\t\t\t________________________\n"
							+ "\t\t\t|       Save Menu       |\n"
							+ "\t\t\t|      -----------      |\n"
							+ "\t\t\t|  1. Save Doctors      |\n"
							+ "\t\t\t|  2. Save Patients     |\n"
							+ "\t\t\t|  3. Save Appointments |\n"
							+ "\t\t\t|  4. Exit              |\n"
							+ "\t\t\t|_______________________|\n");
					int choiceSave = utility.inputInteger();
					switch (choiceSave) {
					case 1:
						addDetails.save(doctorList, "doctor");
						break;
					case 2:
						addDetails.save(patientList, "patient");
						break;
					case 3:
						addDetails.save(appointmentList, "appointment");
						break;
					case 4:
						loopSave = 1;
						System.out.println("\n\t\t\tSave Service closed\n");
						break;
					default:
						loopSave = 1;
						System.out.println("\n\t\t\tSomething went wrong\n\t\t\tSave menu closed\n");
						break;
					}
				}
				break;
			case 4:
				int loopDisplay = 0;
				while (loopDisplay == 0) {
					System.out.println("\t\t\t________________________________________\n"
							+ "\t\t\t|\t      Display Menu   \t\t|\n"
							+ "\t\t\t|\t     --------------  \t\t|\n"
							+ "\t\t\t|   1. Display all Doctors\t\t|\n" 
							+ "\t\t\t|   2. Display all Patients\t\t|\n" 
							+ "\t\t\t|   3. Display all Appointments\t\t|\n"
							+ "\t\t\t|   4. Display Popular Doctors\t\t|\n" 
							+ "\t\t\t|   5. Display Popular Specialization\t|\n" 
							+ "\t\t\t|   6. Exit\t\t\t\t|\n"
							+ "\t\t\t|_______________________________________|\n");
					int choiceDisplay = utility.inputInteger();
					switch (choiceDisplay) {
					case 1:
						displayDetails.displayDoctor(doctorList);
						break;
					case 2:
						displayDetails.displayPatient(patientList);
						break;
					case 3:
						displayDetails.displayAppointment(appointmentList);
						break;
					case 4:
						displayDetails.displayPopularDoctor(doctorList);
						break;
					case 5:
						displayDetails.displayPopularSpecialization(doctorList);
						break;
					case 6:
						loopDisplay = 1;
						System.out.println("\n\t\t\tDisplay Service closed\n");
						break;
					default:
						loopDisplay = 1;
						System.out.println("\n\t\t\tSomething went wrong\n\t\t\tDisplay menu closed\n");
						break;
					}
				}
				break;
			case 5:
				int loopSearch = 0;
				while(loopSearch == 0) {
					System.out.println("\t\t\t_____________________\n"
									 + "\t\t\t|     Search Menu    |\n"
							         + "\t\t\t|    -------------   |\n"
									 + "\t\t\t|  1. Search Doctor  |\n"
									 + "\t\t\t|  2. Search Patient |\n"
									 + "\t\t\t|  3. Exit           |\n"
									 + "\t\t\t|____________________|\n");
					int choiceSearch = utility.inputInteger();
					switch(choiceSearch) {
					case 1:
						int loopSearchDoctor = 0;
						while(loopSearchDoctor == 0) {
							System.out.println("\t\t\t_________________________________________\n"
											 + "\t\t\t|          Doctor Search Menu            |\n"
											 + "\t\t\t|         --------------------           |\n"
											 + "\t\t\t|  1. Search Doctor by Id                |\n"
											 + "\t\t\t|  2. Search Doctor by Name              |\n"
											 + "\t\t\t|  3. Search Doctor by Specialization    |\n"
											 + "\t\t\t|  4. Search Doctor by Availability      |\n"
											 + "\t\t\t|  5. Exit                               |\n"
											 + "\t\t\t|________________________________________|\n");
							int choiceSearchDoctor = utility.inputInteger();
							switch(choiceSearchDoctor) {
							case 1:
								searchDetails.searchDoctorById(doctorList);
								break;
							case 2:
								searchDetails.searchDoctorByName(doctorList);
								break;
							case 3:
								searchDetails.searchDoctorBySpecialization(doctorList);
								break;
							case 4:
								searchDetails.searchDoctorByAvailability(doctorList);
								break;
							case 5:
								loopSearchDoctor = 1;
								System.out.println("\n\t\t\tDoctor Search Service closed\n");
								break;
							default:
								loopSearchDoctor = 1;
								System.out.println("\n\t\t\tSomething went wrong\n\t\t\tDoctor Search menu closed\n");
								break;
							}
						}
						break;
					case 2:
						int loopSearchPatient = 0;
						while(loopSearchPatient == 0) {
							System.out.println("\t\t\t___________________________________\n"
											 + "\t\t\t|       Patient Search Menu        |\n"
											 + "\t\t\t|      ---------------------       |\n"
											 + "\t\t\t|   1. Search Patient by Id        |\n"
											 + "\t\t\t|   2. Search Patient by Name      |\n"
											 + "\t\t\t|   3. Search Patient by Contact   |\n"
											 + "\t\t\t|   4. Exit                        |\n"
											 + "\t\t\t|__________________________________|\n");
							int choiceSearchPatient = utility.inputInteger();
							switch(choiceSearchPatient) {
							case 1:
								searchDetails.searchPatientById(patientList);
								break;
							case 2:
								searchDetails.searchPatientByName(patientList);
								break;
							case 3:
								searchDetails.searchPatientByContact(patientList);
								break;
							case 4:
								loopSearchPatient = 1;
								System.out.println("\n\t\t\tPateint Search Service closed\n");
								break;
							default:
								loopSearchPatient = 1;
								System.out.println("\n\t\t\tSomething went wrong\n\t\t\tPatient Search menu closed\n");
								break;
							}
						}
						break;
					case 3:
						loopSearch = 1;
						System.out.println("\n\t\t\tSearch Service closed\n");
						break;
						default:
							loopSearch = 1;
							System.out.println("\n\t\t\tSomething went wrong\n\t\t\tSearch menu closed\n");
							break;
					}
				}
				break;
			case 6:
				loop = 1;
				System.out.println("\n\n\t\t\tClinic service closed\n\t\t\tThank You\n");
				break;
			default:
				loop = 1;
				System.out.println("\n\n\t\t\tSomething went wrong\n\t\t\tClinic service closed\n\t\t\tThank You");
				break;
			}
		}
	}
}
