/**
 * Purpose : POJO for Transaction
 * 
 * @author Kumar Shubham
 * @since  07/05/2018
 *
 */
package com.bridgeit.stock;

public class Transaction {
	private String buySell;
	private String symbol;
	private String date;
	public String getBuySell() {
		return buySell;
	}
	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "\n\t\t\tTransaction \n\t\t\t\tbuySell : " + buySell + "\n\t\t\t\tsymbol : " + symbol + "\n\t\t\t\tdate : " + date + "\n";
	}

}
