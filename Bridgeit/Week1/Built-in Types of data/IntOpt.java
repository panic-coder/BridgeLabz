/*1. Write a IntOpt.java program by taking a, b and c as input values and print the
following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please
also understand the precedence of the operators.*/
import java.util.Scanner;

public class IntOpt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 int values for a, b & c");
		int a,b,c;
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		
		System.out.println("a+b*c = "+(a+(b*c)));
		System.out.println("a*b+c = "+((a*b)+c));
		System.out.println("c+a/b = "+(c+(a/b)));
		System.out.println("a%b+c = "+((a%b)+c));
		
		s.close();
	}
}
