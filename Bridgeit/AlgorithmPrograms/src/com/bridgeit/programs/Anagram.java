/**Purpose: Finding if two strings are anagram or not.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the First String");
		String s1 = utility.inputStringLine();
		System.out.println("Enter the Second String");
		String s2 = utility.inputStringLine();
		boolean b = Utility.checkAnagram(s1,s2);
		if(b)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
