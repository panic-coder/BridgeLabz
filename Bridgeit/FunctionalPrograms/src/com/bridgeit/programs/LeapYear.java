/*I/P -> Year, ensure it is a 4 digit number.
Logic -> Determine if it is a Leap Year.
O/P -> Print the year is a Leap Year or not.

*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Find if the year is leap or not.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */
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
