/*An Anagram Detection Example
Desc -> One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
O/P -> The Two Strings are Anagram or not....
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
		boolean b = Utility.anagram(s1,s2);
		if(b)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}
/*29-March-2018*/