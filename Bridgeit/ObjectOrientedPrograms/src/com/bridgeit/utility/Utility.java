package com.bridgeit.utility;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utility {
	Scanner scanner;
	Random random;

	public Utility() {
		scanner = new Scanner(System.in);
		random = new Random();
	}

	// RANDOM Numbers
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	// INPUT Integer
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT Double
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	// INPUT Boolean
	public boolean inputBoolean() {
		try {
			return scanner.nextBoolean();
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	/**
		 * Calculates total file and prints the output in json file 
		 */
		@SuppressWarnings("unchecked")
		public void ricePulseWheat() {
			String[] items = new String[3];
			String[] item2 = new String[3];
			String[] item3 = new String[3];
			items[0] = "Wheat";
			items[1] = "Pulses";
			items[2] = "Rice";
			String name;
			String weight;
			String price;
			int r=0;
			while(r<3) {
					
				
				System.out.println("Enter the name ");
				items[r] = inputString();
				System.out.println("Enter weight");
				item2[r] = inputString();
				System.out.println("Enter price");
				item3[r] = inputString();
				r++;
			}
			
			

	try

	{
		JSONObject jo = new JSONObject();
				jo.put("Price", item3[0]);
				jo.put("Weight", item2[0]);
				jo.put("Name", items[0]);
				

				JSONObject jo1 = new JSONObject();
						jo1.put("Price", item3[1]);
						jo1.put("Weight", item2[1]);
						jo1.put("Name", items[1]);

				JSONObject jo2 = new JSONObject();
						jo2.put("Price", item3[2]);
						jo2.put("Weight", item2[2]);
						jo2.put("Name", items[2]);
	/*	jo.put("Name", name);
		jo.put("Weight", weight);
		jo.put("Price", price);
	*/	JSONArray ja = new JSONArray();
		ja.add(jo);
		ja.add(jo1);
		ja.add(jo2);
		@SuppressWarnings("resource")
		FileWriter file = new FileWriter("riceInput.json");
		file.write(ja.toJSONString());
		file.flush();
		System.out.println("Successfully taken user input and written in file\n");
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}
	/*
	 * String name; String weight; String price;
	 */
	int priceInt = 0, weightInt = 0, totalPrice = 0, weightSum = 0;
	JSONParser jsonParser = new JSONParser();try
	{
		JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("riceInput.json"));
		System.out.println(jsonArray);
		for (Object obj : jsonArray) {
			JSONObject jsonObject = (JSONObject) obj;

			name = (String) jsonObject.get("Name");
			// System.out.println(name);
			
			price = (String) jsonObject.get("Price");
			priceInt = Integer.parseInt(price);
			// System.out.println(price);
			
			weight = (String) jsonObject.get("Weight");
			weightInt = Integer.parseInt(weight);
			weightSum += weightInt;
			// System.out.println(weight);
			
			
			totalPrice = totalPrice + (priceInt * weightInt);
		}
		System.out.println("================\nTotal Price : "+totalPrice+"\n================\n");
		try {
			JSONObject jo = new JSONObject();
			jo.put("TotalWeight", weightSum);
			jo.put("TotalPrice", totalPrice);
			JSONArray ja = new JSONArray();
			ja.add(jo);
			@SuppressWarnings("resource")
			FileWriter file = new FileWriter("riceOutput.json");
			file.write(ja.toJSONString());
			file.flush();
			System.out.println("Successfully written output in file");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}catch(
	Exception e)
	{
		e.printStackTrace();
	}
	}

	/**
		 * @param string
		 * @param firstName
		 * @param lastName
		 * @param phoneNumber
		 * @return replaced string with original firstName, lastName and phoneNumber
		 */
		public static String replaceExpressionDemonstration(String string,String firstName,String lastName,String phoneNumber) {
			string=string.replaceAll("<<name>>", firstName);
			string=string.replaceAll("<<full name>>", lastName);
			string=string.replaceAll("xxxxxxxxxx", phoneNumber);
			LocalDate ldate = LocalDate.now();
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			 //Date date = new Date(0, 0, 0);
			 String day=ldate.format(formatter);  
			
			//String day = String.valueOf(date);
			string=string.replaceAll("01/01/2016", day);
			return string;
			
		}

	/**
		 * Computes total price of share and display the table of company share and price
		 */
		public static void getstockReport() {
			String name;
			long sharesAvailable;
			long pricePerShare; 
			long price;
			long totalPrice=0;
			JSONParser jsonParser = new JSONParser();
			System.out.println("Company\t\t\t\tShares\t\t\t\tPrice per share\t\tPrice");
			System.out.println("=======\t\t\t\t======\t\t\t\t===============\t\t=====");
			try {
				JSONArray jsonArray = (JSONArray)jsonParser.parse(new FileReader("stockInput.json"));
				//System.out.println(jsonArray);
				for(Object o:jsonArray) {
					JSONObject jsonObject = (JSONObject)o;
					name = (String)jsonObject.get("Company");
					System.out.print(name+"\t\t\t\t");
					sharesAvailable = (long) jsonObject.get("SharesAvailable");
					System.out.print(sharesAvailable+"\t\t\t\t");
					pricePerShare = (long)jsonObject.get("PricePerShare");
					System.out.print(pricePerShare+"\t\t\t");
					price = pricePerShare*sharesAvailable;
					System.out.print(price);
					totalPrice = totalPrice+price;
					System.out.println();
				}
				System.out.println("\nTotal Price : "+totalPrice);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
}
