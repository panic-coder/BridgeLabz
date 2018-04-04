package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Hashing {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the size of array");
		Integer size = utility.inputInteger();
		Utility.hashing(size);
	}
}
