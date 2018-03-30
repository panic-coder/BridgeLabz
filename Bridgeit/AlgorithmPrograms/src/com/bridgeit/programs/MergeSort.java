package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class MergeSort {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter he size");
		int n = utility.inputInteger();
		int[] a = new int[n];
		System.out.println("Enter " + n + " elemenst");
		for (int i = 0; i < n; i++) {
			a[i]=utility.inputInteger();
		}
		int end = a.length-1;
		a=Utility.mergeSort(a,0,end);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
