/**
 * Purpose : Interface to add functionalities to add, edit, remove, sort by name, 
 * sort by zip and display with respect to Person
 * 
 * @author Kumar Shubham
 * @since  30/04/2018
 *
 */
package com.bridgeit.addressbook;

import java.util.List;

public interface AddressBook {
	public List<Person> add();
	public void edit();
	public void remove() throws Exception;
	public void sortByName();
	public void sortByZip();
	public void printAll();
}
