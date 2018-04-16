/**
 * Purpose: Sorting of String array using insertion sort.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class InsertionSortString {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size ");
		int n = utility.inputInteger();
		String[] s = new String[n];
		System.out.println("Enter " + n + " Strings");
		for (int i = 0; i < n; i++) {
			s[i] = utility.inputString();
		}
		s = Utility.insertionSort(s);
		Utility.displayArray(s,n);
	}
}
