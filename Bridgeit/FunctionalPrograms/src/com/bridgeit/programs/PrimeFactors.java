/*Factors
Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class PrimeFactors {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the value to find \nPrime Factorization");
		int n = utility.inputInteger();
		System.out.print("Prime factors of " + n + " are as follows\n");
		utility.primeFactor(n);
	}
}
