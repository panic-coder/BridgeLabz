package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Calendar {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter month and year");
		int month = utility.inputInteger();
		int year = utility.inputInteger();
		Utility.calender(month,year);
	}
}
