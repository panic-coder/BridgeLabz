/**
 * Purpose: Flip coin and find out percentage of heads and tails. 
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number of testcases");
		int n = utility.inputInteger();
		utility.flipcoin(n);
	}
}
