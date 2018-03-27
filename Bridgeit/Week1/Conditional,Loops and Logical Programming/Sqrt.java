/*4. Write a Program Sqrt.java to compute the square root of a nonnegative number c
given in the input using Newton's method:
­ initialize t = c
­ replace t with the average of c/t and t
­ repeat until desired accuracy reached using condition Math.abs(t ­ c/t) > epsilon*t
where epsilon = 1e­15;*/
import java.util.Scanner;

public class Sqrt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int c = s.nextInt();
		int t=c;
		t=((c/t)+t)/2;
		s.close();
	}
}
