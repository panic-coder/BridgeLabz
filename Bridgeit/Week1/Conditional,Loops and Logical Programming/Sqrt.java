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
