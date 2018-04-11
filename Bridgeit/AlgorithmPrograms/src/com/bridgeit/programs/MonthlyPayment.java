/**
 * 
 * Purpose: Find the monthly payment while repaying for a loan amount.
 * 
 * @author Kumar Shubham
 * @since 30-03-2018
 * 
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class MonthlyPayment {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Principal");
		double p = utility.inputInteger();
		System.out.println("Enter the number of years");
		double y = utility.inputInteger();
		System.out.println("Enter the rate");
		double R = utility.inputInteger();
		double n = 12 * y;
		double r = R / (12 * 100);
		double payment = Utility.getMonthlyPayment(p, r, n);
		System.out.println("Monthly Payment = " + payment);
	}
}
