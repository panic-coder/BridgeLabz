package com.bridgeit.utility;

import com.bridgeit.programs.*;

import java.io.*;
import java.util.*;

import com.bridgeit.programs.LinkedList;
import com.bridgeit.programs.Node;

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

	public static void calender(int month, int year) {
		int year1, month1, x, day = 1, day1;
		year1 = year - (14 - month) / 12;
		x = year1 + (year1 / 4) - (year1 / 100) + (year1 / 400);
		month1 = month + 12 * ((14 - month) / 12) - 2;
		day1 = (day + x + (31 * month1) / 12) % 7;
		String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthDay = 0;
		for (int i = 0; i < monthDays.length; i++) {
			if (i == month - 1) {
				monthDay = monthDays[i];
			}
		}
		int[][] totalDays = new int[6][7];
		boolean leap = leapYear(year);
		if (leap) {
			monthDay = 29;
		}
		int z = 1;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					totalDays[i][j] = -1;
				} else if (z <= monthDay) {
					totalDays[i][j] = z;
					z++;
				} else {
					totalDays[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) {
			if (month == i + 1) {
				System.out.print(monthName[i] + " " + year);
			}
		}
		System.out.println();
		String[] dayName = { "S", "M", "T", "W", "T", "F", "S" };
		for (int i = 0; i < 7; i++) {
			System.out.print(dayName[i] + "  ");
		}
		System.out.println();
		// System.out.println(day1);
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (totalDays[i][j] != -1) {
					if (totalDays[i][j] < 10)
						System.out.print(totalDays[i][j] + "  ");
					else
						System.out.print(totalDays[i][j] + " ");
				} else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	public static boolean leapYear(int year) {
		if (year % 100 != 0 && year % 4 == 0) {
			return true;
			// System.out.println(year+" is a leap year");
		} else if (year % 100 == 0 && year % 400 == 0) {
			return true;
			// System.out.println(year+" is a leap year");
		} else {
			return false;
			// System.out.println(year+" is not a leap year");
		}
	}

	public static void prime2DArray() {
		int[][] array = new int[10][100];
		int z = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = z;
				z++;
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (isPrime(array[i][j])) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	private static boolean isPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0)
			return true;
		else
			return false;
	}

	private static String st;

	public static void unOrderedList(String userInput) throws Exception {
		LinkedList<String> list = new LinkedList<String>();
		File file = new File("/home/bridgeit/eclipse-workspace/Bridgeit/DataStructurePrograms/UnOrderedList");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		while ((st = br.readLine()) != null) {
			str = str + st;
		}
		br.close();
		// System.out.println(str);
		for (String fileString : str.split("\\s", 0)) {
			// System.out.println(fileString);
			list.add(fileString);
		}
		System.out.println("Before Search");
		System.out.println("=====");
		list.display();
		boolean b = list.search(userInput);
		if (b) {
			// System.out.println(b);
			list.remove(userInput);
		} else {
			// System.out.println(b);
			list.add(userInput);
		}
		System.out.println("=====");
		System.out.println("After Search");
		System.out.println("=====");
		list.display();
		try {
			FileWriter writer = new FileWriter("UnOrderedListOutput.txt", true);
			writer.write("Hello World");

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		st = "";
	}

	static String stint;

	public static void orderedList(String searchItem) throws Exception {
		LinkedList<String> list = new LinkedList<String>();
		File file = new File("/home/bridgeit/eclipse-workspace/Bridgeit/DataStructurePrograms/OrderedList");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = "";
		while ((stint = br.readLine()) != null) {
			str = str + stint;
		}
		br.close();
		for (String fileInt : str.split("\\s", 0)) {
			// System.out.println(fileString);
			list.add(fileInt);
		}
		System.out.println("Before Search");
		System.out.println("=====");
		list.display();
		boolean b = list.search(searchItem);
		if (b) {
			list.remove(searchItem);
		} else {
			list.add(searchItem);
		}
		System.out.println("=====");
		System.out.println("After Search");
		System.out.println("=====");
		list.display();
	}

	static Utility utility = new Utility();

	public int bankCashCounter(int size) {
		int cashBalance = 1000000;
		int size1 = size;
		MyQueue<Integer> queue = new MyQueue<Integer>(size);
		for (int i = 0; i < size; i++)
			queue.enqueue(i);
		// int z=0;
		while (size1 > 0) {
			int count = 0, option = 0;

			while (count == 0) {

				System.out.println("1. for Withdrawal \n2. for Deposit");
				option = utility.inputInteger();
				if (option == 1 || option == 2)
					count++;
			}
			if (option == 1) {
				int amount = 0;
				int countW = 0;
				while (countW == 0) {
					System.out.println("Enter the amount for withdraw\nless than 40,000");
					amount = utility.inputInteger();
					if (amount <= 40000)
						countW++;
				}
				cashBalance = cashBalance - amount;
				queue.dequeue();
			} else if (option == 2) {
				int amount = 0;
				int countD = 0;
				while (countD == 0) {
					System.out.println("Enter the amount to deposit");
					amount = utility.inputInteger();
					if (amount <= 100000)
						countD++;
				}
				cashBalance = cashBalance + amount;
				queue.dequeue();
			}
			size1--;
		}
		return cashBalance;
	}

	public static boolean palindromeChecker(String word) {
		MyDeque<Character> dq = new MyDeque<Character>();
		char[] c = word.toCharArray();
		for (int i = 0; i < c.length; i++) {
			// if(i>2)
			dq.addFront(c[i]);
			// else dq.addLast(c[i]);
		}
		/*
		 * int j = dq.size(); System.out.println(j); dq.display(); dq.removeLast();
		 * System.out.println("==="); dq.display(); dq.removeLast();
		 * System.out.println("===");
		 */
		// dq.display();
		String s = "";
		for (int i = 0; i < c.length; i++) {
			Node<Character> ch = dq.removeFront();
			// System.out.println(ch.data);
			s = s + ch.data;
		}
		System.out.println(s);
		if (s.equals(word))
			return true;
		else
			return false;
	}

	public static void hashing(Integer size) {
		Integer[] arr = new Integer[size];
		String y;
		do {
			System.out.println("Enter a number to be inserted");
			Integer number = utility.inputInteger();
			hashAdd(number, size);
			System.out.println("y for entering numbers\nno for exit");
			y = utility.inputString();
		} while (y == "y");
	}

	private static void hashAdd(Integer number, Integer size) {

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

	public static void primeAnagram2DArray(int[] prime) {
		boolean z;
		int count = 0, countAna = 0;
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);
				// System.out.println(z);

				if (z && count == 0) {
					// System.out.println(prime[i]);
					// System.out.println(prime[j]);
					countAna++;
					count++;
					z = false;
				}

			}
			if (count > 0) {
				// System.out.println(prime[i]);
				countAna++;
				count = 0;
			}
		}
		int[] anagramTotal = new int[countAna];
		int x = 0;
		// System.out.println(countAna+" count");
		for (int i = 0; i < prime.length; i++) {
			for (int j = i + 1; j < prime.length; j++) {
				z = numberCheck(prime[i], prime[j]);
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
		int positive=0;
		  for(int i=0;i<anagramTotal.length;i++) { 
			  if(anagramTotal[i]!=-1) {
				  //System.out.print(anagramTotal[i]+" ");
				  positive++;
			  }
		  }
		//  System.out.println(positive);
		 int[] ana = new int[positive+1];
		int zz = 1;
		int yy=0;
		for(int i=0;i<anagramTotal.length;i++) {
			if(anagramTotal[i]!=-1) {
				ana[yy]=anagramTotal[i];
				yy++;
			}
		}
		/*for(int i=0;i<ana.length;i++) {
			System.out.println(ana[i]);
		}*/
		
		int[][] total = new int[10][100];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				total[i][j] = zz;
				zz++;
				//System.out.print(total[i][j]+" ");
			}
			//System.out.println();
		}
		int xx = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (ana[xx] == total[i][j] && xx<ana.length) {
					total[i][j] = ana[xx];
					xx++;
					//System.out.println(total[i][j]);
				} else {
					total[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				if (total[i][j] != -1) {
					System.out.print(total[i][j]+" ");
				}
			}
			System.out.println();
		}
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
