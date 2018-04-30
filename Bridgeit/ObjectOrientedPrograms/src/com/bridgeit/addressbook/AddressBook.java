package com.bridgeit.addressbook;

import java.util.List;

public interface AddressBook {
	public List<Person> add();
	public void edit();
	public void remove();
	public void sortByName();
	public void sortByZip();
	public void printAll(List<Person> addPerson);
}
