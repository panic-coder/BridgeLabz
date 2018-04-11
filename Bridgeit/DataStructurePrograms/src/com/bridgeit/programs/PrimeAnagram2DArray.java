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
		Utility utility = new Utility();
		int n = utility.inputInteger();
		int i=1,count=0;
		boolean j;
		 while(i<=n) {
			j=Utility.prime(i);
			if(j) {
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
			 j=Utility.prime(i);
			 if(j) {
				 prime[z]=i;
				 z++;
			 }
			 i++;
		 }
		 /*for(int q=0;q<prime.length;q++)
			 System.out.println(prime[q]);*/
		Utility.primeAnagram2DArray(prime);
	}
}
