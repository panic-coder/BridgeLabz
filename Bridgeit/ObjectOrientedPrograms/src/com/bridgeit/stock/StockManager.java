package com.bridgeit.stock;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;

import com.bridgeit.utility.Utility;

public class StockManager {
	public static void main(String[] args) throws IOException, ParseException, Exception {
		Utility utility = new Utility();
		//StockAccount stockAccount = new StockAccount();
		// utility.fetch();
		int x = 0;
		List<Company> company = new ArrayList<>();
		// System.out.println(company);
		company = utility.getCompanyInfo();
		utility.display(company);
		while (x == 0) {
			System.out.println("====================");
			System.out.println("1. Create Account" + "\n2. Total Values of Shares" + "\n3. Buy Shares"
					+ "\n4. Sell Shares" + "\n5. Save Account" + "\n6. Print Report" + "\n7. Exit");
			System.out.println("\nEnter your choice");
			StockAccount stockAccount = new StockAccount();
			
			int ch = utility.inputInteger();
			switch (ch) {
			case 1:
				System.out.println("Enter your name");
				String customerName = utility.inputString();
				StockAccount stockAcc = new StockAccount(customerName);
				break;
			case 2:
				System.out.print("Total values of shares : ");
				long totalValues = stockAccount.valueOf(company);
				System.out.println(totalValues+"\n");
				break;
			case 3:
				System.out.println("Enter following details for buying\n"
						+ "=================");
				System.out.println("Enter your name");
				String existingCustomerName = utility.inputString();
				List<Customer> customer = new ArrayList<>();
				System.out.println("Enter the symbol");
				String symbol = utility.inputString();
				System.out.println("Enter the amount");
				long amount = utility.inputInteger();
				/*company =*/ stockAccount.buy(amount, symbol, company);
				utility.display(company);
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
				x = 1;
				break;
			default:
				System.out.println("Oops!!!...your choice doesn't meet our " + "requirement\nSystem closed...!!!");
				System.out.println("=================THANK YOU=================");
				x = 1;
				break;

			}
		}
	}
}
