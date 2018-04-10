/*Binary Search the Word from Word List
Desc -> Read in a list of words from File. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
I/P -> read in the list words comma separated from a File and then enter the word to be searched
Logic -> Use Arrays to sort the word list and then do the binary search
O/P -> Print the result if the word is found or not
*/
package com.bridgeit.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Searching a String in a String array.
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */
public class BinarySearchString {
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		File file = new File("/home/bridgeit/eclipse-workspace/Bridgeit/AlgorithmPrograms/file");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		String st;
		int i=0;
		int j=0;
		while ((st = br.readLine()) != null) {
			str = str + st;
		}
		System.out.println(str);
		br.close();
		char[] c = str.toCharArray();
		for(i=0;i<c.length;i++) {
			if(c[i]==',')
				j++;
		}
		String[] array = new String[j+1];
		// System.out.println(str);
		i=0;
		for (String fileString : str.split(",")) {
			 //System.out.println(fileString);
			array[i]=fileString;
			//System.out.println(array[i]);
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
