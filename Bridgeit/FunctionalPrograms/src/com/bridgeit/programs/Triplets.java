/*Sum of three Integer adds to ZERO
Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
I/P -> N number of integer, and N integer input array
Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.
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
/*28-March-2018*/