/*Gambler
Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
I/P -> $Stake, $Goal and Number of times
Logic -> Play till the gambler is broke or has won
O/P -> Print Number of Wins and Percentage of Win and Loss.
*/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Find out wins, win percentage and loss of a gambler.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */
public class Gambler {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter TOTAL CASH, STAKE, GOALS \nand trails ");
		int cash, stake, goals, trails;
		cash = utility.inputInteger();
		stake = utility.inputInteger();
		goals = utility.inputInteger();
		trails = utility.inputInteger();
		utility.gambler(cash, stake, goals, trails);
	}
}
