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
		//value=utility.permutationIterative(st,size);
		String ar[]=new String[size];
		ar=permutationRecursive("",st,ar);
		for(int l = 0;l<size;l++) {
			System.out.println(ar[l]);
		}
		
		//permutationIterative(st);
	}
	static int k=0;
	public static String[] permutationRecursive(String bs, String es,String[] ar) {
		//String[] ar = new String[size];
		//int k=0;
		if (es.length() <= 1) {
			// System.out.println(bs+es);
			
			if (k < size && (bs+es)!=null) {
				ar[k] = bs + es;
				//System.out.println(ar[k]+" "+k);
				k++;
			}
			
		} else {
			
			for (int i = 0; i < es.length(); i++) {
				String ns = es.substring(0, i) + es.substring(i + 1);
				permutationRecursive((bs + es.charAt(i)), ns, ar);
			}
		}
		return ar;
	}
	public static void permutationIterative(String s) {
		char[] a = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			a[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++) {
			String temp = "" +a[i];
			for(int j=0;j<s.length();j++) {
				if(i!=j) {
					//System.out.println(j);
					temp = temp + ( s.substring(0, j) + s.substring(j+1,s.length()));
				}
				
			}
			System.out.println(temp);
		}
	}
}
