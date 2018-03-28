/*5. Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula
delta = b*b ­ 4*a*c
Root 1 of x = (­b + sqrt(delta))/(2*a)
Root 2 of x = (­b ­ sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.*/
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a,b,c,delta,x1,x2;
		System.out.println("Enter the values of a, b & c");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		//System.out.println(a+" "+b+" "+c);
		delta = (b*b)-(4*a*c);
		//System.out.println(delta);
		x1 = (-b+Math.sqrt(delta))/(2*a);
		x2 = (-b-Math.sqrt(delta))/(2*a);
		if(x1>0)
			System.out.println("First Root "+x1);
		else
			System.out.println("First Root "+x1+"i");
		if(x2>0)
			System.out.println("Second Root "+x2);
		else
			System.out.println("Second Root "+x2+"i");
		
		s.close();
	}
}
