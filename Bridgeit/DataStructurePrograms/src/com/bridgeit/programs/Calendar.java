package com.bridgeit.programs;

/**
 * Purpose: Display calendar of a month after month and year as input 
 * 
 * @author Kumar Shubham
 * 
 * @since 03-04-2018
 *
 */

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
