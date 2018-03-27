/*3. Write a program HarmonicNumber.java that takes a command­line argument n
and prints the nth harmonic number. Harmonic Number is of the form*/
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double sum=0.0;
		for(double i=1;i<=n;i++) {
			sum = sum+(1/i);
		}
		System.out.println(sum);
		s.close();
	}

}
