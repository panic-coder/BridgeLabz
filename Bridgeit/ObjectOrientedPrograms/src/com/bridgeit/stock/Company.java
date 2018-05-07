package com.bridgeit.stock;

public class Company {
	private String company;
	private long sharesAvailable;
	private long pricePerShare;
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
	@Override
	public String toString() {
		return "Company [Company=" + company + ", SharesAvailable=" + sharesAvailable + ", PricePerShare="
				+ pricePerShare + "]";
	}

}
