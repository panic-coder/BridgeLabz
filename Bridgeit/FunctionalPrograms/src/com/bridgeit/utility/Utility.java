package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import com.bridgeit.programs.Values;

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
	public void flipcoin(int userTestcases) {
		int totalTestcases = userTestcases;
		double heads = 0, tails = 0;
		double headPercentage = 1, tailPercentage = 1;
		while (userTestcases > 0) {
			int RandomNumber = inputRandom(2);
			// System.out.println(num);
			if (RandomNumber == 1)
				heads++;
			// System.out.println(h);
			if (RandomNumber == 0)
				tails++;
			userTestcases--;
		}
		headPercentage = (heads / totalTestcases) * 100;
		tailPercentage = (tails / totalTestcases) * 100;
		System.out.println("Heads Percentage = " + headPercentage);
		System.out.println("Tails Percentage = " + tailPercentage);
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

	public void username(String userName, String user) {
		char[] c = user.toCharArray();
		String newUser = "",newUser2="";int z=0,x=0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == '<') {
				z++;
				x++;
				//System.out.println(x);System.out.println("====");
			} 
			
			else if(c[i] == '>') {
				x=x-1;
				//System.out.println(x);
			}
			if(z==0){
				newUser = newUser + c[i];
			}
			else if(x==0 && c[i]!='>') {
				newUser2 = newUser2 +c[i];
			}
			
		}
		String newUserName =newUser+userName+newUser2;
		//System.out.println(newUser);
		//System.out.println(newUser2);
		System.out.println(user);
		System.out.println(newUserName);

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
		while (i <= n) {
			if (m % i == 0) {
				System.out.print(i + " ");
				m = m / i;
			} else if (m % i != 0) {
				i++;
			}
		}
	}

	public void gambler(int cash, int stake, int goals, int trails) {
		double won = 0, bets = 0, loss = 0;
		int current;

		while (trails > 0 /* && stake > 0 */ && goals >= cash && cash > 0) {
			bets++;
			current = inputRandom(2);
			System.out.println(current);
			if (current == 1) {
				// stake++;
				cash = cash + stake;
				won++;
			} else {
				// stake--;
				cash = cash - stake;
				loss++;
			}
			// cash = cash - stake;
			trails--;
		}

		// System.out.println("Total number of wins = " + won);
		System.out.println("Win % = " + (won / bets) * 100);
		System.out.println("Loss % = " + (loss / bets) * 100);
		// System.out.println("Average number of bets = " + (g / bets));

	}

	public int couponNumbers(int n) {
		int count = n, m = 0, r = 0;
		int a[] = new int[n];
		int i = 0;
		while (i < n) {

			while (m > 0) {

				r = inputRandom(10);
			}
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
	static PrintWriter pw = new PrintWriter(System.out, true);
	
	public void intArray() {
		pw.println("Enter the value of rows and columns\nfor int array");
		int m = inputInteger();
		int n = inputInteger();
		Integer[][] a = new Integer[m][n];
		pw.println("Enter " + (m * n) + " integer values");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = inputInteger();
			}
		}
		/*for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println();
		}
		pw.println();*/
		printArray2D(a,m,n);
	}
	
	public static <E> void printArray2D(E[][] a,int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				pw.printf("%s ",a[i][j]);
			}
		pw.println();
		}
	}

	public void doubleArray() {
		pw.println("Enter the value of rows and columns\nfor double array");
		int m = inputInteger();
		int n = inputInteger();
		Double[][] a = new Double[m][n];
		pw.println("Enter " + (m * n) + " double values");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = inputDouble();
			}
		}
		/*for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println();
		}
		pw.println();*/
		printArray2D(a,m,n);
	}

	public void booleanArray() {
		pw.println("Enter the value of rows and columns\nfor boolean array");
		int m = inputInteger();
		int n = inputInteger();
		Boolean[][] a = new Boolean[m][n];
		pw.println("Enter " + (m * n) + " boolean values");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = inputBoolean();
			}
		}
		/*for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println();
		}
		pw.println();*/
		printArray2D(a,m,n);
	}

	public int triplets(int[] a) {
		int count = 0;
		for (int k = 0; k < a.length; k++) {
			for (int j = k + 1; j < a.length; j++) {
				for (int i = j + 1; i < a.length; i++) {
					if (a[k] + a[j] + a[i] == 0) {
						count++;
						System.out.println(a[k] + " " + a[j] + " " + a[i]);
					}
				}
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

	public Values[] permutationIterative(String st, int size) {
		char[] c = st.toCharArray();
		Values value[] = new Values[size];

		st = "";
		int z = 0;
		while (z < size) {
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					char temp = c[i];
					c[i] = c[j];
					// st=st+c[i];
					c[j] = temp;
					// st=st+c[j];
				}
			}
			Values val = new Values();
			val.name = st;
			value[z] = val;
			z++;
		}
		return value;
	}

	public void ticTacToe() {
		int pc = 0;
		int user = 0;
		int[][] a = new int[3][3];
		int t = 0, count = 0, s = 0, u = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = -1;
			}
		}
		while (t == 0) {
			count = 0;
			s = 0;
			u = 0;
			int r = inputRandom(3);
			int c = inputRandom(3);
			int countPcIn = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1)
						countPcIn++;
				}
			}

			while (s == 0 && countPcIn > 0) {
				// System.out.println(r + "R" + c);
				if (a[r][c] == -1) {
					System.out.println(r + " " + c);
					a[r][c] = 0;
					s = 1;
				} else {
					r = inputRandom(3);
					c = inputRandom(3);
				}
			}

			if (a[0][0] == 0 && a[0][1] == 0 && a[0][2] == 0) {
				pc++;
				break;
			} else if (a[1][0] == 0 && a[1][1] == 0 && a[1][2] == 0) {
				pc++;
				break;
			} else if (a[2][0] == 0 && a[2][1] == 0 && a[2][2] == 0) {
				pc++;
				break;
			} else if (a[0][0] == 0 && a[1][0] == 0 && a[2][0] == 0) {
				pc++;
				break;
			} else if (a[0][1] == 0 && a[1][1] == 0 && a[2][1] == 0) {
				pc++;
				break;
			} else if (a[0][2] == 0 && a[1][2] == 0 && a[2][2] == 0) {
				pc++;
				break;
			} else if (a[0][0] == 0 && a[1][1] == 0 && a[2][2] == 0) {
				pc++;
				break;
			} else if (a[0][2] == 0 && a[1][1] == 0 && a[2][0] == 0) {
				pc++;
				break;
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] >= 0)
						System.out.print(" " + a[i][j] + " ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("==========\n");
			int countUserIn = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1)
						countUserIn++;
				}
			}

			if (countUserIn > 0)
				System.out.println("Empty cells are");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] == -1) { // || a[i][j]!=0 || a[i][j]!=1) {
						System.out.println(i + " " + j);
					}
				}
			}

			if (countUserIn > 0) {
				System.out.println("Enter the cell");
				r = inputInteger();
				c = inputInteger();
			}

			while (u == 0 && countUserIn > 0) {
				if (a[r][c] == -1) {
					a[r][c] = 1;
					u = 1;
				} else {
					System.out.println("Enter the cells numbers from\nabove indexes");
					r = inputInteger();
					c = inputInteger();
				}
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (a[i][j] >= 0)
						System.out.print(" " + a[i][j] + " ");
					else
						System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("==========\n");

			// a[r][c] = 1;

			if (a[0][0] == 1 && a[0][1] == 1 && a[0][2] == 1) {
				user++;
				break;
			} else if (a[1][0] == 1 && a[1][1] == 1 && a[1][2] == 1) {
				user++;
				break;
			} else if (a[2][0] == 1 && a[2][1] == 1 && a[2][2] == 1) {
				user++;
				break;
			} else if (a[0][0] == 1 && a[1][0] == 1 && a[2][0] == 1) {
				user++;
				break;
			} else if (a[0][1] == 1 && a[1][1] == 1 && a[2][1] == 1) {
				user++;
				break;
			} else if (a[0][2] == 1 && a[1][2] == 1 && a[2][2] == 1) {
				user++;
				break;
			} else if (a[0][0] == 1 && a[1][1] == 1 && a[2][2] == 1) {
				user++;
				break;
			} else if (a[0][2] == 1 && a[1][1] == 1 && a[2][0] == 1) {
				user++;
				break;
			}

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
		System.out.println("==========");
		System.out.println();
		if (pc > 0)
			System.out.println("Computer wins");
		else if (user > 0)
			System.out.println("User wins");
		System.out.println("Ends");
	}

	public int factorial(int size) {
		int f = 1;
		for (int i = size; i > 0; i--) {
			f = f * i;
		}

		return f;
	}

	public void display(int[][] a, int m, int n) {
		PrintWriter pw = new PrintWriter(System.out, true);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pw.print(a[i][j] + " ");
			}
			pw.println();
		}
		pw.println();
	}

	public double windChill(double temperature, double velocity) {
		return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(velocity, 0.16);
	}

}
