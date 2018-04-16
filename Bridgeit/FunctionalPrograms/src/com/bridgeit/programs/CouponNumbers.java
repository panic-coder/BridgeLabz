/**
 * Purpose: Finding how many total random numbers should be 
 * created for all the  numbers to be distinct.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class CouponNumbers {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size of Distinct \nCoupon Numbers");
		int arraySize = utility.inputInteger();
		int totalDistinctNumber = utility.couponNumbers(arraySize);
		System.out.println("Total Random numbers needed for \nall Distinct Numbers are " + totalDistinctNumber);
	}

}
