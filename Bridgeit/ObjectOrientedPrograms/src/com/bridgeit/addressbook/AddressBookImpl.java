package com.bridgeit.addressbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.Utility;

public class AddressBookImpl implements AddressBook {
	Utility utility = new Utility();
	public static List<Person> list = new ArrayList<Person>();
	ObjectMapper mapper = new ObjectMapper();
	public List<Person> add() {
		list.add(addUser());
		for (Person P : list) {
			System.out.println(P.toString());
		}
		return list;
	}

	public void edit() {
		System.out.println("Enter first name");
		String firstName = utility.inputString();
		for (Person P : list) {
			if (firstName.equals(P.getFirstName())) {
				System.out.println("Data found");
				System.out.println("1. To edit Address\n" + "2. To edit Phone Number");
				int editChoice = utility.inputInteger();
				switch (editChoice) {
				case 1:
					editAddressPhone(P, 1);
					break;
				case 2:
					editAddressPhone(P, 2);
					break;
				default:
					System.out.println("Something went wrong\n" + "Try again later");
				}
			} else {
				System.out.println("Sorry, no such data found");
			}
		}
	}

	public void remove() {
		System.out.println("Enter first name whose data is to be removed");
		String firstName = utility.inputString();
		int count = 0;
		for(Person P : list) {
			if(firstName.equals(P.getFirstName())) {
				System.out.println("Data found");
				list.remove(P);
				count++;
			}
		}
		if(count==0)
			System.out.println("Sorry, no such data found");
	}

	public void sortByName() {
		Collections.sort(list, new SortByName());
		for(Person person : list) {
			System.out.println(person.toString());
		}
	}

	public void sortByZip() {
		Collections.sort(list, new SortByZip());
		for(Person person : list) {
			System.out.println(person.toString());
		}
	}

	public void printAll() {
		for (Person P : list) {
			System.out.println(P.toString() + " Hi");
		}
	}

	private Person addUser() {
		Person person = new Person();
		Address address = new Address();
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
		return person;
	}
	
	private void editAddressPhone(Person P, int i) {
		switch (i) {
		case 1:
			System.out.println("Enter the state");
			P.address.setState(utility.inputString());
			System.out.println("Enter the city");
			P.address.setCity(utility.inputString());
			System.out.println("Enter the ZipCode");
			P.address.setZip(utility.inputInteger());
			System.out.println("New Address updated");
			break;
		case 2:
			System.out.println("Enter the new Phone Number");
			String phoneNumber = utility.inputString();
			P.setPhoneNumber(phoneNumber);
			System.out.println("New Phone Number updated ");
			break;
		}
	}

	public void save(String file) {

		try {
			mapper.writeValue(new File("AddressBook/"+file+".json"), list);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void read(String file) {
		
		 try {
			list = (List<Person>) mapper.readValue(new FileInputStream("AddressBook/"+file+".json"), Person.class );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



}
