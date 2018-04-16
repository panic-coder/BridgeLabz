/**
 * Purpose: Checking if a range of number whether they are prime 
 * and anagram and palindrome.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeAnagramPalindrome {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the Range");
		int n = utility.inputInteger();
		int i=1,count=0;
		boolean j,k=false;
		System.out.println("Palindrome");
		 while(i<=n) {
			if(utility.isPrimeNumber(i)) {
				if(Utility.isPalindrome(i))
					System.out.println(i);
				count++;
			}
			i++;
		}
		 System.out.println();
		 System.out.println("Anagram");
		 int[] prime= new int[count];
		 i=1;
		 int z=0;
		 while(i<=n) {
			 j=utility.isPrimeNumber(i);
			 if(j) {
				 prime[z]=i;
				 z++;
			 }
			 i++;
		 }
		 Utility.anagram(prime);
		
	}
}
