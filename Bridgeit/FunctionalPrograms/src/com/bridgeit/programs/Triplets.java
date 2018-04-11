/**
 * Purpose: Finding if sum the continuous elements in array is zero,
 * if its zero they are triplets. 
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Triplets {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size of array");
		int n = utility.inputInteger();
		int[] a = new int[n];
		System.out.println("Enter " + n + " numbers in array");
		for (int i = 0; i < n; i++) {
			a[i] = utility.inputInteger();
		}
		int count = utility.triplets(a);
		if (count == 0) {
			System.out.println("No distinct triplets found");
		} else {
			System.out.println("Total distinct triplets = "+count);
		}
	}
}
