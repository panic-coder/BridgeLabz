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
	 * Flips coin and find out total number of heads and tails and calculates total
	 * heads percentage & tails percentage
	 * 
	 * @param testCases
	 */
	public void flipcoin(int userTestcases) {
		int totalTestcases = userTestcases;
		double heads = 0, tails = 0;
		double headPercentage = 1, tailPercentage = 1;
		while (userTestcases > 0) {
			int RandomNumber = inputRandom(2);
			if (RandomNumber == 1)
				heads++;
			if (RandomNumber == 0)
				tails++;
			userTestcases--;
		}
		headPercentage = (heads / totalTestcases) * 100;
		tailPercentage = (tails / totalTestcases) * 100;
		System.out.println("Heads Percentage = " + headPercentage);
		System.out.println("Tails Percentage = " + tailPercentage);
	}

	/**
	 * Determining whether the given year is leap or not
	 * 
	 * @param year
	 * @return true for leap year false for non leap year
	 */
	public boolean leapyear(int year) {
		if (year % 100 != 0 && year % 4 == 0) {
			return true;
		} else if (year % 100 == 0 && year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Replaces <<UserName>> with user input
	 * 
	 * @param userName
	 * @param user
	 * @return replaced String with userName
	 */
	public String replaceUsername(String userName, String user) {
		return user.replaceAll("<<UserName>>", userName);
	}

	/**
	 * Calculates power of 2
	 * 
	 * @param exponent
	 * @return power of 2 up to the given number
	 */
	public int powerOf2(int exponent) {
		int p = 1;
		for (int i = 0; i < exponent; i++) {
			p = (p * 2);
		}
		return p;
	}

	/**
	 * Calculates the sum of Harmonic Number for the given size
	 * 
	 * @param size
	 * @return sum of Harmonic Number
	 */
	public double harmonicNumber(int size) {
		double sum = 0.0;
		for (double i = 1; i <= size; i++) {
			sum = sum + (1 / i);
			if (i < size)
				System.out.print("1/" + (int) i + " + ");
			else if (i <= size)
				System.out.println("1/" + (int) i + " = ");
		}
		return sum;
	}

	/**
	 * Finds the prime factors of a given number
	 * 
	 * @param number which prime factorization is to be done
	 */
	public void primeFactor(int number) {
		int numberDuplicate = number;
		int i = 2;
		while (i <= number) {
			if (numberDuplicate % i == 0) {
				System.out.print(i + " ");
				numberDuplicate = numberDuplicate / i;
			} else if (numberDuplicate % i != 0) {
				i++;
			}
		}
	}

	/**
	 * Calculating win and loss percentage for a gambler
	 * 
	 * @param cash
	 * @param stake
	 * @param goals
	 * @param trails
	 */
	public void gambler(int cash, int stake, int goals, int trails) {
		double won = 0, bets = 0, loss = 0;
		int current;

		while (trails > 0 && goals >= cash && cash > 0) {
			bets++;
			current = inputRandom(2);
			System.out.println(current);
			if (current == 1) {
				cash = cash + stake;
				won++;
			} else {
				cash = cash - stake;
				loss++;
			}
			trails--;
		}
		System.out.println("Win % = " + (won / bets) * 100);
		System.out.println("Loss % = " + (loss / bets) * 100);
	}

	/**
	 * Finding the number of random numbers generated for all distinct coupon
	 * numbers
	 * 
	 * @param size
	 * @return total number of distinct counts
	 */
	public int couponNumbers(int size) {
		int count = 0;
		int r = 0;
		int random = 0;
		int x = 0;
		int[] a = new int[size];
		while (r < size) {
			if (r == 0) {
				a[r] = inputRandom(size)+1;
				count++;
			} else {
				int z = 0;
				while (z == 0) {
					random = inputRandom(size)+1;
					count++;
					x = 0;
					for (int i = 0; i < r; i++) {
						if (a[i] == random) {
							x++;
						}
					}
					if (x == 0) {
						a[r] = random;
						z++;
					}
				}
			}
			r++;
		}
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
		return count;
	}

	/**
	 * static PrintWriter for using it in all the different 2DArray methods
	 */
	static PrintWriter printWriter = new PrintWriter(System.out, true);

	/**
	 * Integer 2D array input and print
	 */
	public void intArray() {
		printWriter.println("Enter the value of rows and columns\nfor int array");
		int row = inputInteger();
		int column = inputInteger();
		Integer[][] array = new Integer[row][column];
		printWriter.println("Enter " + (row * column) + " integer values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = inputInteger();
			}
		}
		printArray2D(array, row, column);
	}

	/**
	 * Purpose: Generic print method
	 * 
	 * @param array
	 * @param rows
	 * @param columns
	 */
	public static <T> void printArray2D(T[][] array, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				printWriter.printf("%s ", array[i][j]);
			}
			printWriter.println();
		}
	}

	/**
	 * Double 2D array for input and print
	 */
	public void doubleArray() {
		printWriter.println("Enter the value of rows and columns\nfor double array");
		int rows = inputInteger();
		int column = inputInteger();
		Double[][] array = new Double[rows][column];
		printWriter.println("Enter " + (rows * column) + " double values");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = inputDouble();
			}
		}
		printArray2D(array, rows, column);
	}

	/**
	 * Boolean 2D array for input and print
	 */
	public void booleanArray() {
		printWriter.println("Enter the value of rows and columns\nfor boolean array");
		int rows = inputInteger();
		int column = inputInteger();
		Boolean[][] array = new Boolean[rows][column];
		printWriter.println("Enter " + (rows * column) + " boolean values");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = inputBoolean();
			}
		}
		printArray2D(array, rows, column);
	}

	/**
	 * Finding the triplets in an array whose sum is 0
	 * 
	 * @param array
	 * @return total number of triplets
	 */
	public int triplets(int[] array) {
		int count = 0;
		for (int k = 0; k < array.length; k++) {
			for (int j = k + 1; j < array.length; j++) {
				for (int i = j + 1; i < array.length; i++) {
					if (array[k] + array[j] + array[i] == 0) {
						count++;
						System.out.println(array[k] + " " + array[j] + " " + array[i]);
					}
				}
			}
		}
		return count;
	}

	/**
	 * Calculating distance of a given (x,y) point from origin (0,0) via Euclidean
	 * formula
	 * 
	 * @param valueOne
	 * @param valueTwo
	 * @return Distance using Euclidean formula between origin to (valueOne
	 *         ,valueTwo)
	 */
	public double distance(double valueOne, double valueTwo) {
		return Math.sqrt(Math.pow(valueOne, 2) + Math.pow(valueTwo, 2));
	}

	/**
	 * Calculating value of a number for given exponent
	 * 
	 * @param number
	 * @param exponent
	 * @return power of number to the given exponent
	 */
	public int power(int number, int exponent) {
		int p = 1;
		for (int j = 1; j <= exponent; j++) {
			p = p * number;
		}
		return p;
	}

	/**
	 * Finds total number permutations
	 * @param array
	 * @param k
	 */
	public void permute(char[] array, int k) {
		if (k == array.length) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
			}
			System.out.println();
		} else {
			for (int i = k; i < array.length; i++) {
				char temp = array[k];
				array[k] = array[i];
				array[i] = temp;
				permute(array, k + 1);
				temp = array[k];
				array[k] = array[i];
				array[i] = temp;
			}
		}
	}

	/**
	 * TictacToe game with PC
	 */
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
					if (a[i][j] == -1) {
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

	/**
	 * Finding the factorial of the given number
	 * 
	 * @param number
	 * @return factorial to a number
	 */
	public int factorial(int number) {
		int factorial = 1;
		for (int i = number; i > 0; i--) {
			factorial = factorial * i;
		}

		return factorial;
	}

	/**
	 * Finding wind chill for the given temperature and velocity
	 * 
	 * @param temperature
	 * @param velocity
	 * @return windChill
	 */
	public double windChill(double temperature, double velocity) {
		return 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(velocity, 0.16);
	}

}
