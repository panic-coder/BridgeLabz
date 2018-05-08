package com.bridgeit.stock;

public class Company 
{
	private String company;
	private long sharesAvailable;
	private long pricePerShare;
	@Override
	public String toString() {
		return "Company [company=" + company + ", sharesAvailable=" + sharesAvailable + ", pricePerShare="
				+ pricePerShare + "]";
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public long getSharesAvailable() {
		return sharesAvailable;
	}
	public void setSharesAvailable(long sharesAvailable) {
		this.sharesAvailable = sharesAvailable;
	}
	public long getPricePerShare() {
		return pricePerShare;
	}
	public void setPricePerShare(long pricePerShare) {
		this.pricePerShare = pricePerShare;
	}
}
