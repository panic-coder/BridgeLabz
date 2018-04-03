package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PalindromeChecker {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the word to check palindrome");
		String word = utility.inputString();
		boolean b = Utility.palindromeChecker(word);
		//System.out.println(b);
		if(b)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
