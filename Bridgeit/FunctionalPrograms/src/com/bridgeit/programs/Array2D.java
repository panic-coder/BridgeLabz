/*2D Array
Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
Logic -> create 2 dimensional array in memory to read in M rows and N cols 
O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Array2D {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1. for integers\n" + "2. for doubles\n" + "3. for booleans\nEnter your choice");
		int ch = utility.inputInteger();
		switch (ch) {
		case 1:
			utility.intArray();
			break;
		case 2:
			utility.doubleArray();
			break;
		case 3:
			utility.booleanArray();
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
	}
}
/*28-March-2018*/