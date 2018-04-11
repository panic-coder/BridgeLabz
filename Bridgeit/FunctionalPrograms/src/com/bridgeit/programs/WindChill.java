/**
 * Purpose: Finding the chill in wind.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class WindChill {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int tempCount=0,windCount=0;
		double temperature=0,velocity=0;
		while(tempCount==0) {
		System.out.println("Enter the temperature t \nwhere t>50");
		temperature = utility.inputDouble();
		if(temperature>50)
			tempCount++;
		}
		while(windCount==0) {
		System.out.println("Enter the speed of wind v \nwhere 3<v<120 ");
		velocity = utility.inputDouble();
		if(velocity>3 && velocity<120)
			windCount++;
		}
		double windchill=utility.windChill(temperature,velocity);
		System.out.println("Wind Chill = "+windchill);
	}
}
