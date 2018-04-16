/**
 * 
 * Purpose: To find out the day on a specific date.
 * 
 * @author Kumar Shubham
 * @since  30-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter month");
		int month = utility.inputInteger();
		System.out.println("Enter day");
		int day = utility.inputInteger();
		System.out.println("Enter year");
		int year = utility.inputInteger();
		System.out.println("==========");
		String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int weekDay = Utility.getDayOfWeek(month, day, year);
		System.out.println(week[weekDay]);
	}
}
