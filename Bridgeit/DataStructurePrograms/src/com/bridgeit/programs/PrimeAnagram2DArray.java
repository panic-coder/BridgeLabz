/**
 * Purpose: Printing prime numbers which are anagram up to 1000 in a 2D array, 
 * presenting in a range of 0-100,100-200...and so on.  
 * 
 * @author Kumar Shubham
 * @since  04-04-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeAnagram2DArray {
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
		Utility.primeAnagram2DArray(prime);
	}
}
