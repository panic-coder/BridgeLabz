package com.bridgeit.stock;

import java.util.List;

import com.bridgeit.utility.Utility;

public class StockAccountImpl implements StockAccount{
	Utility utility = new Utility();
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
		utility.buy(existingCustomerName,amount, symbol, company);
	}
	public void sell(String existingCustomerName,long amount, String symbol, List<Company> company) {
		utility.sell(existingCustomerName,amount, symbol, company);
	}
	public void save(String filename) {
		
	}
	public void printReport(List<Company> company) {
		utility.display(company);
	}
}
