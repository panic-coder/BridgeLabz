package com.bridgeit.stock;

public class Customer {
	private String symbol;
	private long amount;
	private long shares;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public long getShares() {
		return shares;
	}
	public void setShares(long shares) {
		this.shares = shares;
	}
	@Override
	public String toString() {
		return "Customer [symbol=" + symbol + ", amount=" + amount + ", shares=" + shares
				+ "]";
	}
}
