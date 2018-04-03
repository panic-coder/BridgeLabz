package com.bridgeit.programs;

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
