/**
 * Purpose: Checking of 
 *  binarySearch method for integer
 *  binarySearch method for String
 *  insertionSort method for integer
 *  insertionSort method for String
 *  bubbleSort method for integer
 *  bubbleSort method for String
 * 
 * @author Kumar Shubham
 * @since  29-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class SearchSortElapsedTime {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1. Binary Search for Integer"
				+ "\n2. Binary Search for String"
				+ "\n3. Insertion Sort for Integer"
				+ "\n4. Insertion Sort for String"
				+ "\n5. BubbleSort for Integer"
				+ "\n6. BubbleSort for String");
		int ch = utility.inputInteger();
		int size=0;
		System.out.println("Enter the size of array");
		size = utility.inputInteger();
		Integer[] array;
		String[] stringArray;
		String itemS;
		Integer  item;
		long start;
		long end;
		
		switch(ch) {
		case 1:
			array=utility.getInputInt(size);
			array=Utility.bubbleSort(array);
			Utility.displayArray(array, size);
			System.out.println("\nEnter the number to be searched");
			item = utility.inputInteger();
			start = System.nanoTime();
			if(Utility.binarySearch(array, item))
				System.out.println("Present");
			else
				System.out.println("Not Present");
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			break;
			
		case 2:
			stringArray=utility.getInputString(size);
			stringArray=Utility.bubbleSort(stringArray);
			Utility.displayArray(stringArray, size);
			System.out.println("\nEnter the String to be searched");
			itemS = utility.inputString();
			start = System.nanoTime();
			if(Utility.binarySearch(stringArray, itemS))
				System.out.println("Present");
			else
				System.out.println("Not Present");
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			break;
			
		case 3:
			array=utility.getInputInt(size);
			start = System.nanoTime();
			array=Utility.insertionSort(array);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(array, size);
			break;
			
		case 4:
			stringArray=utility.getInputString(size);
			start = System.nanoTime();
			stringArray=Utility.insertionSort(stringArray);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(stringArray, size);
			break;
			
		case 5:
			array=utility.getInputInt(size);
			start = System.nanoTime();
			array = Utility.bubbleSort(array);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(array, size);
			break;
			
		case 6:
			stringArray=utility.getInputString(size);
			start = System.nanoTime();
			stringArray=Utility.bubbleSort(stringArray);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(stringArray, size);
			break;
			
		default:
				System.out.println("Wrong Choice");
				break;
		}
	}
}
