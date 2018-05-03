package com.bridgeit.addressbook;

import java.io.IOException;

public interface AddressBookManager {
	public void create()throws IOException;
	public void read(String file)throws Exception;
	public void save(String file);
}
