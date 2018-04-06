package com.bridgeit.programs;

/**
 * Purpose: Checking total cash in bank after withdrawal and deposit
 * 
 * @author Kumar Shubham
 * 
 * @since 02-04-2018
 *
 */

import com.bridgeit.utility.Utility;


public class BankCashCounter {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter total number ofpeople");
		int size = utility.inputInteger();
		int cashBalance = utility.bankCashCounter(size);
		System.out.println("Cash Balance : "+cashBalance);
	}
}
