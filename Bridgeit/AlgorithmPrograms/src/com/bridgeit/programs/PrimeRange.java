/**
 * Purpose: Checking prime for a range of values.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeRange {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the range between 0-1000");
		int n = utility.inputInteger();
		int i=1;
		System.out.println("Prime number range upto "+n);
		while(i<=n) {
			if(utility.isPrimeNumber(i))
				System.out.println(i);
			i++;
		}
	}
}
