/**
 * Purpose: Replacing name, full name and phone number in a string and and validating the user 
 * input before replacing
 * 
 * @author Kumar Shubham
 * @since  09-04-2018
 *
 */

package com.bridgeit.programs;

import java.io.IOException;
import java.util.regex.Pattern;

import com.bridgeit.utility.Utility;

public class RegularExpressionDemonstration {
	public static void main(String[] args)throws IOException {
		Utility utility = new Utility();
		String st = "Hello <<name>>, We have your full name as <<full name>> "
				+ "\nin our system. your contact number is 91-xxxxxxxxxx. "
				+ "\nPlease,let us know in case of any clarification "
				+ "\nThank you BridgeLabz 01/01/2016.";
		int x=0;
		int y=0;
		int z=0;
		String firstName="";
		String lastName="";
		String phoneNumber="";
		while(x==0) {
		System.out.println("Enter first name");
		firstName=utility.inputString();
		Pattern p =Pattern.compile("^[A-Za-z]{3,20}$");
		boolean b =p.matcher(firstName).matches();
		if(b) {
			x=1;
		}	
		if(x==0)
			System.out.println("Enter only alphabets for name");
		}
		while(z==0) {
		System.out.println("Enter last name");
		 lastName=utility.inputString();
		 Pattern p = Pattern.compile("^[A-Za-z]{3,20}$");
		 if(p.matcher(lastName).matches())
			 z=1;
		 if(z==0)
			 System.out.println("Enter only alphabets for name");
		}
		 while(y==0) {
		System.out.println("Enter phone number");
		 phoneNumber=utility.inputString();
		 Pattern p = Pattern.compile("^[0-9]{10}$");
		 if(p.matcher(phoneNumber).matches())
			 y=1;
		 if(y==0)
			 System.out.println("Please enter numbers only of length 10");
		 }
		System.out.println(Utility.replaceExpressionDemonstration(st,firstName,lastName,phoneNumber));
		
	}
}
