package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

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
	 * @param n
	 */
	public void flipcoin(int n) {
		int m = n;
		double h = 0, t = 0;
		double hp = 1, tp = 1;
		while (n > 0) {
			int num = inputRandom(2);
			// System.out.println(num);
			if (num == 1)
				h++;
			// System.out.println(h);
			if (num == 0)
				t++;
			n--;
		}
		hp = (h / m) * 100;
		tp = (t / m) * 100;
		System.out.println("Heads Percentage = " + hp);
		System.out.println("Tails Percentage = " + tp);
	}

	public boolean leapyear(int year) {
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

	public void username(String user) {
		System.out.println("Hello " + user);
	}

	public int powerOf2(int n) {
		int p = 1;
		for (int i = 0; i < n; i++) {
			p = (p * 2);
			// System.out.println(p);
		}
		// System.out.println(p);
		return p;
	}

	public double harmonicNumber(int n) {
		double sum = 0.0;
		for (double i = 1; i <= n; i++) {
			sum = sum + (1 / i);
			if (i < n)
				System.out.print("1/" + (int) i + " + ");
			else if (i <= n)
				System.out.println("1/" + (int) i + " = ");
		}
		return sum;
	}

	public void primeFactor(int n) {
		int m = n;
		int i = 2;
		while (i * i <= n) {
			if (m % i == 0) {
				System.out.print(i + " ");
				m = m / i;
			} else if (m % i != 0) {
				i++;
			}
		}
	}

	public void gambler(int stake, int goals, int trails) {
		double won = 0, bets = 0, g = stake;
		int current;

		while (trails > 0 && stake > 0 && goals > 0) {
			bets++;
			current = inputRandom(2);
			System.out.println(current);
			if (current == 1) {
				stake++;
				goals--;
				won++;
			} else {
				stake--;
			}

			trails--;
		}

		System.out.println("Total number of wins = " + won);
		System.out.println("Win % = " + (won / bets) * 100);
		System.out.println("Average number of bets = " + (g / bets));

	}

	public int couponNumbers(int n) {
		int count = n;
		int a[] = new int[n];
		int i = 0;
		while (i < n) {
			int r = inputRandom(10);
			a[i] = r;
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (r == a[j])
						count++;
				}
			}
			System.out.println(a[i]);
			i++;
		}
		return count;
	}

	public void intArray() {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("Enter the value of rows and columns\nfor int array");
		int m = inputInteger();
		int n = inputInteger();
		int[][] a = new int[m][n];
		pw.println("Enter " + (m * n) + " integer values");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = inputInteger();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println();
		}
		pw.println();
	}

	public void doubleArray() {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("Enter the value of rows and columns\nfor double array");
		int m = inputInteger();
		int n = inputInteger();
		double[][] a = new double[m][n];
		pw.println("Enter " + (m * n) + " double values");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = inputDouble();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println();
		}
		pw.println();
	}

	public void booleanArray() {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("Enter the value of rows and columns\nfor boolean array");
		int m = inputInteger();
		int n = inputInteger();
		boolean[][] a = new boolean[m][n];
		pw.println("Enter " + (m * n) + " boolean values");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = inputBoolean();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println();
		}
		pw.println();
	}

	public int triplets(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length - 2; i++) {
			if (a[i] + a[i + 1] + a[i + 2] == 0) {
				count++;
				System.out.println(a[i] + " " + a[i + 1] + " " + a[i + 2]);
			}
		}
		return count;
	}

	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public int power(int size, int i) {
		int p = 1;
		for (int j = 1; j <= i; j++) {
			p = p * size;
		}
		return p;
	}

	public String permutation(String st) {
		char[] c = st.toCharArray();
		st = "";
		for (int i = 0; i < c.length; i++) {
			for (int j = 1; j < c.length - 1; j++) {

			}
		}
		return null;
	}

	public void ticTacToe() {
		int[][] a = new int[3][3];
		int t = 0, count = 0, s = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = -1;
			}
		}
		while (t == 0) {
			count = 0;
			s = 0;
			int r = inputRandom(3);
			int c = inputRandom(3);

			while (s == 0) {
				if (a[r][c] == -1) {
					a[r][c] = 0;
					s = 1;
				} else {
					r = inputRandom(3);
					c = inputRandom(3);
				}
			}
			System.out.println("Empty cells are");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1) { // || a[i][j]!=0 || a[i][j]!=1) {
						System.out.println(i + " " + j);
					}
				}
			}
			
			
			System.out.println("Enter the cell");
			r = inputInteger();
			c = inputInteger();

			a[r][c] = 1;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1) {
						count++;
					}
				}
			}
			if (count != 0) {
				t = 0;
			} else {
				t = 1;
			}

		}
		System.out.println("Ends");
	}

}
