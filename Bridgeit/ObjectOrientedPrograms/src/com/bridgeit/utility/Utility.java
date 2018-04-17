package com.bridgeit.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeit.stock.Company;

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
	 * Reads the values writes in json file and then calculates the total price and
	 * writes total price in json file
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
		int r = 0;
		while (r < 3) {

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
			/*
			 * jo.put("Name", name); jo.put("Weight", weight); jo.put("Price", price);
			 */ JSONArray ja = new JSONArray();
			ja.add(jo);
			ja.add(jo1);
			ja.add(jo2);
			@SuppressWarnings("resource")
			FileWriter file = new FileWriter("riceInput.json");
			file.write(ja.toJSONString());
			file.flush();
			System.out.println("Successfully taken user input and written in file\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * String name; String weight; String price;
		 */
		int priceInt = 0, weightInt = 0, totalPrice = 0, weightSum = 0;
		JSONParser jsonParser = new JSONParser();
		try {
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
			System.out.println("================\nTotal Price : " + totalPrice + "\n================\n");
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
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Takes String and replaces its <<name>> with first name, <<full name>> with
	 * last name, and xxxxxxxxxx with phone number with validating it via regex.
	 * 
	 * @param string
	 *            String where replacements are to be done
	 * @param firstName
	 *            First Name of the user
	 * @param lastName
	 *            Last Name of the user
	 * @param phoneNumber
	 *            Phone number of the user
	 * @return replaced string with original firstName, lastName and phoneNumber
	 */
	public static String replaceExpressionDemonstration(String string, String firstName, String lastName,
			String phoneNumber) {
		string = string.replaceAll("<<name>>", firstName);
		string = string.replaceAll("<<full name>>", lastName);
		string = string.replaceAll("xxxxxxxxxx", phoneNumber);
		LocalDate ldate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Date date = new Date(0, 0, 0);
		String day = ldate.format(formatter);

		// String day = String.valueOf(date);
		string = string.replaceAll("01/01/2016", day);
		return string;

	}

	/**
	 * Computes total price of share and display the table of company share and
	 * price
	 */
	public static void getstockReport() {
		String name;
		long sharesAvailable;
		long pricePerShare;
		long price;
		long totalPrice = 0;
		JSONParser jsonParser = new JSONParser();
		System.out.println("Company\t\t\t\tShares\t\t\t\tPrice per share\t\tPrice");
		System.out.println("=======\t\t\t\t======\t\t\t\t===============\t\t=====");
		try {
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("stockInput.json"));
			// System.out.println(jsonArray);
			for (Object o : jsonArray) {
				JSONObject jsonObject = (JSONObject) o;
				name = (String) jsonObject.get("Company");
				System.out.print(name + "\t\t\t\t");
				sharesAvailable = (long) jsonObject.get("SharesAvailable");
				System.out.print(sharesAvailable + "\t\t\t\t");
				pricePerShare = (long) jsonObject.get("PricePerShare");
				System.out.print(pricePerShare + "\t\t\t");
				price = pricePerShare * sharesAvailable;
				System.out.print(price);
				totalPrice = totalPrice + price;
				System.out.println();
			}
			System.out.println("\nTotal Price : " + totalPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Calculates the total value
	 */
	public void stockTotalShares() {
		JSONParser jsonParser = new JSONParser();
		try {
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("stockAccountInput.json"));
			System.out.println(jsonArray);
			System.out.println("=================================================");
			System.out.println("Symbol\t  Price Per Share    Total Shares");
			System.out.println("======\t  ===============    ============");
			for (Object o : jsonArray) {
				JSONObject jsonObject = (JSONObject) o;
				// String name = (String)jsonObject.get("Company");
				// System.out.print(name+"\t\t");
				String symbol = (String) jsonObject.get("Symbol");
				System.out.print(symbol + "\t\t");
				long priceperShare = (long) jsonObject.get("PricePerShare");
				System.out.print(priceperShare + "\t\t");
				long totalShare = (long) jsonObject.get("TotalShare");
				System.out.print(totalShare + "\t\t");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Buying shares and updating it in json file
	 * 
	 * @param amount
	 *            Amount by which user will buy shares
	 * @param userSymbol
	 *            company symbol for buying shares of that particular company
	 */
	@SuppressWarnings("unchecked")
	public void buyShares(int amount, String userSymbol) {
		JSONParser jsonParser = new JSONParser();
		long totalShare;
		long pricePerShare;
		long totalSharesAfterPurchase;
		// long[]
		try {
			JSONArray jsonArrayOut = new JSONArray();
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("stockAccountInput.json"));
			for (Object o : jsonArray) {
				JSONObject jsonObject = (JSONObject) o;
				String company = (String) jsonObject.get("Company");
				String symbol = (String) jsonObject.get("Symbol");
				totalShare = (long) jsonObject.get("TotalShare");
				pricePerShare = (long) jsonObject.get("PricePerShare");
				if (symbol.equals(userSymbol)) {
					// System.out.println(pricePerShare);
					totalSharesAfterPurchase = totalShare - (amount / pricePerShare);
					System.out.println("Updated Stock");
					System.out.println("=================================================");
					System.out.println("Symbol\t  Price Per Share    Total Shares");
					System.out.println("======\t  ===============    ============");
					System.out.print(symbol + "\t\t");
					System.out.print(pricePerShare + "\t\t");
					System.out.println(totalSharesAfterPurchase + "\t\t");
					jsonObject.put("Company", company);
					jsonObject.put("Symbol", symbol);
					jsonObject.put("PricePerShare", pricePerShare);
					jsonObject.put("TotalShare", totalSharesAfterPurchase);
				} else {
					jsonObject.put("Company", company);
					jsonObject.put("Symbol", symbol);
					jsonObject.put("PricePerShare", pricePerShare);
					jsonObject.put("TotalShare", totalShare);
				}
				jsonArrayOut.add(jsonObject);
			}
			FileWriter file = new FileWriter("stockAccountInput.json");
			file.write(jsonArrayOut.toJSONString());
			file.flush();
			file.close();
			System.out.println("Successfully written output in file");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Selling shares and updating in json file
	 * 
	 * @param amount
	 *            Entered by user to sell shares
	 * @param userSymbol
	 *            Company symbol required for selling shares
	 */
	public void sellShares(int amount, String userSymbol) {
		JSONParser jsonParser = new JSONParser();
		long totalShare;
		long pricePerShare;
		long totalSharesAfterPurchase;
		try {
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("stockAccountInput.json"));
			for (Object o : jsonArray) {
				JSONObject jsonObject = (JSONObject) o;
				String symbol = (String) jsonObject.get("Symbol");
				totalShare = (long) jsonObject.get("TotalShare");
				if (symbol.equals(userSymbol)) {
					pricePerShare = (long) jsonObject.get("PricePerShare");
					// System.out.println(pricePerShare);
					totalSharesAfterPurchase = totalShare + (amount / pricePerShare);
					System.out.println("Updated Stock");
					System.out.println("=================================================");
					System.out.println("Symbol\t  Price Per Share    Total Shares");
					System.out.println("======\t  ===============    ============");
					System.out.print(symbol + "\t\t");
					System.out.print(pricePerShare + "\t\t");
					System.out.println(totalSharesAfterPurchase + "\t\t");

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * public void fetch() { ArrayList<String> companyList = new
	 * ArrayList<String>(); JSONParser jsonParser = new JSONParser(); try {
	 * 
	 * File file = new File("stockAccountInput.json"); String path =
	 * file.getAbsolutePath(); JSONArray jsonArray = (JSONArray)
	 * jsonParser.parse(new FileReader("stockAccountInput.json"));
	 * System.out.println(jsonArray); for(Object o : jsonArray) { JSONObject
	 * jsonObject = (JSONObject)o; String companyName =
	 * (String)jsonObject.get("Company"); companyList.add(companyName); } //
	 * companyList.add();
	 * 
	 * for(String item:companyList) { System.out.println(item); } }catch(Exception
	 * e) { e.printStackTrace(); }
	 * 
	 * }
	 */
	/**
	 * Reads json file and stores its data in an array list
	 * 
	 * @return List in which there are Company symbol, price per share and total
	 *         share
	 * @throws Exception
	 * @throws IOException
	 * @throws ParseException
	 */
	public List<Company> getCompanyInfo() throws Exception, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		List<Company> companyList = new ArrayList<>();
		JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("stockAccountInput.json"));
		for (Object o : jsonArray) {
			JSONObject jsonObject = (JSONObject) o;
			Company company = new Company();
			// String companyName = (String) jsonObject.get("Company");
			// company.setCompany(companyName);
			String symbol = (String) jsonObject.get("Symbol");
			company.setSymbol(symbol);
			long pricePerShare = (long) jsonObject.get("PricePerShare");
			company.setPricePerShare(pricePerShare);
			long totalShare = (long) jsonObject.get("TotalShare");
			company.setTotalShares(totalShare);
			companyList.add(company);
		}
		return companyList;
	}

	public void createNewAccount(String filename) {
		File file = new File(filename + ".json");
		boolean fileCreated = false;
		try {
			fileCreated = file.createNewFile();
		} catch (IOException e) {
			System.out.println("Error creating file : " + e);
		}
		if (fileCreated)
			System.out.println("File Created : " + file.getPath());
		else
			System.out.println("Failed to creat file : " + file.getPath());
	}

	public long totalValuesOfShares(List<Company> company) {
		long totalShares = 0;
		for (Company c : company) {
			long share = c.getTotalShares();
			long price = c.getPricePerShare();
			totalShares += (share * price);
		}
		return totalShares;
	}

	public /*List<Company>*/void buy(long amount, String symbol, List<Company> company) {
		for (Company c : company) {
			if (c.getSymbol().equals(symbol)) {
				long price = c.getPricePerShare();
				if (amount >= price) {
					long numberOfShares = amount / price;
					long totalShares = c.getTotalShares();
					c.setTotalShares(totalShares - numberOfShares);
					System.out.println(c.getTotalShares());
				}else {
					System.out.println("Amount entered is less than price of one share");
				}
			}
		}
		//return company;
	}

	public void display(List<Company> company) {
		for (Company c : company) {
			System.out.println(c);
		}
	}

	
}