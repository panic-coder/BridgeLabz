/**
 * Purpose: Find out wins, win percentage and loss of a gambler.
 * 
 * @author Kumar Shubham
 * @since  28-03-2018
 *
 */

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

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
