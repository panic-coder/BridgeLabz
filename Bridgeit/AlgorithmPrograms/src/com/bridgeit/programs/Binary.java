/**
 * Purpose: Find binary of decimal, changing nibble 
 * and again changing the swapped nibbles into decimal. 
 * 
 * @author Kumar Shubham
 * @since  30-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Binary {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number");
		int n = utility.inputInteger();
		String s = Utility.toBinary(n);
		System.out.println(s + " Binary of " + n);
		String nibbleS = Utility.swapNibble(s);
		System.out.println("==============================");
		System.out.println("Swapping nibbles we get " + nibbleS);
		int decimal = Utility.binaryToDecimal(nibbleS);
		System.out.println(decimal + " is decimal of " + nibbleS);
	}
}
