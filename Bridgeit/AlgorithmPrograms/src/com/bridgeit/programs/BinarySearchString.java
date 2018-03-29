/*Binary Search the Word from Word List
Desc -> Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
I/P -> read in the list words comma separated from a File and then enter the word to be searched
Logic -> Use Arrays to sort the word list and then do the binary search
O/P -> Print the result if the word is found or not
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class BinarySearchString {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size");
		int n = utility.inputInteger();
		String[] s = new String[n];
		System.out.println("Enter "+n+" Strings");
		for(int i=0;i<n;i++) {
			s[i]=utility.inputString();
		}
		System.out.println("Enter the String to be searched");
		String value = utility.inputString();
		boolean b = Utility.binarySearchString(s, value);
		if(b)
			System.out.println(value+" is present");
		else
			System.out.println(value+" is not present");
	}
}
/*29-March-2018*/