/*Take a range of 0 - 1000 Numbers and 
 * find the Prime numbers in that range. */
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeRange {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the range between 0-1000");
		int n = utility.inputInteger();
		int i=1;
		boolean j;
		System.out.println("Prime number range upto "+n);
		while(i<=n) {
			j=Utility.prime(i);
			if(j)
				System.out.println(i);
			i++;
		}
	}
}
/*29-March-2018*/