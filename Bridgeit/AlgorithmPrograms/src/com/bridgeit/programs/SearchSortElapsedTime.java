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
		System.out.println("1. for integer\n2. for String");
		int ch = utility.inputInteger();
		switch (ch) {

		case 1: {
			System.out.println("Enter the size of array");
			;
			int n = utility.inputInteger();
			System.out.println("Enter " + n + " elements");
			Integer[] a = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = utility.inputInteger();
			}

			long timeInsertionStart = System.currentTimeMillis();
			Integer[] arrayInsertion = Utility.insertionSort(a);
			long timeInsertionStop = System.currentTimeMillis();
			System.out.println("==========");
			System.out.println(
					"Insertion Sort time elapsed = " + (timeInsertionStop - timeInsertionStart) + " milliseconds");
			System.out.println("==========");
			Utility.displayArray(arrayInsertion,n);
			System.out.println();

			long timeBubbleStart = System.currentTimeMillis();
			Integer array[]=  Utility.bubbleSort(a);
			long timeBubbleStop = System.currentTimeMillis();
			System.out.println("==========");
			System.out.println("Bubble Sort time elapsed = " + (timeBubbleStop - timeBubbleStart) + " milliseconds");
			System.out.println("==========");
			Utility.displayArray(array,n);

			System.out.println();
			System.out.println("Enter the values to be searched");
			Integer value = utility.inputInteger();
			long timeBinaryStart = System.currentTimeMillis();
			boolean d = Utility.binarySearch(a, value);
			long timeBinaryStop = System.currentTimeMillis();
			System.out.println("==========");
			System.out.println("Binary Search time elapsed = " + (timeBinaryStop - timeBinaryStart) + " milliseconds");
			System.out.println("==========");
			if (d) {
				System.out.println(value + " is present");
			} else {
				System.out.println(value + " is not present");
			}
			break;
		}
		case 2: {
			System.out.println("Enter the size of array");
			;
			int ns = utility.inputInteger();
			System.out.println("Enter " + ns + " elements");
			String[] stringArray = new String[ns];
			for (int i = 0; i < ns; i++) {
				stringArray[i] = utility.inputString();
			}

			long timeInsertionStartS = System.currentTimeMillis();
			String[] stringInsertionSort = Utility.insertionSortString(stringArray);
			long timeInsertionStopS = System.currentTimeMillis();
			System.out.println("==========");
			System.out.println(
					"Insertion Sort time elapsed = " + (timeInsertionStopS - timeInsertionStartS) + " milliseconds");
			System.out.println("==========");
			Utility.displayArray(stringInsertionSort,ns);
			System.out.println();

			long timeBubbleStartS = System.currentTimeMillis();
			String[] sortedStringArray = Utility.bubbleSortString(stringArray);
			long timeBubbleStopS = System.currentTimeMillis();
			System.out.println("==========");
			System.out.println("Bubble Sort time elapsed = " + (timeBubbleStopS - timeBubbleStartS) + " milliseconds");
			System.out.println("==========");
			Utility.displayArray(sortedStringArray,ns);

			System.out.println();
			System.out.println("Enter the values to be searched");
			String values = utility.inputString();
			long timeBinaryStartS = System.currentTimeMillis();
			boolean ds = Utility.binarySearchString(stringArray, values);
			long timeBinaryStopS = System.currentTimeMillis();
			System.out.println("==========");
			System.out
					.println("Binary Search time elapsed = " + (timeBinaryStopS - timeBinaryStartS) + " milliseconds");
			System.out.println("==========");
			if (ds) {
				System.out.println(values + " is present");
			} else {
				System.out.println(values + " is not present");
			}
			break;
		}
		default:
			System.out.println("Wrong choice");
			break;
		}
	}
}
