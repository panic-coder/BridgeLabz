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
		return "Transaction [buySell=" + buySell + ", symbol=" + symbol + ", date=" + date + "]";
	}

}
