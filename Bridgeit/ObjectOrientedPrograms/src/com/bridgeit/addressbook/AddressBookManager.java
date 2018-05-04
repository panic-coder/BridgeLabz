package com.bridgeit.addressbook;

import java.io.IOException;

public interface AddressBookManager {
	public void create()throws IOException;
	public void save(String file);
	public void saveAs();
	public void close(String file);
}
