package com.bridgeit.stock;

import java.util.List;

import com.bridgeit.utility.Utility;

public class StockAccount {
	Utility utility = new Utility();
	public StockAccount() {
		
	}
	public StockAccount(String filename) {
		utility.createNewAccount(filename);
	}
	public long valueOf(List<Company> company) {
		long value = utility.totalValuesOfShares(company);
		return value;
	}
	public /*List<Company>*/void buy(long amount, String symbol, List<Company> company) {
		/*company =*/ utility.buy(amount, symbol, company);
		//return company;
	}
	public void sell(int amount, String symbol) {
		
	}
	public void save(String filename) {
		
	}
	public void printReport() {
		
	}
}
