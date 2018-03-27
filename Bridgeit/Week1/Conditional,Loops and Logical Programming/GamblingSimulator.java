/*5. Write a Program GamlingSimulator.java where a gambler starts with certain stake
in INR and places fair Re 1 bet until he/she goes broke or reaches the goal set as
input. Keeps track of the number of times won and number of bets made. Run the
simulation N times.
Input ­ stake, goal and trails are taken as input
Output ­ Number of times won, Percent Win and Avg number of bets made.*/
import java.util.*;

public class GamblingSimulator {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the STAKE, GOALS \nand trails ");
		int stake,goals,trails,current;
		double won=0,bets=0,g;
		
		stake = s.nextInt();
		goals = s.nextInt();
		trails = s.nextInt();
		g=stake;
		
		Random r = new Random();
		
		while(trails>0 && stake>0 && goals>0 ) {
			bets++;
			current = r.nextInt(2);
			System.out.println(current);
			if(current == 1) {
				stake++;
				goals--;
				won++;
			}
			else {
				stake--;
			}
				
			trails--;
		}
		
		System.out.println("Total number of wins = "+won);
		System.out.println("Win % = "+(won/bets)*100);
		System.out.println("Average number of bets = "+(g/bets));
		
		s.close();
	}
}
