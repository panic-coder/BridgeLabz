package com.bridgeit.addressbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.Utility;

public class AddressBookMain {
	
	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();
		AddressBookManagerImpl create = new AddressBookManagerImpl();
		String existingAddressBook = "";
		int loop = 0;
		
		while (loop == 0) {
			AddressBookImpl addressBook = new AddressBookImpl();
			System.out.println("1. Create new Address Book\n" + "2. Open existing Address Book\n"
					+ "3. Save Address Book\n" + "4. Close Address Book");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				create.createAddress();
				break;
			case 2:
				create.readAddress();
				System.out.println("Enter the name of the address book");
				existingAddressBook = utility.inputString();
				if (create.checkAddress(existingAddressBook)) {
					System.out.println("File Exists");
					create.read(existingAddressBook);
					int i = 0;
					while (i == 0) {
						System.out.println("1. Add\n" + "2. Edit\n" + "3. Remove\n" + "4. Sort By Name\n"
								+ "5. Sort By Zip\n" + "6. Display\n" + "7. Exit");
						int choose = utility.inputInteger();
						switch (choose) {
						case 1:
							addressBook.add();
							break;
						case 2:
							addressBook.edit();
							break;
						case 3:
							addressBook.remove();
							break;
						case 4:
							addressBook.sortByName();
							break;
						case 5:
							addressBook.sortByZip();
							break;
						case 6:
							addressBook.printAll();
							break;
						case 7:
							System.out.println("Closing address book named '" + existingAddressBook+"'");
							i = 1;
							break;
						default:
							System.out.println("Wrong data recieved\n" + "Address Book named '" + existingAddressBook
									+ "' closed\n");
							i = 1;
							break;

						}
					}
				} else {
					System.out.println("Entered filename doesn't exist");
				}
				break;
			case 3:
				create.save(existingAddressBook);
				break;
			case 4:
				System.out.println("Closing Address Book...!\nThank You");
				loop = 1;
				break;
			default:
				System.out.println("Sorry, Something went wrong...!\n" + "Address Book closed\nThank You");
				loop = 1;
				break;
			}
		}
	}
}
