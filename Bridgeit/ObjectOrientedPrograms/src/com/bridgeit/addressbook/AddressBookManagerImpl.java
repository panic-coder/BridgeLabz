package com.bridgeit.addressbook;

import java.io.File;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class AddressBookManagerImpl implements AddressBookManager {

	public void create() throws IOException {
		Utility utility = new Utility();
		System.out.println("\n\t\t\tEnter the name of address book");
		String NewAddressBookName = utility.inputString();
		File file = new File("AddressBook//" + NewAddressBookName + ".json");
		if (file.createNewFile()) {
			System.out.println("\n\t\t\tFile is created!");
		} else {
			System.out.println("\n\t\t\tFile already exists.");
		}
	}

	public void save(String file) {
		AddressBookImpl ab = new AddressBookImpl();
		ab.save(file);
	}

	public void read(String existingAddressBook) throws Exception {
		AddressBookImpl ab = new AddressBookImpl();
		ab.read(existingAddressBook);
	}

	public void readAddress() {
		File f = new File("AddressBook/");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				System.out.println("\n\t\t\t"+file.getName());
				count++;
			}
		}
		System.out.println("\n\t\t\tNumber of files: " + count);
	}

	public boolean checkAddress(String existingAddressBook) {
		File f = new File("AddressBook/");
		int count = 0;
		for (File file : f.listFiles()) {
			if (file.isFile()) {
				if (file.getName().equals(existingAddressBook + ".json")) {
					count++;
					break;
				}
			}
		}
		if (count == 1)
			return true;
		else
			return false;
	}

	public void close(String existingAddressBook) {
		AddressBookImpl ab = new AddressBookImpl();
		ab.close(existingAddressBook);
	}

	public void saveAs() {
		AddressBookImpl ab = new AddressBookImpl();
		ab.saveAs();
		
	}
}
