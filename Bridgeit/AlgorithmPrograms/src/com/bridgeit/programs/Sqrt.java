package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Finding square root of a non negative number.
 * 
 * @author Kumar Shubham
 * @since  31-08-2018
 *
 */
public class Sqrt {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a non negative number");
		double c= utility.inputInteger();
		//System.out.println(Math.sqrt(c));
		Utility.sqrt(c);
	}
}
