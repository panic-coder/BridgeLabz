package com.bridgeit.programs;

/**
 * Purpose: Checking numbers,if present remove it and if not present add it.
 * 
 * @author Kumar Shubham
 * 
 * @since 04-04-2018
 *
 */

import com.bridgeit.utility.Utility;

public class OrderedList {
	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		System.out.println("Enter the number to be searched");
		String searchItem  = utility.inputString();
		Utility.orderedList(searchItem);
	}
}
