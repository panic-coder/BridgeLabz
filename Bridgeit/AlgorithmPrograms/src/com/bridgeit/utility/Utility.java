package com.bridgeit.utility;

import java.util.*;

public class Utility<T> {
	Scanner scanner;
	Random random;

	public Utility() {
		scanner = new Scanner(System.in);
		random = new Random();
	}

	// RANDOM Numbers
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT STRING_LINE
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT Double
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT Boolean
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	/**
	 * @param word1
	 * @param word2
	 * @return true if Strings are anagram or else false.
	 */
	public static boolean checkAnagram(String word1, String word2) {
		char[] c1 = word1.toCharArray();
		char[] c2 = word2.toCharArray();

		word1 = "";
		word2 = "";
		word1 = removeSpace(c1);
		word2 = removeSpace(c2);
		// System.out.println(s1+" "+s2);

		c1 = word1.toCharArray();
		c2 = word2.toCharArray();

		word1 = "";
		word2 = "";
		word1 = toLowerCase(c1);
		word2 = toLowerCase(c2);

		c1 = word1.toCharArray();
		c2 = word2.toCharArray();

		word1 = "";
		word2 = "";
		word1 = sort(c1);
		word2 = sort(c2);

		// System.out.println(s1+" "+s2);
		// System.out.println(s1 + " " + s2);

		/*
		 * for(int i=0;i<c1.length;i++) System.out.print(c1[i]);
		 */

		if (word1.equals(word2))
			return true;
		else
			return false;
	}

	/**
	 * @param charArray
	 * @return String after sorting the char array and converts it into String.
	 */
	private static String sort(char[] charArray) {
		String s = "";
		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < charArray.length - 1; j++) {
				if (charArray[j] > charArray[j + 1]) {
					char temp = charArray[j];
					charArray[j] = charArray[j + 1];
					charArray[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < charArray.length; i++) {
			s = s + charArray[i];
		}
		return s;
	}

	/**
	 * @param charArray
	 * @return char array and converts Upper case into Lower case if any.
	 */
	private static String toLowerCase(char[] charArray) {
		String s = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 91) {

				charArray[i] = (char) (charArray[i] + 32);
				s = s + charArray[i];
			} else {
				s = s + charArray[i];
			}
		}
		return s;
	}

	/**
	 * @param charArray
	 * @return char array with spaces removed if in between.
	 */
	public static String removeSpace(char[] charArray) {
		String s = "";
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				s = s + charArray[i];
			}

		}
		return s;
	}

	/**
	 * @param number
	 * @return true if number is prime or else false.
	 */
	public static boolean isPrimeNumber(int number) {
		int count = 0;
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			return true;
		} else
			return false;
	}

	/**
	 * @param number
	 * @return true if Palindrome or else false
	 */
	public static boolean isPalindrome(int number) {
		int sum = 0, r;
		int numberCopy = number;
		while (number > 0) {
			r = number % 10;
			sum = sum * 10 + r;
			number = number / 10;
		}
		// System.out.println(sum);
		if (numberCopy == sum)
			return true;
		else
			return false;
	}

	/**
	 * @param size
	 * @return takes integer input up to the size and return it
	 */
	public Integer[] getInputInt(int size) {
		Integer[] array = new Integer[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			array[i] = inputInteger();
		}
		return array;
	}

	/**
	 * @param size
	 * @return takes string input up to the size and return it
	 */
	public String[] getInputString(int size) {
		String[] array = new String[size];
		System.out.println("Enter " + size + " elements");
		for (int i = 0; i < size; i++) {
			array[i] = inputString();
		}
		return array;
	}

	/**
	 * @param array
	 * @return Sorting of String array via Insertion sort.
	 */
	public static <T extends Comparable<T>> T[] insertionSort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			T ne = array[i];
			int j;
			for (j = i; j > 0 && (array[j - 1].compareTo(ne)) > 0; j--) {
				array[j] = array[j - 1];
			}
			array[j] = ne;
		}
		return array;
	}

	/**
	 * @param <T>
	 * @param array
	 * @return Sorting a integer array via Bubble sort.
	 */
	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
		T temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if ((array[j]).compareTo(array[j + 1]) > 0) {
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * @param <T>
	 * @param array
	 * @param value
	 * @return Check whether element is present or not via Binary Search.
	 */
	public static <T extends Comparable<T>> boolean binarySearch(T[] array, T value) {
		int start = 0;
		int end = array.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (array[midp].equals(value)) {
				return true;
			} else if (((array[midp]).compareTo(value)) < 0) {
				start = midp + 1;
			} else {
				end = midp;
			}
		}
		return false;
	}

	/**
	 * @param array
	 * @param size
	 */
	public static <T> void displayArray(T[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.printf("%s ", array[i]);
		}
	}

	/**
	 * @param array
	 * @param start
	 * @param end
	 * @return sorted array via merge sort
	 */
	public static int[] mergeSort(int[] array, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			array = merge(array, start, mid, end);
		}
		return array;
	}

	/**
	 * @param array
	 * @param start
	 * @param middle
	 * @param end
	 * @return merging done by merge sort
	 */
	private static int[] merge(int[] array, int start, int middle, int end) {
		int p = start, q = middle + 1, k = 0;
		int[] ar = new int[end - start + 1];
		for (int i = start; i <= end; i++) {
			if (p > middle)
				ar[k++] = array[q++];
			else if (q > end)
				ar[k++] = array[p++];
			else if (array[p] < array[q])
				ar[k++] = array[p];
			else
				ar[k++] = array[q++];
		}
		for (int j = 0; j < k; j++) {
			array[start++] = ar[j];
		}
		return ar;
	}

	/**
	 * @param exponent
	 * @param number
	 * @return power of number to the given exponent
	 */
	public static int power(int exponent, int number) {
		int sum = 1;
		for (int j = 0; j < exponent; j++) {
			sum = sum * number;
		}
		return sum;
	}

	/**
	 * Search an element using Binary Search
	 * 
	 * @param array
	 * @param value
	 * @return true or false
	 */
	public static boolean binarySearchOutputBound(int[] array, int value) {
		int start = 0;
		Utility utility = new Utility();
		int end = array.length;
		while (start < end) {
			System.out.println("Enter true for higher bound and\nfalse for lower bound");
			boolean b = utility.inputBoolean();
			int midp = (start + end) / 2;
			if (array[midp] == (value)) {
				if (b)
					System.out.println("You were right \nNumber Found");
				else
					System.out.println("You were wrong\nbut number Found");
				return true;
			} else if ((array[midp]) < (value)) {
				if (b)
					System.out.println("You were right");
				else
					System.out.println("You were wrong");
				start = midp + 1;
			} else {
				if (!b)
					System.out.println("You were right");
				else
					System.out.println("You were wrong");
				end = midp;
				// break;
			}
		}
		System.out.println("Number not found");
		return false;
	}

	/**
	 * Finding minimum number of notes coming out for a fulfilling a particular
	 * amount.
	 * 
	 * @param amount
	 */
	public static void getNotes(int amount) {
		int thousandNotes, fiveHundredNotes, hundredNotes, fiftyNotes, twentyNotes, tenNotes, fiveNotes, twoNotes,
				oneNotes;
		if (amount < 0) {
			return;
		} else if (amount >= 1000) {
			thousandNotes = amount / 1000;
			amount = amount % 1000;
			System.out.println("Thousand Notes = " + thousandNotes);
			getNotes(amount);
		} else if (amount >= 500) {
			fiveHundredNotes = amount / 500;
			amount = amount % 500;
			System.out.println("Five hundred Notes = " + fiveHundredNotes);
			getNotes(amount);
		} else if (amount >= 100) {
			hundredNotes = amount / 100;
			amount = amount % 100;
			System.out.println("One hundred Notes = " + hundredNotes);
			getNotes(amount);
		} else if (amount >= 50) {
			fiftyNotes = amount / 50;
			amount = amount % 50;
			System.out.println("Fifty Notes = " + fiftyNotes);
			getNotes(amount);
		} else if (amount >= 20) {
			twentyNotes = amount / 20;
			amount = amount % 20;
			System.out.println("Twenty Notes = " + twentyNotes);
			getNotes(amount);
		} else if (amount >= 10) {
			tenNotes = amount / 10;
			amount = amount % 10;
			System.out.println("Ten Notes = " + tenNotes);
			getNotes(amount);
		} else if (amount >= 5) {
			fiveNotes = amount / 5;
			amount = amount % 5;
			System.out.println("Five Notes = " + fiveNotes);
			getNotes(amount);
		} else if (amount >= 2) {
			twoNotes = amount / 2;
			amount = amount % 2;
			System.out.println("Two Notes = " + twoNotes);
			getNotes(amount);
		} else if (amount >= 1) {
			oneNotes = amount / 1;
			amount = amount % 1;
			System.out.println("One Note = " + oneNotes);
			getNotes(amount);
		}
	}

	/**
	 * Find the day using Gregorian calendar Formula
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return 0-6 for days of week.
	 */
	public static int getDayOfWeek(int month, int day, int year) {
		int calculationMonth, calculationDay, calculationYear;
		calculationYear = year - (14 - month) / 12;
		int x = calculationYear + (calculationYear / 4) - (calculationYear / 100) + (calculationYear / 400);
		calculationMonth = month + 12 * ((14 - month) / 12) - 2;
		calculationDay = (day + x + (31 * calculationMonth) / 12) % 7;
		return calculationDay;
	}

	/**
	 * @param celsius
	 * @return Fahrenheit value.
	 */
	public static double convertToFahrenheit(double celsius) {
		return ((celsius * (9 / 5)) + 32);
	}

	/**
	 * @param fahrenheit
	 * @return Celsius value.
	 */
	public static double convertToCelsius(double fahrenheit) {
		return (((fahrenheit - 32) * 5) / 9);
	}

	/**
	 * @param principal
	 * @param rate
	 * @param time
	 * @return the payment per month.
	 */
	public static double getMonthlyPayment(double principal, double rate, double time) {
		return ((principal * rate) / (1 - 1 / (powerDouble((1 + rate), (time)))));
	}

	/**
	 * @param number
	 * @param exponent
	 * @return return the power of i^n and in double data type.
	 */
	private static double powerDouble(double number, double exponent) {

		double sum = 1;
		for (int j = 0; j < exponent; j++) {
			sum = sum * number;
		}
		return sum;

	}

	/**
	 * @param c
	 */
	public static void sqrt(double c) {
		double t = 0;
		t = c;
		double epsilon = 1e-15;
		do {
			t = ((c / t) + t) / 2;
		} while ((Math.abs(t - (c / t))) > (epsilon * t));
		/*
		 * for(t=c;Math.abs(t - c/t) > (epsilon*t );) { t=((c/t)+c)/2;
		 * System.out.println("1"); }
		 */
		System.out.println(t);
	}

	/**
	 * @param decimalNumber
	 * @return binary of the given decimal.
	 */
	public static String toBinary(int decimalNumber) {
		String answerInBinary = "";
		int remainder;
		while (decimalNumber > 0) {
			remainder = decimalNumber % 2;
			answerInBinary = answerInBinary + remainder;
			decimalNumber = decimalNumber / 2;
		}
		String reverse = "";
		char[] reverseAnswer = answerInBinary.toCharArray();
		for (int i = reverseAnswer.length - 1; i >= 0; i--) {
			reverse = reverse + reverseAnswer[i];
		}
		return reverse;
	}

	/**
	 * @param binaryInput
	 * @return returns swapped nibbles
	 */
	public static String swapNibble(String binaryInput) {
		char[] c = binaryInput.toCharArray();
		String swapedNibbles = "";

		for (int i = c.length / 2; i < c.length; i++) {
			swapedNibbles = swapedNibbles + c[i];
		}
		if (((c.length / 2) - 1) < 3)
			swapedNibbles = swapedNibbles + "0";
		for (int i = 0; i < (c.length / 2); i++) {
			swapedNibbles = swapedNibbles + c[i];
		}
		return swapedNibbles;
	}

	/**
	 * @param nibbleS
	 * @return decimal to the binary.
	 */
	public static int binaryToDecimal(String nibbleS) {
		int sum = 0, p = 0;
		for (int i = nibbleS.length() - 1; i >= 0; i--) {

			if (nibbleS.charAt(i) == '1') {
				sum = sum + power(p, 2);
			}
			p++;
		}
		return sum;
	}

	/**
	 * Purpose: Checks prime numbers up to 1000 are anagram or not
	 * 
	 * @param prime
	 */
	public static void anagram(int[] prime) {
		boolean z;
		int count = 0, countAnagram = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = checkForEquality(prime[i], prime[j]);
				// System.out.println(z);

				if (z && count == 0) {
					// System.out.println(prime[i]);
					// System.out.println(prime[j]);
					countAnagram++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				// System.out.println(prime[i]);
				countAnagram++;
				count = 0;
			}
		}
		int[] anagramTotal = new int[countAnagram];
		int x = 0;
		// System.out.println(countAna+" count");
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = checkForEquality(prime[i], prime[j]);
				// System.out.println(z);

				if (z && count == 0) {
					// System.out.println(prime[i]);
					// System.out.println(prime[j]);
					anagramTotal[x] = prime[j];
					x++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				// System.out.println(prime[i]);
				anagramTotal[x] = prime[i];
				x++;
				count = 0;
			}
		}

		System.out.println("====");
		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] > anagramTotal[j + 1]) {
					int temp = anagramTotal[j];
					anagramTotal[j] = anagramTotal[j + 1];
					anagramTotal[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			for (int j = 0; j < anagramTotal.length - 1; j++) {
				if (anagramTotal[j] == anagramTotal[j + 1]) {
					anagramTotal[j + 1] = -1;
				}
			}
		}

		for (int i = 0; i < anagramTotal.length; i++) {
			if (anagramTotal[i] != -1)
				System.out.println(anagramTotal[i]);
		}
		/*
		 * for(int i=0;i<total.length;i++) { if(total[i]!=-1) {
		 * System.out.println(total[i]); } }
		 */
	}

	/**
	 * @param firstValue
	 * @param secondValue
	 * @return true if firstValue and secondValue are equal or else false
	 */
	public static boolean checkForEquality(int firstValue, int secondValue) {
		String firstValueString = Integer.toString(firstValue);
		String secondValueString = Integer.toString(secondValue);
		char firstValueCharArray[] = firstValueString.toCharArray();
		char secondValueCharArray[] = secondValueString.toCharArray();
		firstValueString = arrange(firstValueCharArray);
		secondValueString = arrange(secondValueCharArray);
		return firstValueString.equals(secondValueString);
	}

	/**
	 * @param item
	 * @return arranged in ascending order
	 */
	public static String arrange(char[] item) {
		String arrangedItem = "";
		for (int i = 0; i < item.length; i++) {
			for (int j = 0; j < item.length - 1; j++) {
				if (item[j] > item[j + 1]) {
					char temp = item[j];
					item[j] = item[j + 1];
					item[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < item.length; i++) {
			arrangedItem = arrangedItem + item[i];
		}
		return arrangedItem;
	}

	/*
	 * @Override public int compareTo(Object o) { // TODO Auto-generated method stub
	 * return 0; }
	 */

}
