/**
 * Purpose: Takes a command-line argument N, asks you to think of
 *  a number between 0 and N-1, where N = 2^n, and always guesses 
 *  the answer with n questions.
 *
 * @author Kumar Shubham
 * @since 30-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class FindYourNumber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number");
		int number = utility.inputInteger();
		int numberPower = Utility.power(number, 2);
		int[] array = new int[numberPower];
		for(int i=0;i<numberPower;i++) {
			array[i]=i;
		}
		Utility.binarySearchOutputBound(array);
	}
}
