/*Question to find your number
Desc -> takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
I/P -> the Number N and then recursively ask true/false if the number is between a high and low value
Logic -> Use Binary Search to find the number
O/P -> Print the intermediary number and the final answer
*/

package com.bridgeit.programs;

/**
 * Purpose: Takes a command-line argument N, asks you to think of
 *  a number between 0 and N-1, where N = 2^n, and always guesses 
 *  the answer with n questions.
 *
 * @author Kumar Shubham
 * @since 30-03-2018
 *
 */

import com.bridgeit.utility.Utility;

public class FindYourNumber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the number");
		int n = utility.inputInteger();
		System.out.println("Enter true for number is present\n"
				+ "false if the number is not present ");
		boolean b = utility.inputBoolean();
		int N = Utility.power(n,2); 
		//System.out.println(N);
		int[] a = new int[N];
		for(int i=0;i<N;i++) {
			a[i]=i;
		}
		int d=Utility.binarySearchOutputBound(a, n);
		if(d!=-1 && b)
			System.out.println("You were true, number is present in "+d+1);
		else
			System.out.println("You were false, number is not present");
		
	}
}
