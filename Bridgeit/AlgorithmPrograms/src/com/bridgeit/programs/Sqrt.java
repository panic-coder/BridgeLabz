package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Sqrt {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a non negative number");
		double c= utility.inputInteger();
		System.out.println(Math.sqrt(c));
		//Utility.sqrt(c);
	}
}
