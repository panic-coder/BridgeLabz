package com.bridgeit.stock;

public class Customer {
	private String symbol;
	private long pricePerShare;
	private long shares;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public long getAmount() {
		return pricePerShare;
	}
	public void setAmount(long amount) {
		this.pricePerShare = amount;
	}
	public long getShares() {
		return shares;
	}
	public void setShares(long shares) {
		this.shares = shares;
	}
}
