/**
 * Purpose: Sorting integer array using bubble sort.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class BubbleSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size");
		int n = utility.inputInteger();
		Integer[] a = new Integer[n];
		System.out.println("Enter " + n + " Integers");
		for(int i=0;i<n;i++) {
			a[i]=utility.inputInteger();
		}
		a=Utility.bubbleSort(a);
		Utility.displayArray(a,n);
	}

}
