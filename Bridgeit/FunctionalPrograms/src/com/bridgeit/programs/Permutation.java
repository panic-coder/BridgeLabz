/**
 * Purpose: Find the total numbers of permutation.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Permutation

{
	public static void main(String args[])
	{
		Utility utility = new Utility();
		System.out.println("Enter the string");
		String word = utility.inputString();
		char[] seq = word.toCharArray();
		utility.permute(seq, 0);
	}
}