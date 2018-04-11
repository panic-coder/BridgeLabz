/**
 * Purpose: Finding of roots of the given quadratic equation.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
	Utility utility = new Utility()	;
	
	double a,b,c,delta,x1,x2;
	System.out.println("Enter the values of a, b & c");
	a = utility.inputInteger();
	b = utility.inputInteger();
	c = utility.inputInteger();
	//System.out.println(a+" "+b+" "+c);
	delta = (b*b)-(4*a*c);
	//System.out.println(delta);
	x1 = (-b+Math.sqrt(delta))/(2*a);
	x2 = (-b-Math.sqrt(delta))/(2*a);
	if(x1>0)
		System.out.println("First Root "+x1);
	else
		System.out.println("First Root "+x1+"i");
	if(x2>0)
		System.out.println("Second Root "+x2);
	else
		System.out.println("Second Root "+x2+"i");
	}
}
