/* Take a range of 0 - 1000 Numbers and find the Prime numbers 
 * in that range. 
 * Extend the above program to find the prime numbers that are 
 * Anagram and Palindrome 
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeAnagramPalindrome {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Range");
		int n = utility.inputInteger();
		int i=1;
		boolean j,k=false;
		
		 while(i<=n) {
			j=Utility.prime(i);
			if(j) {
				//System.out.println(i);
				k=Utility.palindrome(i);
				if(k)
					System.out.println(i);
			}
			
				//System.out.println(i);
			i++;
		}
		//Utility.palindrome(152);
	}
}
/*29-March-2018*/