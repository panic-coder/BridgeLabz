package com.bridgelabz.controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	public void displayPopularDoctor() {
		System.out.println("Enter");
	}

	@Override
	public void displayPopularSpecialization(List<Doctor> doctorList) {
		/*ArrayList<String> profession = new ArrayList<>();
		for(Doctor doctor : doctorList) {
			profession.add(doctor.getSpecialization());
		}
		Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<profession.size();i++){            
            Integer cnt = map.get(profession.get(i));       
            map.put(profession.get(i), cnt==null?1:cnt+1);   
        }
        Set<Entry<String, Integer>> set = map.entrySet();
        ArrayList<Entry<String, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, (o1, o2) -> ((o2).getValue()).compareTo( (o1).getValue() ));
        System.out.println(list.get(0).getKey());
        System.out.println(map);
        for()*/
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<doctorList.size();i++) {
			if(map.containsKey(doctorList.get(i).getSpecialization())) {
				map.put(doctorList.get(i).getSpecialization(),(map.get(i).intValue())+1);
			}else {
				map.put(doctorList.get(i).getSpecialization(),1);

			}
		}
		int count = 0;
		String spe = "";
		for (Entry<String, Integer> e : map.entrySet()) 
		{
			if(e.getValue()>count)
			{
				count=e.getValue();
				spe=e.getKey();
			}
		}
		System.out.println("Famous spl"+spe);
	}

}


