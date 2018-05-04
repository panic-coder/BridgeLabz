package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scanner;
	Random random;

	public Utility() {
		scanner = new Scanner(System.in);
		random = new Random();
	}

	/**
	 * Generating Random Numbers with bound
	 * 
	 * @param bound
	 * @return generated Random Number
	 */
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	/**
	 * Generating Random Numbers without bound
	 * 
	 * @return generated Random Number
	 */
	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for String
	 * 
	 * @return INPUT STRING
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	
	/**
	 * Takes input with the user via Scanner for StringLine
	 * 
	 * @return INPUT STRING LINE
	 */
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for Integer
	 * 
	 * @return INPUT INTEGER
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Double
	 * 
	 * @return INPUT DOUBLE
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Boolean
	 * 
	 * @return INPUT BOOLEAN
	 */
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}


}
