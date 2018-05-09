package com.bridgeit.addressbook;

import java.util.Comparator;

/**
 * Purpose : Used for sorting of data by zip in address book
 * 
 * @author Kumar Shubham
 * @since  30/04/2018
 *
 */
public class SortByZip implements Comparator<Person> {

	/* 
	 * Compares data and returns 0 is data are same, 1 if first data is greater
	 * and -1 if second data is greater
	 */
	@Override
	public int compare(Person p1, Person p2) {
		if(p1.address.getZip()==p2.address.getZip())
			return 0;
		else {
			if(p1.address.getZip()>p2.address.getZip()) {
				return 1;
			}else {
				return -1;
			}
		}
	}

}
