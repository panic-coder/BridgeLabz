package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
public class MergeSort{
public static void main(String args[])
{
	Utility utility = new Utility();
	System.out.println("Enter the size");
	int size = utility.inputInteger();
	int[] arr = new int[size];
	System.out.println("Enter "+size+" elements");
	for(int i=0;i<size;i++) {
		arr[i]=utility.inputInteger();
	}
    System.out.println("Given Array");
    utility.printArray(arr);
    utility.mergeSort(arr, 0, arr.length-1);
    System.out.println("\nSorted array");
    utility.printArray(arr);
}
}
