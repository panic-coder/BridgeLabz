/*6. Write a program Distance.java that takes two integer command­line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 values for calculating \nEuclidean distance");
		double x,y;
		x = s.nextInt();
		y = s.nextInt();
		
		System.out.println(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)));
		s.close();
	}
}
