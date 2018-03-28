/*Write a program WindChill.java that takes two double
 *  command-line arguments t and v and prints the wind chill. 
 *  Use Math.pow(a, b) to compute ab. 
Given the temperature t (in Fahrenheit) and the wind speed v 
(in miles per hour), the National Weather Service defines the 
effective temperature (the wind chill) to be:

w = 35.74 + (0.6215*t) + ((0.4275*t)-35.75)* Math.pow(v, 0.16)

Note: the formula is not valid if t is larger than 50 in 
absolute value or if v is larger than 120 or less than 3 
(you may assume that the values you get are in that range).*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the temperature t \nwhere t>50");
		double t = utility.inputDouble();
		System.out.println("Enter the speed of wind v \nwhere 3<v<120 ");
		double v = utility.inputDouble();
		double w=0;
		w = 35.74 + (0.6215*t) + ((0.4275*t)-35.75)* Math.pow(v, 0.16);
		System.out.println("Wind Chill = "+w);
	}
}
