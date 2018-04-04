package com.bridgeit.utility;

import java.util.*;

public class Utility {
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
	 * @param s1
	 * @param s2
	 * @return true if Strings are anagram or else false.
	 */
	public static boolean anagram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		s1 = "";
		s2 = "";
		s1 = removeSpace(c1);
		s2 = removeSpace(c2);
		// System.out.println(s1+" "+s2);

		c1 = s1.toCharArray();
		c2 = s2.toCharArray();

		s1 = "";
		s2 = "";
		s1 = toLowerCase(c1);
		s2 = toLowerCase(c2);

		c1 = s1.toCharArray();
		c2 = s2.toCharArray();

		s1 = "";
		s2 = "";
		s1 = sort(c1);
		s2 = sort(c2);

		// System.out.println(s1+" "+s2);
		// System.out.println(s1 + " " + s2);

		/*
		 * for(int i=0;i<c1.length;i++) System.out.print(c1[i]);
		 */

		if (s1.equals(s2))
			return true;
		else
			return false;
	}

	/**
	 * @param c
	 * @return String after sorting the char array and converts it into String.
	 */
	private static String sort(char[] c) {
		String s = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1; j++) {
				if (c[j] > c[j + 1]) {
					char temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < c.length; i++) {
			s = s + c[i];
		}
		return s;
	}

	/**
	 * @param c
	 * @return char array and converts Upper case into Lower case if any.
	 */
	private static String toLowerCase(char[] c) {
		String s = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <= 91) {

				c[i] = (char) (c[i] + 32);
				s = s + c[i];
			} else {
				s = s + c[i];
			}
		}
		return s;
	}

	/**
	 * @param c
	 * @return char array with spaces removed if in between.
	 */
	public static String removeSpace(char[] c) {
		String s = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				s = s + c[i];
			}

		}
		return s;
	}

	/**
	 * @param i
	 * @return true if prime or else false.
	 */
	public static boolean prime(int i) {
		int count = 0;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
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
	 * @param i
	 * @return true if Palindrome or else false
	 */
	public static boolean palindrome(int i) {
		int sum = 0, r, j = i;
		while (i > 0) {
			r = i % 10;
			sum = sum * 10 + r;
			i = i / 10;
		}
		// System.out.println(sum);
		if (j == sum)
			return true;
		else
			return false;
	}

	/**
	 * @param a
	 * @return Sorting of Integer array via Insertion Sort.
	 */
	public static Integer[] insertionSort(Integer[] a) {
		for (int i = 1; i < a.length; i++) {
			Integer ne = a[i];
			int j;
			for (j = i; j > 0 && a[j - 1] > ne; j--) {
				a[j] = a[j - 1];
			}
			a[j] = ne;
		}

		/*
		 * for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		 */
		return a;
	}

	/**
	 * @param a
	 * @return Sorting of String array via Insertion sort.
	 */
	public static String[] insertionSortString(String[] a) {
		for (int i = 1; i < a.length; i++) {
			String ne = a[i];
			int j;
			for (j = i; j > 0 && (a[j - 1].compareTo(ne)) > 0; j--) {
				a[j] = a[j - 1];
			}
			a[j] = ne;
		}

		/*
		 * for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		 */
		return a;
	}

	private static int compare(String s1, String s2) {
		int len = 0;
		if (s1.length() > s2.length()) {
			len = s2.length();
		} else {
			len = s1.length();
		}
		for (int i = 0; i < len; i++) {
			while (i < len && s1.charAt(i) - s2.charAt(i) == 0) {
				i++;
			}
			if (s1.length() == i && s2.length() == i)
				return 0;
			if (s1.length() == i || s2.length() == i) {
				if (s1.length() == i) {
					return -1;
				} else
					return 1;
			}
			return (s1.charAt(i) - s2.charAt(i));

		}
		return 0;
	}

	public static void display(int[] b) {
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

	/**
	 * @param b
	 */
	public static void displayString(String[] b) {
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

	/**
	 * @param <E>
	 * @param d
	 * @return Sorting a integer array via Bubble sort.
	 */
	public static <E> Integer[] bubbleSort(Integer[] d) {
		Integer temp;
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				int result = ((Comparable<Integer>) d[j]).compareTo((Integer) d[j+1]);
				if (result==1) {
					temp = d[j+1];
					d[j+1] = d[j];
					d[j] = temp;
				}
			}
		}
		return (Integer[]) d;
	}
	
	public static <E> void displayArray(E[] array,int n) {
		for(int i=0;i<n;i++) {
			System.out.printf("%s ",array[i]);
		}
	}
	
	/**
	 * @param d
	 * @return Sorting a String array via Bubble Sort.
	 */
	public static String[] bubbleSortString(String[] d) {
		String temp = "";
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				if (compare(d[j], d[j + 1]) > 0) {
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		return d;
	}

	/**
	 * @param <E>
	 * @param a
	 * @param value
	 * @return Check whether element is present or not via Binary Search.
	 */
	@SuppressWarnings("unchecked")
	public static <E> boolean binarySearch(E[] a, Integer value) {
		int start = 0;
		int end = a.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (a[midp] == value) {
				return true;
			} else if ((( (Comparable<Integer>) a[midp]).compareTo(value))>0) {
				start = midp + 1;
			} else {
				end = midp;
			}
		}

		return false;
	}

	/**
	 * @param a
	 * @param value
	 * @return true if String present in String array or else false
	 */
	public static boolean binarySearchString(String[] a, String value) {
		int start = 0;
		int end = a.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (a[midp].equals(value)) {
				return true;
			} else if ((a[midp].compareTo(value)) < 0) {
				start = midp + 1;
			} else {
				end = midp;
			}
		}

		return false;
	}

	public static int[] mergeSort(int[] a, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			a = merge(a, start, mid, end);
		}
		return a;
	}

	private static int[] merge(int[] a, int start, int mid, int end) {
		int p = start, q = mid + 1, k = 0;
		int[] ar = new int[end - start + 1];
		for (int i = start; i <= end; i++) {
			if (p > mid)
				ar[k++] = a[q++];
			else if (q > end)
				ar[k++] = a[p++];
			else if (a[p] < a[q])
				ar[k++] = a[p];
			else
				ar[k++] = a[q++];
		}
		for (int j = 0; j < k; j++) {
			a[start++] = ar[j];
		}
		return ar;
	}

	public static int power(int n, int i) {
		int sum = 1;
		for (int j = 0; j < n; j++) {
			sum = sum * i;
		}
		return sum;
	}

	/**
	 * Search an element using Binary Search
	 * 
	 * @param a
	 * @param value
	 * @return index if found else -1
	 */
	public static int binarySearchOutputBound(int[] a, int value) {
		int start = 0;
		int end = a.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (a[midp] == value) {
				return midp;
			} else if (a[midp] < value) {
				start = midp + 1;
			} else {
				end = midp;
			}
		}
		return -1;
	}

	/**
	 * Finding minimum number of notes coming out for a fulfilling a particular
	 * amount.
	 * 
	 * @param n
	 */
	public static void vendingMachine(int n) {
		int t1000, f500, h100, f50, t20, t10, f5, t2, o1;
		if (n < 0) {
			return;
		} else if (n >= 1000) {
			t1000 = n / 1000;
			n = n % 1000;
			System.out.println("Thousand Notes = " + t1000);
			vendingMachine(n);
		} else if (n >= 500) {
			f500 = n / 500;
			n = n % 500;
			System.out.println("Five hundred Notes = " + f500);
			vendingMachine(n);
		} else if (n >= 100) {
			h100 = n / 100;
			n = n % 100;
			System.out.println("One hundred Notes = " + h100);
			vendingMachine(n);
		} else if (n >= 50) {
			f50 = n / 50;
			n = n % 50;
			System.out.println("Fifty Notes = " + f50);
			vendingMachine(n);
		} else if (n >= 20) {
			t20 = n / 20;
			n = n % 20;
			System.out.println("Twenty Notes = " + t20);
			vendingMachine(n);
		} else if (n >= 10) {
			t10 = n / 10;
			n = n % 10;
			System.out.println("Ten Notes = " + t10);
			vendingMachine(n);
		} else if (n >= 5) {
			f5 = n / 5;
			n = n % 5;
			System.out.println("Five Notes = " + f5);
			vendingMachine(n);
		} else if (n >= 2) {
			t2 = n / 2;
			n = n % 2;
			System.out.println("Two Notes = " + t2);
			vendingMachine(n);
		} else if (n >= 1) {
			o1 = n / 1;
			n = n % 1;
			System.out.println("One Note = " + o1);
			vendingMachine(n);
		}
	}

	/**
	 * Find the day using Gregorian calendar Formula
	 * 
	 * @param m
	 * @param d
	 * @param y
	 * @return 0-6 for days of week.
	 */
	public static int dayOfWeek(int m, int d, int y) {
		int m1, d1, y1;
		y1 = y - (14 - m) / 12;
		int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m1 = m + 12 * ((14 - m) / 12) - 2;
		d1 = (d + x + (31 * m1) / 12) % 7;
		return d1;
	}

	/**
	 * @param c
	 * @return Fahrenheit value.
	 */
	public static double celsiusToFahrenheit(double c) {
		return ((c * (9 / 5)) + 35);
	}

	/**
	 * @param f1
	 * @return Celsius value.
	 */
	public static double fahrenheitToCelsius(double f1) {
		return (((f1 - 32) * 5) / 9);
	}

	/**
	 * @param p
	 * @param r
	 * @param n
	 * @return the payment per month.
	 */
	public static double monthlyPayment(double p, double r, double n) {
		return ((p * r) / (1 - 1 / (powerDouble((1 + r), (n)))));
	}

	/**
	 * @param i
	 * @param n
	 * @return return the power of i^n and in double data type.
	 */
	private static double powerDouble(double i, double n) {

		double sum = 1;
		for (int j = 0; j < n; j++) {
			sum = sum * i;
		}
		return sum;

	}

	/**
	 * @param c
	 */
	public static void sqrt(double c) {
		double t=0;
		t = c;
		double epsilon = 1e-15;
		do {
			t = ((c / t) + t) / 2;
		}while((Math.abs(t - (c / t))) > (epsilon * t));
		/*
		 * for(t=c;Math.abs(t - c/t) > (epsilon*t );) { t=((c/t)+c)/2;
		 * System.out.println("1"); }
		 */
		System.out.println(t);
	}

	/**
	 * @param n
	 * @return binary of the given decimal.
	 */
	public static String toBinary(int n) {
		String s = "";
		int r;
		while (n > 0) {
			r = n % 2;
			s = s + r;
			n = n / 2;
		}
		String rev = "";
		char[] c = s.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			rev = rev + c[i];
		}
		return rev;
	}

	/**
	 * @param s
	 * @return returns swapped nibbles
	 */
	public static String swapNibble(String s) {
		char[] c = s.toCharArray();
		String st = "";

		for (int i = c.length / 2; i < c.length; i++) {
			st = st + c[i];
		}
		if (((c.length / 2) - 1) < 3)
			st = st + "0";
		for (int i = 0; i < (c.length / 2); i++) {
			st = st + c[i];
		}
		return st;
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

	public static void anagram(int[] prime) {
		boolean z;
		int count=0,countAna=0;
		for(int i=0;i<prime.length;i++) {
			for(int j=i+1;j<prime.length;j++) {
				z=numberCheck(prime[i],prime[j]);
				//System.out.println(z);
				
				if(z && count==0) {
					//System.out.println(prime[i]);
					//System.out.println(prime[j]);
					countAna++;
					count++;
					z=false;
				}
				
			}
			if(count>0) {
				//System.out.println(prime[i]);
			countAna++;
			count=0;
			}
		}
		int[] anagramTotal = new int[countAna];
		int x=0;
		//System.out.println(countAna+" count");
		for(int i=0;i<prime.length;i++) {
			for(int j=i+1;j<prime.length;j++) {
				z=numberCheck(prime[i],prime[j]);
				//System.out.println(z);
				
				if(z && count==0) {
					//System.out.println(prime[i]);
					//System.out.println(prime[j]);
					anagramTotal[x]=prime[j];
					x++;
					count++;
					z=false;
				}
				
			}
			if(count>0) {
				//System.out.println(prime[i]);
				anagramTotal[x]=prime[i];
				x++;
			count=0;
			}
		}
		
		System.out.println("====");
		for(int i=0;i<anagramTotal.length;i++) {
			for(int j=0;j<anagramTotal.length-1;j++) {
				if(anagramTotal[j]>anagramTotal[j+1]) {
					int temp = anagramTotal[j];
					anagramTotal[j] = anagramTotal[j+1];
					anagramTotal[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<anagramTotal.length;i++) {
			for(int j=0;j<anagramTotal.length-1;j++) {
				if(anagramTotal[j]==anagramTotal[j+1]) {
					anagramTotal[j+1]=-1;
				}
			}
		}
		
		for(int i=0;i<anagramTotal.length;i++) {
			if(anagramTotal[i]!=-1)
				System.out.println(anagramTotal[i]);
		}
		/*for(int i=0;i<total.length;i++) {
			if(total[i]!=-1) {
				System.out.println(total[i]);
			}
		}*/
	}

	public static boolean numberCheck(int i, int j) {
		String a = Integer.toString(i);
		String b = Integer.toString(j);
		char c[] = a.toCharArray();
		char d[] = b.toCharArray();
		a = arrange(c);
		b = arrange(d);
		return a.equals(b);
	}

	public static String arrange(char[] c) {
		String s = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1; j++) {
				if (c[j] > c[j + 1]) {
					char temp = c[j];
					c[j] = c[j + 1];
					c[j + 1] = temp;
				}

			}
		}
		for (int i = 0; i < c.length; i++) {
			s = s + c[i];
		}
		return s;
	}
	
	

}
