/*10. Write a program RollDie.java that generates the result of rolling a fair six­sided die
(an integer between 1 and 6). Repeat the Die Roll n times and suggest which
number between 1 and 6 fall maximum number of times.*/
import java.util.Random;
import java.util.Scanner;

public class RollDie {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total number of occurance");
		int n = s.nextInt();
		int random,one=0,two=0,three=0,four=0,five=0,six=0;
		Random r = new Random();
		
		while(n>0) {
			random = r.nextInt(6);
			random = random+1;
//			System.out.println(random);
			if(random==1)
				one++;
			else if(random==2)
				two++;
			else if(random==3) 
				three++;
			else if(random==4)
				four++;
			else if(random==5)
				five++;
			else if(random==6)
				six++;
			n--;
		}
		
		int roll[]= {one,two,three,four,five,six};
		
/*		for(int i=0;i<roll.length;i++)
			System.out.print(roll[i]+" ");
*/		
		System.out.println();
		for(int i=0;i<roll.length;i++) {
			for(int j=0;j<roll.length-1;j++) {
				if(roll[j]<roll[j+1]) {
					int temp=roll[j];
					roll[j]=roll[j+1];
					roll[j+1]=temp;
				}
			}
		}
		
/*		for(int i=0;i<roll.length;i++)
			System.out.print(roll[i]+" ");
		System.out.println();
*/		
		int greater=0;
		
			if(roll[0]==one)
				greater=1;
			else if(roll[0]==two)
				greater=2;
			else if(roll[0]==three)
				greater=3;
			else if(roll[0]==four)
				greater=4;
			else if(roll[0]==five)
				greater=5;
			else if(roll[0]==six)
				greater=6;
			
		System.out.println("Number which falls max. times is "+greater);
				
		
		s.close();
	}
}
