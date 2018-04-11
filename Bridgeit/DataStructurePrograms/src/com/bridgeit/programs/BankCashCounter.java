/**
 * Purpose: Checking total cash in bank after withdrawal and deposit
 * 
 * @author Kumar Shubham
 * 
 * @since 02-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;


public class BankCashCounter {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter total number of people");
		int numberOfPeople = utility.inputInteger();
		int cashBalance = utility.bankCashCounter(numberOfPeople);
		System.out.println("Cash Balance : "+cashBalance);
	}
}
