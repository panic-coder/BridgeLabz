
/**
 * Purpose: Searching a String in a String array.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */

package com.bridgeit.programs;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class BinarySearchString {
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		String file = utility.readFile();
		int i=0,j=0;
		char[] c = file.toCharArray();
		for(i=0;i<c.length;i++) 
			if(c[i]==',')
				j++;
		String[] array = new String[j+1];
		i=0;
		for (String fileString : file.split(",")) {
			array[i]=fileString;
			i++;
		}
		array=Utility.bubbleSort(array);
		Utility.displayArray(array, array.length);
		System.out.println("\nEnter the String to be searched");
		String value = utility.inputString();
		if(Utility.binarySearch(array, value))
			System.out.println(value+" is present");
		else
			System.out.println(value+" is not present");
	}
}
