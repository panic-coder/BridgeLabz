package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class RegularExpressionDemonstration {
	public static void main(String[] args) {
		Utility utility = new Utility();
		String st = "Hello <<name>>, We have your full name as <<full name>> "
				+ "\nin our system. your contact number is 91-xxxxxxxxxx. "
				+ "\nPlease,let us know in case of any clarification "
				+ "\nThank you BridgeLabz 01/01/2016.";
		System.out.println("Enter first name");
		String firstName=utility.inputString();
		System.out.println("Enter last name");
		String lastName=utility.inputString();
		System.out.println("Enter phone number");
		String phoneNumber=utility.inputString();
		System.out.println(Utility.replaceExpressionDemonstration(st,firstName,lastName,phoneNumber));
		/*System.out.println(st);
		st=st.replaceAll("<<name>>","Kumar");
		System.out.println(st);
		System.out.println(st.matches("Shubham"));
		System.out.println(st.split("Shubham",2));
		System.out.println(java.time.LocalDate.now());*/
	}
}
