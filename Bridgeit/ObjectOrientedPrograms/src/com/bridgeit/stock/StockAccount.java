/**
 * Purpose : Interface for adding functionalities of buy, sell, save and display 
 * 
 * @author Kumar Shubham
 * @since  07/05/2018
 *
 */
package com.bridgeit.stock;

import java.util.List;

public interface StockAccount {
	public long valueOf(List<Company> company);
	public void buy();
	public void sell();
	public void save(String filename,String name);
	public void printReport();
}
