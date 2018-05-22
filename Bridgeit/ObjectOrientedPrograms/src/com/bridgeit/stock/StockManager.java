/**
 * Financial system to keep track of Company shares and user shares 
 * 
 * @author Kumar Shubham
 * @since  07/05/2018
 *
 */
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
		String file = "Company";
		stockAccount.read(file);
		stockAccount.read("Transaction");
		String name;
		int loopClinic = 0;
		while(loopClinic==0) {
			System.out.println("\t\t\t_________________________________\n"
							 + "\t\t\t|         Stock Manager          |\n"
							 + "\t\t\t|        ---------------         |\n"
							 + "\t\t\t|   1. Create Account            |\n"
							 + "\t\t\t|   2. Open Existing Account     |\n"
							 + "\t\t\t|   3. Add & Remove Company      |\n"
							 + "\t\t\t|   4. Exit                      |\n"
							 + "\t\t\t|________________________________|\n");
			int choice = utility.inputInteger();
			switch(choice) {
			case 1:
				stockAccount.create();
				stockAccount.close();
				break;
			case 2:
				stockAccount.close();
				int loopMenu = 0;
				System.out.println("\n\t\t\tEnter the name of account");
				name = utility.inputString();
				stockAccount.read(name);
				while (loopMenu == 0) {
					if(stockAccount.checkAddress(name)) {
					System.out.println("\t\t\t_____________________\n"
									 + "\t\t\t|       Menu         |\n"
									 + "\t\t\t|      ------        |\n"
									 + "\t\t\t|  1. Add Amount     |\n"
									 + "\t\t\t|  2. Buy Shares     |\n"
									 + "\t\t\t|  3. Sell Shares    |\n"  
									 + "\t\t\t|  4. Save Account   |\n" 
									 + "\t\t\t|  5. Print Report   |\n" 
									 + "\t\t\t|  6. Exit           |\n"
									 + "\t\t\t|____________________|\n");
					System.out.println("\n\t\t\tEnter your choice");
					int ch = utility.inputInteger();
					switch (ch) {
					case 1:
						stockAccount.addMoney();
						break;
					case 2:
						stockAccount.buy(name);
						break;
					case 3:
						stockAccount.sell(name);
						break;
					case 4:
						stockAccount.save(file,name);
						break;
					case 5:
						int loopDisplay=0;
						while(loopDisplay==0) {
							System.out.println("\t\t\t_______________________________________\n"
											 + "\t\t\t|            Display Menu              |\n"
											 + "\t\t\t|           --------------             |\n"
											 + "\t\t\t|  1. To display company               |\n"
											 + "\t\t\t|  2. To display current Customer      |\n"
											 + "\t\t\t|  3. To display Transaction           |\n"
											 + "\t\t\t|  4. Exit                             |\n"
											 + "\t\t\t|______________________________________|\n");
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
								loopDisplay=1;
								System.out.println("\n\t\t\tDisplay menu closed");
								break;
							default:
								loopDisplay=1;
								System.out.println("\n\t\t\tSomething went wrong\n\t\t\tDisplay menu closed");
								break;
							}
						}
						
						
						break;
					case 6:
						System.out.println("\n\t\t\tMenu closed...!!!");
						loopMenu = 1;
						break;
					default:
						System.out.println("\n\t\t\tSomething went wrong\n\t\t\tMenu closed");
						loopMenu = 1;
						break;
					
						
					}
					
					}else {
						System.out.println("\n\t\t\tYou are not registered\n\t\t\tPlease Create Account");
						loopMenu=1;
					}
				}

				break;
			case 3:
				stockAccount.addRemoveCompany();
				break;
			case 4:
				System.out.println("\n\t\t\tSystem closed\n\t\t\tThank You");
				loopClinic=1;
				break;
			default:
				System.out.println("\n\t\t\tSomething went wrong\n\t\t\tSystem closed\n\t\t\tThank You");
				loopClinic=1;
				break;
			}
		}
	}
}
