/**
 * Purpose : Used for Sorting of data by name in address book
 * 
 * @author Kumar Shubham
 * @since  30/04/2018
 *
 */
package com.bridgeit.addressbook;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {

	/* 
	 * Compares data and returns 0 is data are same, 1 if first data is greater
	 * and -1 if second data is greater
	 */
	public int compare(Person personOne, Person personTwo) {
		if(personOne.getFirstName().equals(personTwo.getFirstName()))
			return 0;
		else {
			if(personOne.getFirstName().compareTo(personTwo.getFirstName())>0) {
				return 1;
			}else {
				return -1;
			}
		}
	}
}
