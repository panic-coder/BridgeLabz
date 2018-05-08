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

	public StockAccountImpl() {

	}

	public StockAccountImpl(String filename) {
		utility.createNewAccount(filename);
	}

	public long valueOf(List<Company> company) {
		long value = utility.totalValuesOfShares(company);
		return value;
	}

	public void buy() {
		System.out.println("Enter the symbol");
		String symbol = utility.inputString();
		System.out.println("Enter the Amount");
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
								customerLoop.setSymbol(symbol);
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
					}else {
						amountSmall++;
						Customer customer = new Customer();
						customer.setAmount(currentAmount - amount);
						customer.setSymbol(symbol);
						customer.setShares(amount / c.getPricePerShare());
						customerList.add(customer);
					}
					LinkedStack<String> stack = new LinkedStack<String>();
					shareIncreaseDecrease = amount / c.getPricePerShare();
					c.setSharesAvailable(c.getSharesAvailable() - shareIncreaseDecrease);
					stack.add(date.toString());
					System.out.println("Transaction Started");
					transaction.setBuySell("Buy");
					transaction.setSymbol(symbol);
					transaction.setDate(date.toString());
					transactionList.add(transaction);
					stack.remove();
					System.out.println("Transaction Stopped");
				}
			}
		}
		if (amountSmall == 0) {
			System.out.println("Your Balance is low\nPlease Add money");
		}
	}
	
	public void sell() {
		System.out.println("Enter the symbol");
		String symbol = utility.inputString();
		System.out.println("Enter the Amount");
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
							System.out.println("Transaction Started");
							transaction.setBuySell("Sell");
							transaction.setSymbol(symbol);
							transaction.setDate(date.toString());
							stack.remove();
							System.out.println("Transaction Stopped");
						}
					}
				} else {
					System.out.println("Entered amount is greater than your balance amount");
				}
			} else {
				System.out.println("No such company Found");
			}
		}
	}

	public void printReport() {
		for (Company c : companyList) {
			System.out.println(c.toString());
		}
	}

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

	public void printCustomer() {
		for (Customer customer : customerList) {
			System.out.println(customer.toString());
		}
	}

	public void printTransaction() {
		LinkedStack<String> stack = new LinkedStack<String>();
		for (Transaction transaction : transactionList) {
			stack.add(transaction.toString());
		}
		stack.display();
	}

	public void addMoney() {
		System.out.println("Enter the amount");
		currentAmount = utility.inputInteger();
	}

	@Override
	public void save(String file, String name) {
		int z = 0;
		while (z == 0) {
			System.out.println("1. Save Company \n2. Save User\n3. Save Transaction\n4. Exit");
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
				z = 1;
				System.out.println("Save Menu closed\n");
				break;
			default:
				System.out.println("Something went wrong\nSave Menu closed\n");
				break;
			}
		}

	}

}
