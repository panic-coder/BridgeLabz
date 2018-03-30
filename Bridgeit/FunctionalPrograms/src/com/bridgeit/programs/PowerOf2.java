/*Power of 2 
Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
Logic -> repeat until i equals N.
O/P -> Print the year is a Leap Year or not
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Print the power of 2 up to the given number. 
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */
public class PowerOf2 {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the value of N where 0<N<31");
		int n = utility.inputInteger();
		int i = 0;
		while (i < n) {
			int num = utility.powerOf2(i);
			System.out.println(num + " ");
			i++;
		}
	}
}
