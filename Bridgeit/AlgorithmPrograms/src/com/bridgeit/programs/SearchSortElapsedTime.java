/*To the Utility Class write the following static methods
Desc -> Create Utility Class having following static methods
binarySearch method for integer
binarySearch method for String
insertionSort method for integer
insertionSort method for String
bubbleSort method for integer
bubbleSort method for String
I/P -> Write main function to call the utility function
Logic -> Check using Stopwatch the Elapsed Time for every method call
O/P -> Output the Search and Sorted List. More importantly print elapsed time performance in descending order
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

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
		Integer[] a;
		String[] st;
		String itemS;
		Integer  item;
		long start;
		long end;
		
		switch(ch) {
		case 1:
			a=utility.getInputInt(size);
			a=Utility.bubbleSort(a);
			Utility.displayArray(a, size);
			System.out.println("\nEnter the number to be searched");
			item = utility.inputInteger();
			start = System.nanoTime();
			if(Utility.binarySearch(a, item))
				System.out.println("Present");
			else
				System.out.println("Not Present");
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			break;
			
		case 2:
			st=utility.getInputString(size);
			st=Utility.bubbleSort(st);
			Utility.displayArray(st, size);
			System.out.println("\nEnter the String to be searched");
			itemS = utility.inputString();
			start = System.nanoTime();
			if(Utility.binarySearch(st, itemS))
				System.out.println("Present");
			else
				System.out.println("Not Present");
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			break;
			
		case 3:
			a=utility.getInputInt(size);
			start = System.nanoTime();
			a=Utility.insertionSort(a);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(a, size);
			break;
			
		case 4:
			st=utility.getInputString(size);
			start = System.nanoTime();
			st=Utility.insertionSort(st);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(st, size);
			break;
			
		case 5:
			a=utility.getInputInt(size);
			start = System.nanoTime();
			a = Utility.bubbleSort(a);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(a, size);
			break;
			
		case 6:
			st=utility.getInputString(size);
			start = System.nanoTime();
			st=Utility.bubbleSort(st);
			end = System.nanoTime();
			System.out.println("Time elapsed : "+(end-start)+" nano seconds");
			Utility.displayArray(st, size);
			break;
			
		default:
				System.out.println("Wrong Choice");
				break;
		}
	}
}
