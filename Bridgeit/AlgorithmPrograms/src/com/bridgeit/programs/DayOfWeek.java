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
		int m = utility.inputInteger();
		System.out.println("Enter day");
		int d = utility.inputInteger();
		System.out.println("Enter year");
		int y = utility.inputInteger();
		//int days = Utility.getDayOfWeek(m, d, y);
		System.out.println("==========");
		switch (Utility.getDayOfWeek(m, d, y)) {
		case 0: {
			System.out.println("Sunday");
			break;
		}
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		default: {
			System.out.println("Error");
			break;
		}

		}
	}
}
