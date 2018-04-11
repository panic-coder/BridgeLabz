/**
 * Purpose: Finding prime factors.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeFactors {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the value to find \nPrime Factorization");
		int n = utility.inputInteger();
		System.out.print("Prime factors of " + n + " are as follows\n");
		utility.primeFactor(n);
	}
}
