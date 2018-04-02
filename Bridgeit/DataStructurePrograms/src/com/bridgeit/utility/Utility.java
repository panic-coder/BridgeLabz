package com.bridgeit.utility;

import java.util.*;

import com.bridgeit.programs.Node;

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

	public static void calender(int month, int year) {
		int year1,month1,x,day=1,day1;
		year1 = year-(14-month)/12;
		x = year1+(year1/4)-(year1/100)+(year1/400);
		month1=month+12*((14-month)/12)-2;
		day1=(day+x+(31*month1)/12)%7;
		String[] monthName = {"January","February","March","April","May",
				"June","July","August","September","October","November",
				"December"
		};
		int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		int monthDay=0;
		for(int i=0;i<monthDays.length;i++) {
			if(i==month-1) {
				monthDay=monthDays[i];
			}
		}
		int[][] totalDays = new int[6][7]; 
		boolean leap = leapYear(year);
		if(leap) {
			monthDay = 29;
		}
		int z=1;
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				if(i==0 && j<day1) {
					totalDays[i][j]=-1;
				}
				else if(z<=monthDay) {
					totalDays[i][j]=z;
					z++;
				}
				else {
					totalDays[i][j]=-1;
				}
			}
		}
		for(int i=0;i<12;i++) {
			if(month==i+1) {
				System.out.print(monthName[i]+" "+year);
			}
		}
		System.out.println();
		String[] dayName = {"S","M","T","W","T","F","S"};
		for(int i=0;i<7;i++) {
			System.out.print(dayName[i]+"  ");
		}
		System.out.println();
		//System.out.println(day1);
		for(int i=0;i<6;i++) {
			for(int j=0;j<7;j++) {
				if(totalDays[i][j]!=-1) {
					if(totalDays[i][j]<10)
						System.out.print(totalDays[i][j]+"  ");
					else 
						System.out.print(totalDays[i][j]+" ");
				}
				else
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
		int[] prime = new int[1000];
		int z=0;
		for(int i=2;i<=1000;i++) {
			boolean b = isPrime(i);
			if(b) {
				prime[z] = i;
				z++;
			}
		}
		int[] x= new int[10];
		int c100=0,c200=0,c300=0,c400=0,c500=0,c600=0,c700=0,
				c800=0,c900=0,c1000=0;
		for(int i=0;i<prime.length;i++) {
			if(prime[i]!=0 && prime[i]<100) {
				//System.out.println(prime[i]);
				c100++;
			}
			else if(prime[i]!=0 && prime[i]>100 && prime[i]<200)
				c200++;
			else if(prime[i]!=0 && prime[i]>200 && prime[i]<300)
				c300++;
			else if(prime[i]!=0 && prime[i]>300 && prime[i]<400)
				c400++;
			else if(prime[i]!=0 && prime[i]>400 && prime[i]<500)
				c500++;
			else if(prime[i]!=0 && prime[i]>500 && prime[i]<600)
				c600++;
			else if(prime[i]!=0 && prime[i]>600 && prime[i]<700)
				c700++;
			else if(prime[i]!=0 && prime[i]>700 && prime[i]<800)
				c800++;
			else if(prime[i]!=0 && prime[i]>800 && prime[i]<900)
				c900++;
			else if(prime[i]!=0 && prime[i]>900 && prime[i]<1000)
				c1000++;
		}
		System.out.println(c100+" "+c200+" "+c300+" "+c400+" "
				+c500+" "+c600+" "+c700+" "
				+c800+" "+c900+" "+c1000);
	}

	private static boolean isPrime(int n) {
		int count =0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==0)
			return true;
		else
			return false;
	}
}
