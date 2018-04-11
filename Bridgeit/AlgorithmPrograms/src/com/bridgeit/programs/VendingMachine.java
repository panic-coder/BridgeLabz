/**
 * Purpose: To find out fewest notes to be returned by vending machine
 * 
 * @author Kumar Shubham
 * @since  30-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class VendingMachine {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Amount to be withdrawl");
		int n = utility.inputInteger();
		Utility.getNotes(n);
	}
}
