/**
 * Purpose: Finding anagram from the prime numbers up to 1000 using stack
 *  
 * @author Kumar Shubham
 * @since  06-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeAnagramStack {
	public static void main(String[] args) {
		int size = 1000;
		int primeCount=1;
		int count=0;
		while(primeCount<=size) {
			if(Utility.prime(primeCount)) {
				count++;
			}
			primeCount++;
		}
		 System.out.println();
		 System.out.println("Anagram");
		 int[] prime= new int[count];
		 primeCount=1;
		 int loop=0;
		 while(primeCount<=size) {
			 if(Utility.prime(primeCount)) {
				 prime[loop]=primeCount;
				 loop++;
			 }
			 primeCount++;
		 }
		 
		 Utility.primeAnagramLinkedListStack(prime);
	}
}
