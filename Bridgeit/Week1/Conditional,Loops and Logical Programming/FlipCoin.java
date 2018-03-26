
import java.util.*;
public class FlipCoin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of testcases");
		int n = s.nextInt();
		int m=n;
		Random r = new Random();
		double h=0,t=0;
		double hp=1,tp=1;
		while(n>0) {
			int num = r.nextInt(2);
			//System.out.println(num);
			if(num == 1) 
				h++;
			//System.out.println(h);
			if(num == 0)
				t++;
			n--;
		}
		hp=(h/m)*100;
		tp=(t/m)*100;
		System.out.println("Heads Percentage = "+hp);
		System.out.println("Tails Percentage = "+tp);
		s.close();
	}
}
