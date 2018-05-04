package com.bridgelabz.service;

import com.bridgelabz.utility.Utility;

public class Clinic {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int loop = 0;
		while (loop == 0) {
			System.out.println("1. Add new entries\n" + "2. Save in file\n" + "3. Display Details\n"
					+ "4. Search Details\n" + "5. Close the Clinic\n");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				int loopAdd = 0;
				while (loopAdd == 0) {

					System.out.println("1. Add Doctor\n" + "2. Add Patient\n" + "3. Take Appointment \n" + "4. Exit\n");
					int choiceAdd = utility.inputInteger();
					switch (choiceAdd) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						loopAdd = 1;
						System.out.println("Add Service closed\n");
						break;
					default:
						loopAdd = 1;
						System.out.println("Something went wrong\nAdd menu closed\n");
						break;
					}
				}
				break;
			case 2:
				int loopSave = 0;
				while (loopSave == 0) {
					System.out.println("1. Save Doctors\n2. Save Patients\n3. Save Appointments\n4. Exit\n");
					int choiceSave = utility.inputInteger();
					switch (choiceSave) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						loopSave = 1;
						System.out.println("Save Service closed\n");
						break;
					default:
						loopSave = 1;
						System.out.println("Something went wrong\nSave menu closed\n");
						break;
					}
				}
				break;
			case 3:
				int loopDisplay = 0;
				while (loopDisplay == 0) {
					System.out.println(
							"1. Display all Doctors\n" + "2. Display all Patients\n" + "3. Display all Appointments\n"
									+ "4. Display Popular Doctors\n" + "5. Display Available Doctors\n" + "6. Exit\n");
					int choiceDisplay = utility.inputInteger();
					switch (choiceDisplay) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						loopDisplay = 1;
						System.out.println("Display Service closed\n");
						break;
					default:
						loopDisplay = 1;
						System.out.println("Something went wrong\nDisplay menu closed\n");
						break;
					}
				}
				break;
			case 4:
				int loopSearch = 0;
				while(loopSearch == 0) {
					System.out.println("1. Search Doctor\n2. Search Patient\n3. Exit\n");
					int choiceSearch = utility.inputInteger();
					switch(choiceSearch) {
					case 1:
						int loopSearchDoctor = 0;
						while(loopSearchDoctor == 0) {
							System.out.println("1. Search Doctor by Id\n2. Search Doctor by Name\n3. Search Doctor by Specialization\n4. Search Doctor by Availability\n5. Exit\n");
							int choiceSearchDoctor = utility.inputInteger();
							switch(choiceSearchDoctor) {
							case 1:
								
								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								break;
							case 5:
								loopSearchDoctor = 1;
								System.out.println("Doctor Search Service closed\n");
								break;
							default:
								loopSearchDoctor = 1;
								System.out.println("Something went wrong\nDoctor Search menu closed\n");
								break;
							}
						}
						break;
					case 2:
						int loopSearchPatient = 0;
						while(loopSearchPatient == 0) {
							System.out.println("1. Search Patient by Id\n2. Search Patient by Name\n3. Search Patient by Contact\n4. Exit");
							int choiceSearchPatient = utility.inputInteger();
							switch(choiceSearchPatient) {
							case 1:
								break;
							case 2:
								break;
							case 3:
								break;
							case 4:
								loopSearchPatient = 1;
								System.out.println("Pateint Search Service closed\n");
								break;
							default:
								loopSearchPatient = 1;
								System.out.println("Something went wrong\nPatient Search menu closed\n");
								break;
							}
						}
						break;
					case 3:
						loopSearch = 1;
						System.out.println("Search Service closed\n");
						break;
						default:
							loopSearch = 1;
							System.out.println("Something went wrong\nSearch menu closed\n");
							break;
					}
				}
				break;
			case 5:
				loop = 1;
				System.out.println("Clinic service closed\nThank You\n");
				break;
			default:
				loop = 1;
				System.out.println("Something went wrong\nClinic service closed\nThank You");
				break;
			}
		}
	}
}
