package com.bridgeit.stock;

import com.bridgeit.utility.Utility;

public class StockManager {
	public static void main(String[] args) {
		Utility utility = new Utility();
		StockAccount stockAccount = new StockAccount();
		utility.fetch();
		int x=0;
		while(x==0) {
			System.out.println("1. Create Account"
					+ "\n2. Total Values of Shares"
					+ "\n3. Buy Shares"
					+ "\n4. Sell Shares"
					+ "\n5. Save Account"
					+ "\n6. Print Report"
					+ "\n7. Exit");
			System.out.println("\nEnter your choice");
			int ch=utility.inputInteger();
		switch(ch) {
		case 1 :
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			System.out.println("System closed...!!!");
			System.out.println("=================THANK YOU=================");
			x=1;
			break;
		default:
			System.out.println("Oops!!!...your choice doesn't meet our " + "requirement\nSystem closed...!!!");
			System.out.println("=================THANK YOU=================");
			x=1;
			break;
				
		}
		}
	}
}
