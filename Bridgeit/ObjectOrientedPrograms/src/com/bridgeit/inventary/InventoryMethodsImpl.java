/**
 * Purpose : Class implements InventaryMethods interface and all the logic are
 * this class.
 * 
 * @author Kumar Shubham
 * @since  12/05/2018
 * 
 */
package com.bridgeit.inventary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.utility.Utility;

public class InventoryMethodsImpl implements InventoryMethods{
	Utility utility = new Utility();
	
	/* 
	 * Purpose : Adding information of inventory products and returns inventory
	 * object after adding data into it. 
	 */
	public Inventory addInventory() {
		Inventory inventory = new Inventory();
		System.out.println("\nEnter the name of product");
		inventory.setName(utility.inputString());
		System.out.println("\nEnter the Weight of "+inventory.getName());
		inventory.setWeight(utility.inputInteger());
		System.out.println("\nEnter the price per Kg for "+inventory.getName());
		inventory.setPricePerKg(utility.inputInteger());
		return inventory;
	}

	/*
	 * Purpose : Calculating total weight of all the products in the inventory
	 * and returns the calculated weight
	 */
	public long totalWeight(List<Inventory> inventoryList) {
		long totalWeight = 0;
		for(Inventory inventory : inventoryList) {
			totalWeight = totalWeight + inventory.getWeight();
		}
		return totalWeight;
	}

	/* 
	 * Purpose : Calculating total price of all the products in the inventory
	 * and returns the calculated total price
	 */
	public long totalPrice(List<Inventory> inventoryList) {
		long totalPrice = 0;
		for(Inventory inventory : inventoryList) {
			totalPrice = totalPrice + ( inventory.getPricePerKg()*inventory.getWeight());
		}
		return totalPrice;
	}

	/* 
	 * Purpose : Displaying all the products in the inventory
	 */
	public void display(List<Inventory> inventoryList) {
		System.out.println();
		for(Inventory inventory : inventoryList) {
			System.out.println(inventory.toString());
		}
		
	}

	/**
	 * Purpose : Saving all the data into file
	 * 
	 * @param T is the list which contains all the details of the products
	 * @param file is the name of the file in which data is to be saved
	 */
	public <T> void save(List<T> T, String file) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("json/" + file + ".json"), T);
			System.out.println("\nSaved");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Purpose : Reads data from the file
	 * 
	 * @param file is the name of the file from which data is to read
	 * @param list is the in which data is to be saved
	 * @return the list in which data are there
	 * @throws Exception
	 */
	public List<Inventory> read(String file,List<Inventory> list) throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("json/" + file + ".json"));
			String arrayToJson;
			if ((arrayToJson = reader.readLine()) != null) {
				TypeReference<ArrayList<Inventory>> type = new TypeReference<ArrayList<Inventory>>() {
				};
				list = objectMapper.readValue(arrayToJson, type);
				reader.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	/* 
	 * Purpose : Removing and product from the inventory 
	 */
	public List<Inventory> removeInventory(List<Inventory> inventoryList) {
		System.out.println("\nEnter the name which you want to remove");
		String name = utility.inputString();
		int count = 0;
		List<Inventory> list = new ArrayList<>();
		for(Inventory inventary : inventoryList) {
			if(name.equals(inventary.getName())) {
				list.add(inventary);
				count++;
				System.out.println("\nRmoved");
			}
		}
		inventoryList.removeAll(list);
		if(count==0) {
			System.out.println("\nNo such data found");
		}
		return inventoryList;
	}

}
