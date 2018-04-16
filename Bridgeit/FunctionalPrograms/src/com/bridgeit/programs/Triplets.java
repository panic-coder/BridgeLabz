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
		int size = utility.inputInteger();
		int[] array = new int[size];
		System.out.println("Enter " + size + " numbers in array");
		for (int i = 0; i < size; i++) {
			array[i] = utility.inputInteger();
		}
		int count = utility.triplets(array);
		if (count == 0) {
			System.out.println("No distinct triplets found");
		} else {
			System.out.println("Total distinct triplets = "+count);
		}
	}
}
