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

	public static String removeSpace(char[] c) {
		String s = "";
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				s = s + c[i];
			}

		}
		return s;
	}

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

	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int ne = a[i];
			int j;
			for (j = i; j > 0 && a[j - 1]>ne; j--) {
				a[j] = a[j - 1];
			}
			a[j] = ne;
		}

		/*
		 * for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
		 */
		return a;
	}
	
	public static String[] insertionSortString(String[] a) {
		for (int i = 1; i < a.length; i++) {
			String ne = a[i];
			int j;
			for (j = i; j > 0 && compare(a[j - 1],ne)>0; j--) {
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
		int len=0;
		if(s1.length()>s2.length())
		{
			len=s2.length();
		}
		else {
			len=s1.length();
		}
		for (int i = 0; i < len; i++) { 
			while(i<len&&s1.charAt(i)-s2.charAt(i)==0)///go inside
			{
				i++;
			}
			if(s1.length()==i&&s2.length()==i)//both are equal
				return 0;
			if(s1.length()==i||s2.length()==i) {
				if(s1.length()==i) {
					return -1;//according to length return
				}
				else return 1;
			}
			return (s1.charAt(i)-s2.charAt(i));//return the value
			
		}
		return 0;
	}

	public static void display(int[] b) {
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

	public static void displayString(String[] b) {
		for (int i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
	}

	public static int[] bubbleSort(int[] d) {
		int temp = 0;
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				if (d[j] > d[j + 1]) {
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		return d;
	}
	
	public static String[] bubbleSortString(String[] d) {
		String temp = "";
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length - 1; j++) {
				if (compare(d[j] , d[j + 1])>0) {
					temp = d[j];
					d[j] = d[j + 1];
					d[j + 1] = temp;
				}
			}
		}
		return d;
	}


	public static boolean binarySearch(int[] a, int value) {
		int start = 0;
		int end = a.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (a[midp] == value) {
				return true;
			} else if (a[midp] < value) {
				start = midp+1;
			} else {
				end = midp;
			}
		}

		return false;
	}
	
	public static boolean binarySearchString(String[] a, String value) {
		int start = 0;
		int end = a.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (a[midp].equals(value)) {
				return true;
			} else if (compare(a[midp], value)<0) {
				start = midp+1;
			} else {
				end = midp;
			}
		}

		return false;
	}
}
