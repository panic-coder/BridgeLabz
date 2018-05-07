package com.bridgeit.stock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility;

public class StockAccountImpl implements StockAccount{
	Utility utility = new Utility();
	List<Company> company = new ArrayList<>();
	List<Customer> customer = new ArrayList<>();
	
	public StockAccountImpl() {
		
	}
	public StockAccountImpl(String filename) {
		utility.createNewAccount(filename);
	}
	public long valueOf(List<Company> company) {
		long value = utility.totalValuesOfShares(company);
		return value;
	}
	public void buy(String existingCustomerName ,long amount, String symbol, List<Company> company) {
		System.out.println("Enter the symbol");
	}
	public void sell(String existingCustomerName,long amount, String symbol, List<Company> company) {
		//utility.sell(existingCustomerName,amount, symbol, company);
	}
	public void save(String filename) {
		
	}
	public void printReport() {
		for(Company c : company) {
			System.out.println(c.toString());
		}
	}
	ObjectMapper mapper = new ObjectMapper();

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
	public <T> void save(String file, List<T> T) {
		try {
			mapper.writeValue(new File("AddressBook/" + file + ".json"), T);
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
				company = objectMapper.readValue(arrayToJson, new TypeReference<ArrayList<Company>>() {});
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public boolean checkAddress(String existingAddressBook) {
		File f = new File("Stock/");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				if (file.getName().equals(existingAddressBook + ".json")) {
					count++;
					break;
				}
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}

}
