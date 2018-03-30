/*Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails

*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Flip coin and find out percentage of heads and tails. 
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */
public class FlipCoin {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number of testcases");
		int n = utility.inputInteger();
		utility.flipcoin(n);
	}
}
