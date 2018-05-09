/**
 * Purpose : POJO for Company
 * 
 * @author Kumar Shubham
 * @since  07/05/2018
 *
 */
package com.bridgeit.stock;

public class Company 
{
	private String company;
	private long sharesAvailable;
	private long pricePerShare;
	@Override
	public String toString() {
		return "\n\t\t\tCompany \n\t\t\t\tcompany : " + company + "\n\t\t\t\tsharesAvailable : " + sharesAvailable + "\n\t\t\t\tpricePerShare : "
				+ pricePerShare +"\n";
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
