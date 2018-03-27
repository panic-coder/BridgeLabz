/*12. Write a program to find the 2nd largest and the 2nd smallest element from an
unsorted array and without sorting the array.*/
import java.util.Scanner;

public class SecondLargeSmall {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int a[] = new int[size];
		
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		int large=a[0],secondLarge=a[0];
		for(int i=1;i<a.length;i++) {
			if(large<a[i]) {
				secondLarge=large;
				large=a[i];
			}
			else if(secondLarge<a[i] && a[i]!=large) {
				secondLarge=a[i];
			}
		}
		
		System.out.println("2nd Largest is "+secondLarge);
		
		int smallest=a[0],secondSmallest=a[0];
		for(int i=1;i<a.length;i++) {
			if(smallest>a[i]) {
				secondSmallest=smallest;
				smallest=a[i];
			}
			else if(secondSmallest>a[i] && a[i]!=smallest) {
				secondSmallest=a[i];
			}
		}
		
		System.out.println("2nd Smallest is "+secondSmallest);
		
		s.close();
	}
}
