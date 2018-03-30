/*To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the week that date falls on. Your program should take three command-line arguments: m (month), d (day), and y (year). For m use 1 for January, 2 for February, and so forth. For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so forth. Use the following formulas, for the Gregorian calendar (where / denotes integer division):
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7*/

package com.bridgeit.programs;

/**
 * 
 * Purpose: To find out the day on a specific date.
 * 
 * @author Kumar Shubham
 * @since  30-03-2018
 *
 */

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
		int days = Utility.dayOfWeek(m, d, y);
		System.out.println("==========");
		switch (days) {
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
