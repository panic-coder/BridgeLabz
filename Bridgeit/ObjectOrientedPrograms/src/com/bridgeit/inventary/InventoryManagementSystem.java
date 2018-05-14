/**
 * Purpose : Adding, removing products into inventory and calculating its 
 * total weight, total price, saving it in a file and displaying it.
 * 
 * @author Kumar Shubham
 * @since  12/05/2018
 *
 */
package com.bridgeit.inventary;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class InventoryManagementSystem {
	public static List<Inventory> inventoryList = new ArrayList<Inventory>();
	public static void main(String[] args) throws Exception {
		Utility utility = new Utility();
		InventoryMethodsImpl inventoryMethodsImpl = new InventoryMethodsImpl(); 
		Inventory inventory = new Inventory();
		inventoryList = inventoryMethodsImpl.read("Inventory",inventoryList);
		long totalWeight = 0;
		long totalPrice = 0;
		int loop = 0;
		while(loop == 0) {
			System.out.println("1. Add\n2. Remove\n3. Calculate Total Weight \n4. Calculate Total price\n5. Display\n6. Save\n7. To Close Inventory");
			int choice = utility.inputInteger();
			switch(choice) {
			case 1:
				inventory = inventoryMethodsImpl.addInventory();
				inventoryList.add(inventory);
				break;
			case 2:
				inventoryList = inventoryMethodsImpl.removeInventory(inventoryList);
				break;
			case 3:
				totalWeight = inventoryMethodsImpl.totalWeight(inventoryList);
				System.out.println("\nTotal Weight of all products : "+totalWeight);
				break;
			case 4:
				totalPrice = inventoryMethodsImpl.totalPrice(inventoryList);
				System.out.println("\nTotal price of all products : "+totalPrice);
				break;
			case 5:
				inventoryMethodsImpl.display(inventoryList);
				break;
			case 6:
				inventoryMethodsImpl.save(inventoryList,"Inventory");
				break;
			case 7:
				loop = 1;
				System.out.println("\nInventory System Closed\nThank You");
				break;
			default:
				loop = 1;
				System.out.println("\nSomething went wrong\nInventory System Closed\nThank You");
				break;
			}
		}
	}
}
