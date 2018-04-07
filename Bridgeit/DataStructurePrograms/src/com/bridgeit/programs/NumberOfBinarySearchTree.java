package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class NumberOfBinarySearchTree {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the total number of testcases");
		int testCases = utility.inputInteger();
		
		while (testCases > 0) {
			System.out.println("Enter total number of nodes");
			long totalNodes = utility.inputInteger();
			long totalTree = Utility.numberOfBinarySearchTree(totalNodes);
			System.out.println(totalTree);
			testCases--;
		}
		System.out.println("Ends");
	}
}
