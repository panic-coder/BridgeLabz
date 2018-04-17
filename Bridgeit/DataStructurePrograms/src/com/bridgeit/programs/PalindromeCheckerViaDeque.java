/**
 * Purpose: Finding checking palindrome of a word via Deque
 * 
 * @author Kumar Shubham
 * @since  04-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PalindromeCheckerViaDeque {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the word to check palindrome");
		String word = utility.inputString();
		boolean b = Utility.palindromeChecker(word);
		if(b)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
