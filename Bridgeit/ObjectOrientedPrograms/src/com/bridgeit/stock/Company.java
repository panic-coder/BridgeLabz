package com.bridgeit.stock;

public class Company {
	//private String company;
	private String symbol;
	private long pricePerShare;
	private long totalShares;
	/*public Company(String company, String symbol, long pricePerShare, long totalShares) {
		super();
		this.company = company;
		this.symbol = symbol;
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
	}*/
	/*public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}*/
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public long getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(long pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
	public long getTotalShares() {
		return totalShares;
	}
	public void setTotalShares(long totalShares) {
		this.totalShares = totalShares;
	}
	public String toString() {
		return " "+symbol+" "+pricePerShare+" "+" "+totalShares;
		
	}
}
