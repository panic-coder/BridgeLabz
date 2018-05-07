package com.bridgeit.stock;

import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class StockManager {
	public static void main(String[] args) throws IOException, ParseException, Exception {
		Utility utility = new Utility();
		StockAccountImpl stockAccount = new StockAccountImpl();

		int y = 0;
		while(y==0) {
			System.out.println("1. Create Account\n2. Open Existing Account\n3. Exit");
			int choice = utility.inputInteger();
			switch(choice) {
			case 1:
				stockAccount.create();
				break;
			case 2:
				int x = 0;
				while (x == 0) {
					System.out.println("Enter the name of account");
					String name = utility.inputString();
					if(stockAccount.checkAddress(name)) {
					System.out.println("\n1. Buy Shares"
							+ "\n2. Sell Shares" + "\n3. Save Account" + "\n4. Print Report" + "\n5. Exit");
					System.out.println("\nEnter your choice");
					String file = "Company";
					stockAccount.read(file);
					int ch = utility.inputInteger();
					switch (ch) {
					case 1:
						System.out.println("Enter following details for buying\n" + "=================");
						System.out.println("Enter your name");
						break;
					case 2:
						System.out.println("Enter the following details for selling\n" + "=================");
						break;
					case 3:
						break;
					case 4:
						stockAccount.printReport();
						break;
					case 5:
						System.out.println("Menu closed...!!!");
						System.out.println("=================THANK YOU=================");
						x = 1;
						break;
					default:
						System.out.println("Oops!!!...your choice doesn't meet our " + "requirement\nSystem closed...!!!");
						System.out.println("=================THANK YOU=================");
						x = 1;
						break;
					
						
					}
					
					}else {
						System.out.println("You are not registered\nPlease Create Account");
						x=1;
					}
				}

				break;
			case 3:
				System.out.println("System closed\nThank You");
				y=1;
				break;
			default:
				System.out.println("Something went wrong\nSystem closed\nThank You");
				y=1;
				break;
			}
		}
			}
}
