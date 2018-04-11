/**
 * Purpose: Checking words,if present remove it and if not present add it.
 * 
 * @author Kumar Shubham
 * @since 04-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class UnOrderedList {
	public static void main(String[] args) throws Exception {
		
		Utility utility = new Utility();
		System.out.println("Enter the word to be searched");
		String userInput = utility.inputString();
		Utility.unOrderedList(userInput);
	}
}
