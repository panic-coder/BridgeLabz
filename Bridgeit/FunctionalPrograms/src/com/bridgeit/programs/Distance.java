/*Write a program Distance.java that takes two integer 
 * command-line arguments x and y and prints the Euclidean distance 
 * from the point (x, y) to the origin (0, 0). 
 * The formulae to calculate distance = sqrt(x*x + y*y). 
 * Use Math.power function*/
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
