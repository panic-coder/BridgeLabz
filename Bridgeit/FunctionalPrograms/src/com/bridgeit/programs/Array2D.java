/**
 * Purpose: reading int, double and boolean in input array
 * and printing using PrintWriter.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Array2D {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1. for integers\n" + "2. for doubles\n" + "3. for booleans\nEnter your choice");
		int ch = utility.inputInteger();
		switch (ch) {
		case 1:
			utility.intArray();
			break;
		case 2:
			utility.doubleArray();
			break;
		case 3:
			utility.booleanArray();
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
		//utility.display(a,3,3);
	}
}
