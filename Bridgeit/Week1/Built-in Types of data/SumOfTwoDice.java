/*7. Write a program SumOfTwoDice.java that prints the sum of two random integers
between 1 and 6 (such as you might get when rolling dice).*/
import java.util.Random;
import java.util.Scanner;

public class SumOfTwoDice {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of testcases");
		int n = s.nextInt();
		Random r = new Random();
		int a,b,sum=0;
		while(n>0) {
			a = r.nextInt(6);
			a = a+1;
			b = r.nextInt(6);
			b = b+1;
			sum=a+b;
			System.out.println(a+" "+b);
			System.out.println(sum);
			n--;
		}
		
		s.close();
	}
}
