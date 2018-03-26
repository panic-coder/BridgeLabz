
import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, m, p=1,z;
		n = s.nextInt();
		m = s.nextInt();
		
		
		
		if (n == m) {
			for (int i = n; i > 0; i--) {
				z=(i*i)-(i-1);
				//System.out.println(z);
				for (int k = i; k > 0; k--) {
					System.out.print(z+" ");
					z=z+2;
				}
				System.out.println();

				if (i > 1)
					for (int j = n; j > i - 1; j--) {
						System.out.print(" ");
					}
				z=1;
			}

			for (int i = 0; i < m; i++) {
				int k;
				
				for (k = i; k < m - 1; k++) {
					System.out.print(" ");
				
				}

				for (int j = 0; j < i + 1; j++) {
					System.out.print(p+" ");
					p=p+2;
				}

				System.out.println();
			}
		}

		else if (n < m) {

			for (int i = n; i > 0; i--) {
				
				for (int j = 0; j < m - n; j++) {
					System.out.print(" ");
				}
				z=(i*i)-(i-1);
				for (int k = i; k > 0; k--) {
					System.out.print(z+" ");
					z=z+2;
				}
				//z--;
				// System.out.println(z);
				System.out.println();

				if (i > 1)
					for (int j = n; j > i - 1; j--) {
						System.out.print(" ");
					}
				z=1;
			}

			for (int i = 0; i < m; i++) {
				int k;
				for (k = i; k < m - 1; k++) {
					System.out.print(" ");
				}

				for (int j = 0; j < i + 1; j++) {
					System.out.print(p+" ");
					p=p+2;
				}

				System.out.println();
			}
		}

		else if (m < n) {

			for (int i = n; i > 0; i--) {
				z=(i*i)-(i-1);
				for (int k = i; k > 0; k--) {
					System.out.print(z+" ");
					z=z+2;
				}

				System.out.println();

				if (i > 1)
					for (int j = n; j > i - 1; j--) {
						System.out.print(" ");
					}
				z=1;
			}

			for (int i = 0; i < m; i++) {

				for (int j = 0; j < n - m; j++) {
					System.out.print(" ");
				}

				int k;
				for (k = i; k < m - 1; k++) {
					System.out.print(" ");
				}

				for (int j = 0; j < i + 1; j++) {
					System.out.print(p+" ");
					p=p+2;
				}

				System.out.println();
			}
		}

		s.close();
	}
}