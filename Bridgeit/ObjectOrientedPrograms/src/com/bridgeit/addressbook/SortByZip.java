package com.bridgeit.addressbook;

import java.util.Comparator;

public class SortByZip implements Comparator<Person> {

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
