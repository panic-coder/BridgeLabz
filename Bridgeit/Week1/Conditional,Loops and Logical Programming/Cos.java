/*9. Write two programs Sin.java and Cos.java that compute sin x and cos x using the
Taylor series expansions as shown below...
Note ­ Convert angle x to an angle between ­2 PI and 2 PI using following logic
x = x % (2 * Math.PI);
Cos x=1-(x^2/2!)+(x^4/4!)-(x^6/6	!)+...+(x^n/n!)
*/
import java.util.Scanner;

public class Cos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to \nfind out Cos Series");
		double x =  s.nextInt();
		x=x%(2*Math.PI);
		//System.out.println(x);
		double n,sum=1;
		System.out.println("Enter the limit");
		n=s.nextInt();
		n=n*2-2;
		int count=1;
		for(double i=2;i<=n;i=i+2) {
			if(count%2!=0) 
				sum=sum-(power(x,i)/factorial(i));
			else
				sum=sum+(power(x,i)/factorial(i));
			count++;
		}
		System.out.println("Cos("+x+") = "+sum);
		
		s.close();
	}

	private static double factorial(double i) {
		double fact=1;
		while(i>0) {
			fact=fact*i;
			i--;
		}
		//System.out.println(fact);
		return fact;
	}

	private static double power(double x, double i) {
		double pow=1;
		while(i>0) {
			pow=pow*x;
			i--;
		}
		//System.out.println(pow);
		return pow;
	}
}
