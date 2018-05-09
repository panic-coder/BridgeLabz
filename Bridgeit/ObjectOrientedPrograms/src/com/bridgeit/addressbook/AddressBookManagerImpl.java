/**
 * Purpose : Contains methods implemented via interface address book manager
 *  
 * @author Kumar Shubham
 * @since  30/04/2018
 *
 */
package com.bridgeit.addressbook;

import java.io.File;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class AddressBookManagerImpl implements AddressBookManager {

	/* 
	 * Purpose : Creates new file 
	 */
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

	/* 
	 * Purpose : Calls save method in AddressBookImpl class with the name of file
	 * in which data is to be saved
	 */
	public void save(String file) {
		AddressBookImpl ab = new AddressBookImpl();
		ab.save(file);
	}

	/**
	 * Purpose : Calls read method in AddressBookImpl class with the name of file
	 * through which data is to read
	 * 
	 * @param existingAddressBook is the name of the file through which file is being read
	 * @throws Exception
	 */
	public void read(String existingAddressBook) throws Exception {
		AddressBookImpl ab = new AddressBookImpl();
		ab.read(existingAddressBook);
	}

	/**
	 * Purpose : CHecks total number of files present and displays the file names
	 */
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

	/**
	 * Purpose : Checks whether the file is present or not
	 * 
	 * @param existingAddressBook is the name of file to be checked 
	 * @return returns true if file is present or false if is not present
	 */
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

	/*
	 * Purpose : Calls close method in AddressBookImpl class with the name of file
	 * whose list is to be cleared if new address book is being opened
	 */
	public void close(String existingAddressBook) {
		AddressBookImpl ab = new AddressBookImpl();
		ab.close(existingAddressBook);
	}

	/* 
	 * Purpose : Calls saveAs method in AddressBookImpl class with the name of file
	 * in which data is to be saved
	 */
	public void saveAs() {
		AddressBookImpl ab = new AddressBookImpl();
		ab.saveAs();
		
	}
}
