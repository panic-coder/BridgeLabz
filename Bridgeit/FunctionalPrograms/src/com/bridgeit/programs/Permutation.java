/*Write static functions to return all permutation of a
 *  String using iterative method and Recursion method. 
 *  Check if the arrays returned by two string functions are equal. */
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Find the total numbers of permutation.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */
public class Permutation {
	static int size;

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter the String");
		String st = utility.inputString();
		//String st1 = "";
		size = st.length();
		size = utility.factorial(size);
		System.out.println(size);
		//Values value[] = new Values[size];
		//value=utility.permutationIterative(st,size);
		String ar[]=new String[size];
		ar=permutationRecursive("",st);
		for(int k = 0;k<size;k++) {
			System.out.println(ar[k]);
		}
	}

	public static String[] permutationRecursive(String bs, String es) {
		// Values[] value = new Values[size];
		String[] ar = new String[size];
		int k=0;
		if (es.length() <= 1) {
			// System.out.println(bs+es);
			
			if (k < size) {
				ar[k] = bs + es;
				k++;
			}

		} else {
			for (int i = 0; i < es.length(); i++) {
				String ns = es.substring(0, i) + es.substring(i + 1);
				permutationRecursive(bs + es.charAt(i), ns);
			}
		}
		return ar;
	}
}
