package com.bridgeit.stock;

import java.util.List;

public interface StockAccount {
	public long valueOf(List<Company> company);
	public void buy(String existingCustomerName,long amount, String symbol, List<Company> company);
	public void sell(String existingCustomerName,long amount, String symbol, List<Company> company);
	public void save(String filename);
	public void printReport();
}
