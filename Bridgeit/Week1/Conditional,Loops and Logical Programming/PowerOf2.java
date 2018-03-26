import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = s.nextInt();
		power(n);
		s.close();
	}

	private static int power(int n) {
		int p=1;
		for(int i=0;i<n;i++) {
			p=(p*2);
			System.out.println(p);
		}
		//System.out.println(p);
		return 0;
	}
}
