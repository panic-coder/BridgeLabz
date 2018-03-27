/*11. Given an array with 100 integers containing 1 to 100 and among them one number is
repeated twice. Write the Logic to find out the repeated number.*/

import java.util.Scanner;
public class ReapeatedTwice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		/*for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}*/
		
		int item=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]==a[j+1]) {
					item=a[j];
					break;
				}
			}
		}
		
		System.out.println(item+" is repeated twice");
		
		s.close();
	}
}
