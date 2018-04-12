package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/**
 * Purpose: Buying, selling, and displaying of shares
 * 
 * @author Kumar Shubham
 * @since 12-04-2018
 *
 */
public class StockAccount {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int n = 1;
		String symbol;
		int amount;
		while (n == 1) {
			System.out.println();
			System.out.println("===============Stock Account===============");
			System.out.println(
					"1.See total shares\n" + "2.Buy shares\n" + "3.Sell share\n" + "4.Display shares\n" + "5.Exit");
			System.out.println("===========================================");
			System.out.println("Enter your choice");
			int ch = utility.inputInteger();

			switch (ch) {
			case 1:
				System.out.println("Total shares");
				utility.stockTotalShares();
				break;
			case 2:
				System.out.println("Buy shares");
				System.out.println("Enter the Company symbol to buy");
				symbol = utility.inputString();
				System.out.println("Enter the amount for buying shares");
				amount = utility.inputInteger();
				utility.buyShares(amount, symbol);
				break;
			case 3:
				System.out.println("Sell Shares");
				System.out.println("Enter the Company symbol to sell");
				symbol = utility.inputString();
				System.out.println("Enter the amount for selling shares");
				amount = utility.inputInteger();
				utility.sellShares(amount, symbol);
				break;
			case 4:
				System.out.println("Display Shares");
				break;
			case 5:
				System.out.println("System closed...!!!");
				System.out.println("=================THANK YOU=================");
				n = 0;
				break;
			default:
				System.out.println("Oops!!!...your choice doesn't meet our " + "requirement\nSystem closed...!!!");
				System.out.println("=================THANK YOU=================");
				n = 0;
				break;
			}
		}
	}
}
