/*Coupon Numbers
Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
I/P -> N Distinct Coupon Number
Logic -> repeatedly choose a random number and check whether it's a new one.
O/P -> total random number needed to have all distinct numbers.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Finding how many total random numbers should be 
 * created for all the  numbers to be distinct.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */
public class CouponNumbers {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size of Distinct \nCoupon Numbers");
		int n = utility.inputInteger();
		int m = utility.couponNumbers(n);
		System.out.println("Total Random numbers needed for \nall Distinct Numbers are " + m);
	}

}
