/*4. Write a program SpringSeason.java that takes two int values m and d from the
command line and prints true if day d of month m is between March 20 (m = 3, d
=20) and June 20 (m = 6, d = 20), false otherwise.*/
import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month and day in int");
		int m,d;
		m = s.nextInt();
		d = s.nextInt();
		
		if(m>=3 && m<=6) {
			if(m==3 && d>=20 && d<=31)
				System.out.println("Spring Season");
			else if(m==6 && d<=20 && d>=1)
				System.out.println("Spring Season");
			else if(m==4 && d>=1 && d<=30)
				System.out.println("Spring Season");
			else if(m==5 && d>=1 && d<=31) 
				System.out.println("Spring Season");
			else if(d<1 || d>31)
				System.out.println("Not a Valid Date");
			else 
				System.out.println("Not Spring Season");
		}
		else if(m<1 || m>12 || d<1 || d>31)
			System.out.println("Not a Valid Date");
		else 
			System.out.println("Not Spring Season");
		s.close();
	}
}
