/*Write a Util Static Function to calculate monthlyPayment that 
 * reads in three command-line arguments P, Y, and R and calculates 
 * the monthly payments you would have to make over Y years to pay 
 * off a P principal loan amount at R per cent interest compounded 
 * monthly. The formula is The formula is
payment=((p*r)/(1-1/(powerDouble((1+r),(n)))));n=12*y;r=R/(12*100);
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * 
 * Purpose: Find the monthly payment while repaying for a loan amount.
 * 
 * @author Kumar Shubham
 * @since 30-03-2018
 * 
 */
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
