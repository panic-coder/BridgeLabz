/**
 * Purpose : Class contains methods implemented by address book interface methods
 * 
 * @author Kumar Shubham
 * @since  30/04/2018
 *
 */
package com.bridgeit.addressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility;

public class AddressBookImpl implements AddressBook {
	Utility utility = new Utility();
	public static List<Person> list = new ArrayList<Person>();
	ObjectMapper mapper = new ObjectMapper();

	/* 
	 * Purpose : add person in person list
	 */
	public List<Person> add() {
		list.add(addUser());
		for (Person P : list) {
			System.out.println(P.toString());
		}
		return list;
	}
	
	static int count = 0;
	
	/* 
	 *Purpose : Edit information of existing Person from list 
	 */
	public void edit() {
		System.out.println("\n\t\t\tEnter first name");
		String firstName = utility.inputString();
		for (Person P : list) {
			if (firstName.equals(P.getFirstName())) {
				count++;
				System.out.println("\n\t\t\tData found\n");
				System.out.println("\t\t\t1. To edit Address\n" + "\t\t\t2. To edit Phone Number\n");
				int editChoice = utility.inputInteger();
				switch (editChoice) {
				case 1:
					editAddressPhone(P, 1);
					break;
				case 2:
					editAddressPhone(P, 2);
					break;
				default:
					System.out.println("\t\t\tSomething went wrong\n" + "\t\t\tTry again later");
				}
			} 
		}
		if(count==0)
			System.out.println("\n\t\t\tData not found");
	}

	/* 
	 * Purpose : Removing data of a person from list
	 */
	public void remove() throws Exception {
		System.out.println("\n\t\t\tEnter first name whose data is to be removed");
		String firstName = utility.inputString();
		int count = 0;
		List<Person> toRemove = new ArrayList<>();
		for (Person P : list) {
			if (firstName.equals(P.getFirstName())) {
				System.out.println("\n\t\t\tData found\n\n\t\t\tData Removed");
				toRemove.add(P);
				count++;
			}
		}
		list.removeAll(toRemove);
		if (count == 0)
			System.out.println("\n\t\t\tSorry, no such data found");
	}

	/* 
	 * Purpose : Sorting of list with respect to name
	 */
	public void sortByName() {
		Collections.sort(list, new SortByName());
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

	/*
	 * Purpose : Sorting of list respect to zip
	 */
	public void sortByZip() {
		Collections.sort(list, new SortByZip());
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}

	/* 
	 * Purpose : Displaying the list
	 */
	public void printAll() {
		for (Person P : list) {
			System.out.println(P.toString());
		}
	}

	/**
	 * Purpose : Adding information of person and add it in an object
	 * 
	 * @return object of person with added information in it
	 */
	private Person addUser() {
		Person person = new Person();
		Address address = new Address();
		System.out.println("\n\t\t\tEnter First Name");
		person.setFirstName(utility.inputString());
		System.out.println(person.getFirstName());
		System.out.println("\n\t\t\tEnter Last Name");
		person.setLastName(utility.inputString());
		System.out.println("\n\t\t\tEnter city");
		address.setCity(utility.inputString());
		System.out.println("\n\t\t\tEnter State");
		address.setState(utility.inputString());
		System.out.println("\n\t\t\tEnter ZipCode");
		address.setZip(utility.inputInteger());
		System.out.println("\n\t\t\tEnter Phone Number");
		person.setPhoneNumber(utility.inputString());
		person.setAddress(address);
		return person;
	}

	/**
	 * Purpose : Editing of Address and phone number
	 * 
	 * @param P is the person object
	 * @param i is the case for editing address or phone number
	 */
	private void editAddressPhone(Person P, int i) {
		switch (i) {
		case 1:
			System.out.println("\n\t\t\tEnter the state");
			P.address.setState(utility.inputString());
			System.out.println("\n\t\t\tEnter the city");
			P.address.setCity(utility.inputString());
			System.out.println("\n\t\t\tEnter the ZipCode");
			P.address.setZip(utility.inputInteger());
			System.out.println("\n\t\t\tNew Address updated");
			break;
		case 2:
			System.out.println("\n\t\t\tEnter the new Phone Number");
			String phoneNumber = utility.inputString();
			P.setPhoneNumber(phoneNumber);
			System.out.println("\n\t\t\tNew Phone Number updated ");
			break;
		}
	}

	/**
	 * Purpose : Saving list data in file 
	 * 
	 * @param file is the name of file in which list is saved 
	 */
	public void save(String file) {
		try {
			mapper.writeValue(new File("AddressBook/" + file + ".json"), list);
			System.out.println("\n\t\t\tSaved");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Purpose : Reading file from file
	 * 
	 * @param existingAddressBook is the name of File from which data is to read
	 * @throws Exception for file not found
	 */
	public void read(String existingAddressBook) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("AddressBook/" + existingAddressBook + ".json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Person>> type = new TypeReference<ArrayList<Person>>() {
				};
				list = objectMapper.readValue(arrayToJson, type);
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Purpose : clears the list from previous address book if new address book is opened
	 * 
	 * @param existingAddressBook
	 */
	public void close(String existingAddressBook) {
		list.clear();
	}

	/**
	 * Purpose : Saves the person list in a differnt file
	 */
	public void saveAs() {
		System.out.println("\n\t\t\tEnter the name of the new file");
		String fileNameNew = utility.inputString();
		save(fileNameNew);
		System.out.println("\n\t\t\tData saved in new file");
	}
}
