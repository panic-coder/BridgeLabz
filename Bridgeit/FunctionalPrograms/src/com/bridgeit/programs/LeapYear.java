/**
 * Purpose: Find if the year is leap or not.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class LeapYear {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter year >= 1582");
		int year = utility.inputInteger();
		boolean b = utility.leapyear(year);
		if (b)
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a Leap Year");
	}
}
