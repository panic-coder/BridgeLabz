/*2. Similarly write the DoubleOpt.java program by taking double value and doing the
same operations.*/
import java.util.Scanner;

public class DoubleOpt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 double values for a, b & c");
		double a,b,c;
		a = s.nextDouble();
		b = s.nextDouble();
		c = s.nextDouble();
		
		System.out.println("a+b*c = "+(a+(b*c)));
		System.out.println("a*b+c = "+((a*b)+c));
		System.out.println("c+a/b = "+(c+(a/b)));
		System.out.println("a%b+c = "+((a%b)+c));
		
		s.close();
	}
}
