/**
 * Purpose : Class implements the interface AddDetails
 * 
 * @author Kumar Shubham
 * @since  03/05/2018
 *
 */

package com.bridgelabz.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Patient;
import com.bridgelabz.utility.Utility;

public class AddDetailsImpl implements AddDetails {

	Utility utility = new Utility();
	ObjectMapper mapper = new ObjectMapper();

	/* 
	 * Purpose : Adding doctor in doctor list and returning the list
	 */
	@Override
	public List<Doctor> addDoctor(List<Doctor> doctorList) {
		doctorList.add(utility.addDoctorToList());
		return doctorList;
	}

	/* 
	 * Purpose : Adding patient in patient list and returning the list
	 */
	@Override
	public List<Patient> addPatient(List<Patient> patientList) {
		patientList.add(utility.addPatientToList());
		return patientList;
	}

	/*
	 * Purpose : Adding appointments in appointment list and returning the list
	 */
	@Override
	public List<Appointment> takeAppointment(List<Doctor> doctorList, List<Patient> patientList,
			List<Appointment> appointmentList) {
		appointmentList.add(utility.addAppointmentToList(doctorList, patientList));
		return appointmentList;
	}

	/* 
	 * Purpose : Saving list in a file
	 */
	@Override
	public <T> void save(List<T> T, String file) {
		try {
			mapper.writeValue(new File("Clinic/" + file + ".json"), T);
			System.out.println("\n\t\t\tSaved");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* 
	 * Purpose : Reading data from file and storing it in a list
	 */
	@Override
	public <T> List<T> read(List<T> T, String file, String model) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Clinic/" + file + ".json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				if(model.equals("Doctor")) {
					TypeReference<ArrayList<Doctor>> type = new TypeReference<ArrayList<Doctor>>() {};
					T = objectMapper.readValue(arrayToJson, type);
				}
				else if(model.equals("Patient")) {
					TypeReference<ArrayList<Patient>> type = new TypeReference<ArrayList<Patient>>() {};
					T = objectMapper.readValue(arrayToJson, type);
				}
				else if(model.equals("Appointment")) {
					TypeReference<ArrayList<Appointment>> type = new TypeReference<ArrayList<Appointment>>() {};
					T = objectMapper.readValue(arrayToJson, type);
				}
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return T;
	}

}
