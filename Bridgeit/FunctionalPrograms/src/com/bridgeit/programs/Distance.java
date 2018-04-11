/**
 * Purpose: Calculating distance using Euclidean distance.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter 2 values for calculating \nEuclidean distance");
		double x,y;
		x = utility.inputDouble();
		y = utility.inputDouble();
		double d=utility.distance(x,y);
		System.out.println(d);
	}
}
