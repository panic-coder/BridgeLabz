/**
 * Purpose : Interface for adding functionalities in the class which 
 * implements InventaryMethod interface. 
 * 
 * @author Kumar Shubham
 * @since  12/05/2018
 *
 */
package com.bridgeit.inventary;

import java.util.List;

public interface InventoryMethods {
	public Inventory addInventory();
	public long totalWeight(List<Inventory> inventaryList);
	public long totalPrice(List<Inventory> inventaryList);
	public void display(List<Inventory> inventaryList);
	public List<Inventory> removeInventory(List<Inventory> inventaryList);
}
