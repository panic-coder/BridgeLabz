package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Permutation {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the String");
		String st = utility.inputString();
		String st1="";
		int size = st.length();
		int s = size;
		size = utility.power(size,2)-s;
		Values value[] = new Values[size];
		Values val = new Values();
		val.name = st;
		value[0]=val;
		while(size>0) {
			st1 = utility.permutation(st);
		}
		//System.out.println(size);
	}
}
