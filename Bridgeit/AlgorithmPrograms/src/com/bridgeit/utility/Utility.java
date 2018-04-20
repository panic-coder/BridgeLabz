package com.bridgeit.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Utility<T> {
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

	/**
	 * Checking anagram of two strings
	 * 
	 * @param word1
	 * @param word2
	 * @return true if Strings are anagram or else false.
	 */
	public static boolean checkAnagram(String word1, String word2) {

		word1 = sort(word1.replaceAll("\\s+", "").toLowerCase().toCharArray());
		word2 = sort(word2.replaceAll("\\s+", "").toLowerCase().toCharArray());

		if (word1.equals(word2))
			return true;
		else
			return false;
	}

	/**
	 * Sorting character array alphabetically
	 * 
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
	 * Converting upper case elements of character array to lower case if any
	 * 
	 * @param charArray
	 * @return char array and converts Upper case into Lower case if any.
	 */
	public static String toLowerCase(char[] charArray) {
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
	 * Removing spaces in a character array
	 * 
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
	 * Finding if a number is prime or not
	 * 
	 * @param number
	 * @return true if number is prime or else false.
	 */
	public boolean isPrimeNumber(int number) {
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
	 * Finding if a number is Palindrome or not
	 * 
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
		if (numberCopy == sum)
			return true;
		else
			return false;
	}

	/**
	 * Taking input for integer array
	 * 
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
	 * Taking input for String array
	 * 
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
	 * Generic Insertion Sort algorithm
	 * 
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
	 * Generic Bubble Sort algorithm
	 * 
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
	 * Generic Binary Search algorithm
	 * 
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
	 * Generic method to display array
	 * 
	 * @param array
	 * @param size
	 */
	public static <T> void displayArray(T[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.printf("%s ", array[i]);
		}
	}

	/**
	 * Calculating power of a number
	 * 
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
	public static void binarySearchOutputBound(int[] array) {
		int start = 0;
		Utility utility = new Utility();
		int end = array.length;
		int midp = (start + end) / 2;
		while (start < end) {
			if (start == end - 1)
				break;
			if (start != ((start + end) / 2) - 1 && ((start + end) / 2) != end - 1) {
				System.out.println("You are between " + (start) + " and " + (end - 1) + "\nEnter false for " + ""
						+ start + " to " + (((start + end) / 2) - 1) + "  " + "\nor true for " + (((start + end) / 2))
						+ " to " + (end - 1));
			} else
				System.out.println("false for " + start + " and true for " + (end - 1));
			boolean b = utility.inputBoolean();
			if (end - start == 1) {
				if (b) {
					midp = end;
				} else
					midp = start;
				break;
			}
			if (end - start == 2) {
				if (b) {
					midp = end - 1;
				} else
					midp = start;
				break;
			}
			midp = ((start + end) / 2);
			if (b == true) {
				start = midp;
			} else if (b == false) {
				end = midp;
			}
		}
		System.out.println("Your Number is : " + (array[midp]));
	}

	/**
	 * Finding minimum number of notes coming out for a fulfilling a particular
	 * amount.
	 * 
	 * @param amount
	 */
	public static void getNotes(int amount) {
		int[] notes = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int[] notesCount = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < notes.length; i++) {
			if (amount < 0)
				return;
			else if (amount >= notes[i]) {
				notesCount[i] = amount / notes[i];
				amount = amount % notes[i];
			}
		}
		for (int i = 0; i < notes.length; i++) {
			System.out.println(notes[i] + " notes : " + notesCount[i]);
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
	 * Conversion of Celsius to Fahrenheit
	 * 
	 * @param celsius
	 * @return Fahrenheit value.
	 */
	public static double convertToFahrenheit(double celsius) {
		return ((celsius * (9.0 / 5)) + 32);
	}

	/**
	 * Conversion of Fahrenheit to Celsius
	 * 
	 * @param fahrenheit
	 * @return Celsius value.
	 */
	public static double convertToCelsius(double fahrenheit) {
		return (((fahrenheit - 32) * 5) / 9);
	}

	/**
	 * Calculation of monthly payment of a
	 * 
	 * @param principal
	 * @param rate
	 * @param time
	 * @return the payment per month.
	 */
	public static double getMonthlyPayment(double principal, double rate, double time) {
		return ((principal * rate) / (1 - 1 / (powerDouble((1 + rate), (time)))));
	}

	/**
	 * Finding the power of double value
	 * 
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
	 * Finding square root using Newton's method
	 * 
	 * @param c
	 */
	public static void sqrt(double c) {
		double t = 0;
		t = c;
		double epsilon = 1e-15;
		do {
			t = ((c / t) + t) / 2;
		} while ((Math.abs(t - (c / t))) > (epsilon * t));
		System.out.println(t);
	}

	/**
	 * Finding the Binary of Entered Decimal Number
	 * 
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
	 * Swapping nibbles of the binary input
	 * 
	 * @param binaryInput
	 * @return returns swapped nibbles
	 */
	public static String swapNibble(String binaryInput) {
		char[] c = binaryInput.toCharArray();
		String swapedNibbles = "";
		if (c.length < 8) {
			int count = 8 - c.length;
			while (count > 0) {
				swapedNibbles += "0";
				count--;
			}
		}
		for (int i = 0; i < c.length; i++) {
			swapedNibbles += c[i];
		}
		c = swapedNibbles.toCharArray();
		swapedNibbles = "";
		System.out.println(swapedNibbles);
		for (int i = c.length / 2; i < c.length; i++) {

			swapedNibbles = swapedNibbles + c[i];
		}
		for (int i = 0; i < (c.length / 2); i++) {
			swapedNibbles = swapedNibbles + c[i];
		}
		return swapedNibbles;
	}

	/**
	 * Changing from binary to decimal
	 * 
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

				if (z && count == 0) {
					countAnagram++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				countAnagram++;
				count = 0;
			}
		}
		int[] anagramTotal = new int[countAnagram];
		int x = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = checkForEquality(prime[i], prime[j]);

				if (z && count == 0) {
					anagramTotal[x] = prime[j];
					x++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
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
	}

	/**
	 * Check equality of the number
	 * 
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
	 * Arrange the items in ascending order
	 * 
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

	/**
	 * Reading from file
	 * 
	 * @return String in the file
	 * @throws IOException
	 */
	public String readFile() throws IOException {
		File file = new File("/home/bridgeit/eclipse-workspace/Bridgeit/AlgorithmPrograms/file");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		String st;
		int i = 0;
		int j = 0;
		while ((st = br.readLine()) != null) {
			str = str + st;
		}
		System.out.println(str);
		br.close();
		return str;
	}

	public void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
