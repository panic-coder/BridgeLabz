/*Harmonic Number 
Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
I/P -> The Harmonic Value N. Ensure N != 0
Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
O/P -> Print the Nth Harmonic Value.
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class HarmonicNumber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int n = utility.inputInteger();
		double sum = utility.harmonicNumber(n);
		System.out.println(sum);
	}
}
