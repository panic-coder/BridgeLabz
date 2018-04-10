/*Insertion Sort 
Desc -> Reads in strings from standard input and prints them in sorted order.
Uses insertion sort.
I/P -> read in the list words
Logic -> Use Insertion Sort to sort the words in the String array
O/P -> Print the Sorted List
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Sorting of String array using insertion sort.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */
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
