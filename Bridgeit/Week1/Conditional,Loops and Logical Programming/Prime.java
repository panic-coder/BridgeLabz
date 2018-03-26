import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the lower range");
		int l = s.nextInt();
		System.out.println("Enter the higher range");
		int h = s.nextInt();
		for(int i=l;i<=h;i++) {
			prime(i);
		}
		s.close();
	}

	private static void prime(int n) {
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i!=0) {
				count++;
			}
		}
		if(count==0)
			System.out.println(n);
	}
}
