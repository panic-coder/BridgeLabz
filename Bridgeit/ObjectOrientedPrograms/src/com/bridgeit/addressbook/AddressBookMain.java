/**
 * Purpose : Main class for Address Book, all the methods are called from this class
 * 
 * @author Kumar Shubham
 * @since  30/04/2018
 *
 */
package com.bridgeit.addressbook;

import com.bridgeit.utility.Utility;

public class AddressBookMain {

	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		AddressBookManagerImpl addressBookManagerImpl = new AddressBookManagerImpl();
		String existingAddressBook = "";
		int loop = 0;

		while (loop == 0) {
			AddressBookImpl addressBook = new AddressBookImpl();
			System.out.println("\t\t\t________________________________________________\n"
					+ "\t\t\t|\t\t Address Book\t\t\t|\n"
					+ "\t\t\t|\t\t--------------\t\t\t|\n"
					+ "\t\t\t|\t1. Create new Address Book\t\t|\n"
					+ "\t\t\t|\t2. Open existing Address Book\t\t|\n"
					+ "\t\t\t|\t3. Save Address Book\t\t\t|\n"
					+ "\t\t\t|\t4. Save As Address Book\t\t\t|\n"
					+ "\t\t\t|\t5. Close Address Book\t\t\t|\n"  
					+ "\t\t\t|_______________________________________________|\n");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				addressBookManagerImpl.create();
				addressBookManagerImpl.close(existingAddressBook);
				break;
			case 2:
				addressBookManagerImpl.close(existingAddressBook);
				addressBookManagerImpl.readAddress();
				System.out.println("\n\t\t\tEnter the name of the address book\n");
				existingAddressBook = utility.inputString();
				if (addressBookManagerImpl.checkAddress(existingAddressBook)) {
					System.out.println("\t\t\tFile Exists\n");

					addressBookManagerImpl.read(existingAddressBook);
					int i = 0;
					while (i == 0) {
						System.out.println("\t\t\t___________________\n"
								+ "\t\t\t|       Menu       |\n"
								+ "\t\t\t|      ------      |\n"
								+ "\t\t\t| 1. Add           |\n"
								+ "\t\t\t| 2. Edit          |\n"
								+ "\t\t\t| 3. Remove        |\n"
								+ "\t\t\t| 4. Sort By Name  |\n"
								+ "\t\t\t| 5. Sort By Zip   |\n"
								+ "\t\t\t| 6. Display       |\n"
								+ "\t\t\t| 7. Exit          |\n"
								+ "\t\t\t|__________________|");
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
							System.out.println("\t\t\tTraversing to Main Menu");
							i = 1;
							break;
						default:
							System.out.println("\t\t\tWrong data recieved\n" + "\t\t\tAddress Book named '" + existingAddressBook
									+ "' closed\n");
							addressBook.close(existingAddressBook);
							i = 1;
							break;

						}
					}
				} else {
					System.out.println("\t\t\tEntered filename doesn't exist");
				}
				break;
			case 3:
				addressBookManagerImpl.save(existingAddressBook);
				break;
			case 4:
				addressBookManagerImpl.saveAs();
				break;
			case 5:
				System.out.println("\t\t\tClosing Address Book...!\n\t\t\tThank You");
				loop = 1;
				break;
			default:
				System.out.println("\t\t\tSorry, Something went wrong...!\n" + "\t\t\tAddress Book closed\n\t\t\tThank You");
				loop = 1;
				break;
			}
		}
	}
}
