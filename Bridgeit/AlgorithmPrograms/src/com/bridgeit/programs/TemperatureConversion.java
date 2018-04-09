/*To the Util Class add temperaturConversion static function, given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa using the formula
Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
Fahrenheit to Celsius:   ((°F − 32) x 5 )/9 = °C
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * 
 * Purpose: Conversion of Celsius to Fahrenheit and vice versa.
 * 
 * @author Kumar Shubham
 * @since  30-03-2018
 *
 */
public class TemperatureConversion {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("1. for Celsius to Fahrenheit\n"
				         + "2. for Fahrenheit to Celsius");
		int ch = utility.inputInteger();
		switch(ch) {
		case 1:
			System.out.println("Enter the Celsius value");
			double c = utility.inputInteger();
			double f = Utility.convertToFahrenheit(c);
			System.out.println(c+" Celsius is "+f+" Fahrenheit");
			break;
		case 2:
			System.out.println("Enter the Fahrenheit value");
			double f1 = utility.inputInteger();
			double c1 = Utility.convertToCelsius(f1);
			System.out.println(f1+" Fahrenheit is "+c1+" Celsius");
			break;
		default:
			System.out.println("Wrong Input");
				break;
		}
	}
}
