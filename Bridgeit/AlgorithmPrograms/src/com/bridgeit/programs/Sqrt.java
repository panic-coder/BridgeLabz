/**
 * Purpose: Finding square root of a non negative number.
 * 
 * @author Kumar Shubham
 * @since  31-08-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Sqrt {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a non negative number");
		double c= utility.inputInteger();
		Utility.sqrt(c);
	}
}
