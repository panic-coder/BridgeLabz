/*13. Write a program to compute Factors of a number N using prime factorization
method.
Logic ­> Traverse till i*i <= N instead of i <= N for efficiency.
O/P ­> Print the prime factors of number N.*/
import java.util.Scanner;

public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = n;
		int i = 2;

		System.out.print("Prime factors of " + n + " are as follows\n");
		
		while (i * i <= n) {
			if (m % i == 0) {
				System.out.print(i + " ");
				m = m / i;
			} else if (m % i != 0) {
				i++;
			}
		}
		s.close();
	}
}
