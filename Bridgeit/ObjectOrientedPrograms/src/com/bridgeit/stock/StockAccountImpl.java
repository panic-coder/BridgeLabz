/**
 * Financial system to keep track of Company shares and user shares 
 * 
 * @author Kumar Shubham
 * @since  07/05/2018
 *
 */
package com.bridgeit.stock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility;

public class StockAccountImpl implements StockAccount {
	Utility utility = new Utility();
	public static List<Company> companyList = new ArrayList<>();
	public static List<Customer> customerList = new ArrayList<>();
	public static List<Transaction> transactionList = new ArrayList<>();
	ObjectMapper mapper = new ObjectMapper();
	long shareIncreaseDecrease;
	Date date = new Date();
	long currentAmount;

	/* 
	 * Purpose : Finding total value of share
	 */
	public long valueOf(List<Company> company) {
		long value = utility.totalValuesOfShares(company);
		return value;
	}

	/* 
	 * Purpose : Buy shares from the user from particular company.
	 */
	public void buy() {
		System.out.println("\n\t\t\tEnter the symbol");
		String symbol = utility.inputString();
		System.out.println("\n\t\t\tEnter the Amount");
		long amount = utility.inputInteger();
		shareIncreaseDecrease = 0;
		Transaction transaction = new Transaction();

		int symbolEqual = 0;
		int amountSmall = 0;
		for (Company c : companyList) {
			if (c.getCompany().equals(symbol)) {
				if (amount >= c.getPricePerShare()) {
					amountSmall++;
					if (!customerList.isEmpty()) {
						for (Customer customerLoop : customerList) {
							currentAmount=customerLoop.getAmount();
							if (customerLoop.getSymbol().equals(symbol)) {
								amountSmall++;
								symbolEqual++;
								customerLoop.setAmount(customerLoop.getAmount() - amount);
								//customerLoop.setSymbol(symbol);
								customerLoop.setShares(customerLoop.getShares() + (amount / c.getPricePerShare()));
							}
						}
					}
					if(symbolEqual==0) {
						amountSmall++;
						Customer customer = new Customer();
						customer.setAmount(currentAmount - amount);
						customer.setSymbol(symbol);
						customer.setShares(amount / c.getPricePerShare());
						customerList.add(customer);
					}/*else {
						amountSmall++;
						Customer customer = new Customer();
						customer.setAmount(currentAmount - amount);
						customer.setSymbol(symbol);
						customer.setShares(amount / c.getPricePerShare());
						customerList.add(customer);
					}
					*/LinkedStack<String> stack = new LinkedStack<String>();
					shareIncreaseDecrease = amount / c.getPricePerShare();
					c.setSharesAvailable(c.getSharesAvailable() - shareIncreaseDecrease);
					stack.add(date.toString());
					System.out.println("\n\t\t\tTransaction Started");
					transaction.setBuySell("Buy");
					transaction.setSymbol(symbol);
					transaction.setDate(date.toString());
					transactionList.add(transaction);
					stack.remove();
					System.out.println("\n\t\t\tTransaction Stopped");
				}
			}
		}
		if (amountSmall == 0) {
			System.out.println("\n\t\t\tYour Balance is low\n\t\t\tPlease Add money");
		}
	}
	
	/* 
	 * Purpose : Sell the shares that the customer has.
	 */
	public void sell() {
		System.out.println("\n\t\t\tEnter the symbol");
		String symbol = utility.inputString();
		System.out.println("\n\t\t\tEnter the Amount");
		long amount = utility.inputInteger();
		Transaction transaction = new Transaction();
		shareIncreaseDecrease = 0;
		for (Customer customer : customerList) {
			if (customer.getSymbol().equals(symbol)) {
				if (customer.getAmount() >= amount) {
					for (Company company : companyList) {
						if (company.getCompany().equals(symbol)) {
							company.setSharesAvailable(
									company.getSharesAvailable() + (amount / company.getPricePerShare()));
							customer.setAmount(customer.getAmount() + amount);
							customer.setShares(customer.getShares() - (amount / company.getPricePerShare()));
							LinkedStack<String> stack = new LinkedStack<String>();
							stack.add(date.toString());
							System.out.println("\n\t\t\tTransaction Started");
							transaction.setBuySell("Sell");
							transaction.setSymbol(symbol);
							transaction.setDate(date.toString());
							transactionList.add(transaction);
							stack.remove();
							System.out.println("\n\t\t\tTransaction Stopped");
						}
					}
				} else {
					System.out.println("\n\t\t\tEntered amount is greater than your balance amount");
				}
			} else {
				System.out.println("\n\t\t\tNo such company Found");
			}
		}
	}

	/* 
	 * Purpose : Displays the List of Companies
	 */
	public void printReport() {
		for (Company c : companyList) {
			System.out.println(c.toString());
		}
	}

	/**
	 * Purpose : Creates file for n user
	 * 
	 * @throws IOException
	 */
	public void create() throws IOException {
		Utility utility = new Utility();
		System.out.println("\n\t\t\tEnter the name of for new Account");
		String stockNew = utility.inputString();
		File file = new File("Stock/" + stockNew + ".json");
		if (file.createNewFile()) {
			System.out.println("\n\t\t\tFile is created!");
		} else {
			System.out.println("\n\t\t\tFile already exists.");
		}
	}

	/**
	 * Purpose : Saves List in file
	 * 
	 * @param file is the name of file in which data is to be saved 
	 * @param T is the list in which data is there
	 */
	public <T> void saveInFile(String file, List<T> T) {
		try {
			mapper.writeValue(new File("Stock/" + file + ".json"), T);
			System.out.println("\n\t\t\tSaved");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Purpose : Reads data from file
	 * 
	 * @param file is the name of the file from where data is read 
	 * @throws Exception
	 */
	public void read(String file) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Stock/" + file + ".json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				if (file.equals("Company")) {
					companyList = objectMapper.readValue(arrayToJson, new TypeReference<ArrayList<Company>>() {
					});
				}else if(file.equals("Transaction")) {
					transactionList = objectMapper.readValue(arrayToJson, new TypeReference<ArrayList<Transaction>>() {
					});
				}else {
					customerList = objectMapper.readValue(arrayToJson, new TypeReference<ArrayList<Customer>>() {
					});
				}
					
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Purpose : Checks whether entered file is present or not  
	 * 
	 * @param existingAddressBook
	 * @return true if file is present
	 */
	public boolean checkAddress(String existingAddressBook) {
		File f = new File("Stock/");
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				if (file.getName().equals(existingAddressBook + ".json")) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Displays customer list
	 */
	public void printCustomer() {
		for (Customer customer : customerList) {
			System.out.println(customer.toString());
		}
		long amount=0;
		for (Customer customer2 : customerList) {
			amount = customer2.getAmount();
		}
		System.out.println("\t\t\tBalance : "+amount);
	}

	/**
	 * Purpose : Displays transaction list
	 */
	public void printTransaction() {
		LinkedStack<String> stack = new LinkedStack<String>();
		for (Transaction transaction : transactionList) {
			stack.add(transaction.toString());
		}
		stack.display();
	}

	/**
	 * Purpose : Adds money in User Account
	 */
	public void addMoney() {
		System.out.println("\n\t\t\tEnter the amount");
		currentAmount = utility.inputInteger();
	}

	/* 
	 * Purpose : Save menu for different list
	 */
	@Override
	public void save(String file, String name) {
		int loopSave = 0;
		while (loopSave == 0) {
			System.out.println("\t\t\t_________________________\n"
							 + "\t\t\t|       Save Menu        |\n"
							 + "\t\t\t|      -----------       |\n"
							 + "\t\t\t|  1. Save Company       |\n"
							 + "\t\t\t|  2. Save User          |\n"
							 + "\t\t\t|  3. Save Transaction   |\n"
							 + "\t\t\t|  4. Exit               |\n"
							 + "\t\t\t|________________________|\n");
			int choiceSave = utility.inputInteger();
			switch (choiceSave) {
			case 1:
				saveInFile(file, companyList);
				break;
			case 2:
				saveInFile(name, customerList);
				break;
			case 3:
				saveInFile("Transaction", transactionList);
				break;
			case 4:
				loopSave = 1;
				System.out.println("\n\t\t\tSave Menu closed\n");
				break;
			default:
				System.out.println("\n\t\t\tSomething went wrong\n\t\t\tSave Menu closed\n");
				break;
			}
		}
	}

	/**
	 * Purpose : Add or remove company from company list 
	 */
	public void addRemoveCompany() {
		LinkedList<Company> list = new LinkedList<Company>();
		
		System.out.println("\n\t\t\tEnter ID");
		String id = utility.inputString();
		System.out.println("\n\t\t\tEnter password");
		String password = utility.inputString();
		if(id.equals("Admin") && password.equals("Admin")) {
			
			for (Company company : companyList) {
				list.add(company);
			}
			list.display();
		}
		int loopAdd=0;
		while(loopAdd==0) {
		System.out.println("\t\t\t______________________________\n"
						 + "\t\t\t|  Company Add & Remove Menu  |\n"
						 + "\t\t\t| --------------------------- |\n"
						 + "\t\t\t|         1. Add              |\n"
						 + "\t\t\t|         2. Remove           |\n"
						 + "\t\t\t|         3. Save             |\n"
						 + "\t\t\t|         3. Exit             |\n"
						 + "\t\t\t|_____________________________|\n");
		int choice = utility.inputInteger();
		switch(choice) {
		case 1:
			Company company = new Company();
			System.out.println("\n\t\t\tEnter the company name");
			String name = utility.inputString();
			company.setCompany(name);
			System.out.println("\n\t\t\tEnter Share Available");
			long shares = utility.inputInteger();
			company.setSharesAvailable(shares);
			System.out.println("\n\t\t\tEnter price per share");
			long price = utility.inputInteger();
			company.setPricePerShare(price);
			list.add(company);
			companyList.add(company);
			System.out.println("\n");
			list.display();
			break;
		case 2:
			System.out.println("\n\t\t\tEnter the name of company to remove");
			int i=1;
			for (Company company2 : companyList) {
				System.out.println("\n\t\t\t"+i+" for "+company2.getCompany());
				i++;
			}
			System.out.println("\n\t\t\tEnter your choice to remove company");
			int removeChoice = utility.inputInteger();
			list.remove(removeChoice);
			companyList.remove(removeChoice-1);
			list.display();
			break;
		case 3:
			saveInFile("Company",companyList);
			break;
		case 4:
			loopAdd = 1;
			System.out.println("\n\t\t\tAdd & Remove menu closed");
			break;
		default:
			loopAdd = 1;
			System.out.println("\n\t\t\tSomething went wrong\n\t\t\tAdd & Remove menu closed");
			break;
		}
		}
	}

}
