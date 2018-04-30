package com.bridgeit.addressbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.Utility;

public class AddressBookImpl implements AddressBook {
	Utility utility = new Utility();
	List<Person> list = new ArrayList<Person>();
	Person person = new Person();
	Address address = new Address();

	public List<Person> add() {
		System.out.println("Enter First Name");
		person.setFirstName(utility.inputString());
		System.out.println(person.getFirstName());
		System.out.println("Enter Last Name");
		person.setLastName(utility.inputString());
		System.out.println("Enter city");
		address.setCity(utility.inputString());
		System.out.println("Enter State");
		address.setState(utility.inputString());
		System.out.println("Enter ZipCode");
		address.setZip(utility.inputInteger());
		System.out.println("Enter Phone Number");
		person.setPhoneNumber(utility.inputString());
		person.setAddress(address);
		list.add(person);
		for (Person P : list) {
			System.out.println(P.toString());
		}
		return list;

	}

	public void edit() {

	}

	public void remove() {

	}

	public void sortByName() {

	}

	public void sortByZip() {

	}

	public void printAll(List<Person> addPerson) {
		for (Person P : addPerson) {
			System.out.println(P.toString() + " Hi");
		}
	}

	public void save(String existingAddressBook) throws JsonGenerationException, JsonMappingException, IOException {
		List<Person> list = person.getPersonList();
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("AddressBook/" + existingAddressBook + ".json"), list);
	}
}
