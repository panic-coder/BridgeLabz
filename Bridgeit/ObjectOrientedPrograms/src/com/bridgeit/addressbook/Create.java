package com.bridgeit.addressbook;

import java.io.File;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class Create {

	public void createAddress() throws IOException {
		Utility utility = new Utility();
		System.out.println("Enter the name of address book");
		String NewAddressBookName = utility.inputString();
		File file = new File("AddressBook//"+NewAddressBookName+".json");
		if (file.createNewFile()){
		System.out.println("File is created!");
		}else{
		System.out.println("File already exists.");
		}
	}
	
	 public void readAddress() {
         File f = new File("AddressBook/");
         int count = 0;
         for (File file : f.listFiles()) {
                 if (file.isFile()) {
                	 System.out.println(file.getName());
                         count++;
                 }
         }
         System.out.println("Number of files: " + count);
 }

	public boolean checkAddress(String existingAddressBook) {
		File f = new File("AddressBook/");
		int count=0;
        for (File file : f.listFiles()) {
                if (file.isFile()) {
               	 if(file.getName().equals(existingAddressBook+".json")){
               	 count++;
               	 break;
               	 }
                }
        }
        if(count==1)
        	return true;
        else
        	return false;
	}

}
