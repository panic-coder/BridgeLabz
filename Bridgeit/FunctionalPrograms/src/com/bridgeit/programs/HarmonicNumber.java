/**
 * Purpose: Find the sum of Harmonic numbers.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class HarmonicNumber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size");
		int n = utility.inputInteger();
		double sum = utility.harmonicNumber(n);
		System.out.println(sum);
	}
}
