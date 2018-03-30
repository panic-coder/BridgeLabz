/*Bubble Sort 
Desc -> Reads in integers prints them in sorted order using Bubble Sort
I/P -> read in the list ints
O/P -> Print the Sorted List 
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Sorting integer array using bubble sort.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size");
		int n = utility.inputInteger();
		int[] a = new int[n];
		System.out.println("Enter " + n + " Integers");
		for(int i=0;i<n;i++) {
			a[i]=utility.inputInteger();
		}
		a=Utility.bubbleSort(a);
		Utility.display(a);
	}

}
