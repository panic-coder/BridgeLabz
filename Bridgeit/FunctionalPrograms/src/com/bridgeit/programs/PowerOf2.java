/**
 * Purpose: Print the power of 2 up to the given number.
 * 
 * @author Kumar Shubham
 * @since 28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PowerOf2 {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int count = 0;
		int n = 0;
		while (count == 0) {
			System.out.println("Enter the value of N where 0<N<31");
			n = utility.inputInteger();
			if (n > 0 && n < 31)
				count++;
		}
		int i = 0;
		while (i <= n) {
			int num = utility.powerOf2(i);
			System.out.println(num + " ");
			i++;
		}
	}
}
