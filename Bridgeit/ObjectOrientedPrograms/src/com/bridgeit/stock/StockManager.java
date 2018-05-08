package com.bridgeit.stock;

import java.io.IOException;
import java.util.Date;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class StockManager {
	public static void main(String[] args) throws IOException, ParseException, Exception {
		Utility utility = new Utility();
		StockAccountImpl stockAccount = new StockAccountImpl();
		Date date = new Date();
		System.out.println(date.toString());
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
				System.out.println("Enter the name of account");
				String name = utility.inputString();
				String file = "Company";
				stockAccount.read(file);
				stockAccount.read("Transaction");
				stockAccount.read(name);
				while (x == 0) {
					if(stockAccount.checkAddress(name)) {
					System.out.println("\n1. Add Amount\n2. Buy Shares"
							+ "\n3. Sell Shares" + "\n4. Save Account" + "\n5. Print Report" + "\n6. Exit");
					System.out.println("\nEnter your choice");
					int ch = utility.inputInteger();
					switch (ch) {
					case 1:
						stockAccount.addMoney();
						break;
					case 2:
						stockAccount.buy();
						break;
					case 3:
						stockAccount.sell();
						break;
					case 4:
						stockAccount.save(file,name);
						break;
					case 5:
						int m=0;
						while(m==0) {
							System.out.println("1. To display company\n2. To display current Customer\n3. To display Transaction\n4. Exit");
							int choiceDisplay = utility.inputInteger();
							switch(choiceDisplay) {
							case 1:
								stockAccount.printReport();
								break;
							case 2:
								stockAccount.printCustomer();
								break;
							case 3:
								stockAccount.printTransaction();
								break;
							case 4:
								m=1;
								System.out.println("Display menu closed");
								break;
							default:
								System.out.println("Something went wrong\nDisplay menu closed");
								break;
							}
						}
						
						
						break;
					case 6:
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
