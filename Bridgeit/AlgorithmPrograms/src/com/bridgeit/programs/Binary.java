/*Write Binary.java to read an integer as an Input, convert to Binary using toBinary function and perform the following functions.
i. Swap nibbles and find the new number.
ii. Find the resultant number is the number is a power of 2.
A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
Given a byte, swap the two nibbles in it. For example 100 is to be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100). If we swap the two nibbles, we get 01000110 which is 70 in decimal.
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Find binary of decimal, changing nibble 
 * and again changing the swapped nibbles into decimal. 
 * 
 * @author Kumar Shubham
 * @since  30-03-2018
 *
 */
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
