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

	/**
	 * Generating Random Numbers with bound
	 * 
	 * @param bound
	 * @return generated Random Number
	 */
	public int inputRandom(int bound) {
		try {
			return random.nextInt(bound);
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	/**
	 * Generating Random Numbers without bound
	 * 
	 * @return generated Random Number
	 */
	public int inputRandom() {
		try {
			return random.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for String
	 * 
	 * @return INPUT STRING
	 */
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}
	
	/**
	 * Takes input with the user via Scanner for StringLine
	 * 
	 * @return INPUT STRING LINE
	 */
	public String inputStringLine() {
		try {
			return scanner.nextLine();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
	}

	/**
	 * Takes input with the user via Scanner for Integer
	 * 
	 * @return INPUT INTEGER
	 */
	public int inputInteger() {
		try {
			return scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Double
	 * 
	 * @return INPUT DOUBLE
	 */
	public double inputDouble() {
		try {
			return scanner.nextDouble();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}

	/**
	 * Takes input with the user via Scanner for Boolean
	 * 
	 * @return INPUT BOOLEAN
	 */
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

			System.out.println("Enter the details for "+items[r]);
			//items[r] = inputString();
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
			
			JSONArray ja = new JSONArray();
			ja.add(jo);
			ja.add(jo1);
			ja.add(jo2);
			@SuppressWarnings("resource")
			FileWriter file = new FileWriter("json/riceInput.json");
			file.write(ja.toJSONString());
			file.flush();
			System.out.println("Successfully taken user input and written in file\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int priceInt = 0, weightInt = 0, totalPrice = 0, weightSum = 0;
		JSONParser jsonParser = new JSONParser();
		try {
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("json/riceInput.json"));
			System.out.println(jsonArray);
			for (Object obj : jsonArray) {
				JSONObject jsonObject = (JSONObject) obj;

				name = (String) jsonObject.get("Name");

				price = (String) jsonObject.get("Price");
				priceInt = Integer.parseInt(price);

				weight = (String) jsonObject.get("Weight");
				weightInt = Integer.parseInt(weight);
				weightSum += weightInt;

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
				FileWriter file = new FileWriter("json/riceOutput.json");
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
		String day = ldate.format(formatter);

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
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("json/stockInput.json"));
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
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("json/stockAccountInput.json"));
			System.out.println(jsonArray);
			System.out.println("=================================================");
			System.out.println("Symbol\t  Price Per Share    Total Shares");
			System.out.println("======\t  ===============    ============");
			for (Object o : jsonArray) {
				JSONObject jsonObject = (JSONObject) o;
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
		try {
			JSONArray jsonArrayOut = new JSONArray();
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("json/stockAccountInput.json"));
			for (Object o : jsonArray) {
				JSONObject jsonObject = (JSONObject) o;
				String company = (String) jsonObject.get("Company");
				String symbol = (String) jsonObject.get("Symbol");
				totalShare = (long) jsonObject.get("TotalShare");
				pricePerShare = (long) jsonObject.get("PricePerShare");
				if (symbol.equals(userSymbol)) {
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
			FileWriter file = new FileWriter("json/stockAccountInput.json");
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
			JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("json/stockAccountInput.json"));
			for (Object o : jsonArray) {
				JSONObject jsonObject = (JSONObject) o;
				String symbol = (String) jsonObject.get("Symbol");
				totalShare = (long) jsonObject.get("TotalShare");
				if (symbol.equals(userSymbol)) {
					pricePerShare = (long) jsonObject.get("PricePerShare");
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

	
	/**
	 * Reads json file and stores its data in an array list
	 * 
	 * @return List in which there are Company symbol, price per share and total
	 *         share
	 * @throws Exception
	 * @throws IOException
	 * @throws ParseException
	 */
/*	public List<Company> getCompanyInfo() throws Exception, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		List<Company> companyList = new ArrayList<>();
		JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("json/stockAccountInput.json"));
		for (Object o : jsonArray) {
			JSONObject jsonObject = (JSONObject) o;
			Company company = new Company();
			String symbol = (String) jsonObject.get("Symbol");
			company.setSymbol(symbol);
			long pricePerShare = (long) jsonObject.get("PricePerShare");
			company.setPricePerShare(pricePerShare);
			long totalShare = (long) jsonObject.get("SharesAvailable");
			company.setTotalShares(totalShare);
			companyList.add(company);
		}
		return companyList;
	}
*/
	/**
	 * Creates new file with the name of the user and keeps all their transactions
	 * 
	 * @param filename name with which new json file is being created
	 */
	public void createNewAccount(String filename) {
		File file = new File("json/" + filename + ".json");
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

	/**
	 * Calculates total values of all the shares in the stock 
	 * 
	 * @param company list where all info is present
	 * @return total value of all the shares share
	 */
	public long totalValuesOfShares(List<Company> company) {
		long totalShares = 0;
		for (Company c : company) {
			long share = c.getSharesAvailable();
			long price = c.getPricePerShare();
			totalShares += (share * price);
		}
		return totalShares;
	}

	/**
	 * Buying of shares from stock 
	 * 
	 * @param amount for buying
	 * @param symbol of company for buying
	 * @param company list
	 */
	/*public void buy(String existingCustomerName,long amount, String symbol, List<Company> company) {
		for (Company c : company) {
			if (c.getSymbol().equals(symbol)) {
				long price = c.getPricePerShare();
				if (amount >= price) {
					long numberOfShares = amount / price;
					long totalShares = c.getSharesAvailable();
					c.setTotalShares(totalShares - numberOfShares);
					System.out.println(c.getSharesAvailable());
				}else {
					System.out.println("Amount entered is less than price of one share");
				}
			}
		}
	}
*/
		
	/**
	 * Sell the shares Customer is having 
	 * 
	 * @param amount for selling
	 * @param symbol of company to buy shares
	 * @param company list
	 */
/*	public void sell(String existingCustomerName, long amount, String symbol, List<Company> company) {
		for (Company c : company) {
			if (c.getSymbol().equals(symbol)) {
				long price = c.getPricePerShare();
				if (amount >= price) {
					long numberOfShares = amount / price;
					long totalShares = c.getSharesAvailable();
					c.setTotalShares(totalShares + numberOfShares);
					System.out.println(c.getSharesAvailable());
				}else {
					System.out.println("Amount entered is larger than price of all the share");
				}
			}
		}
	}
*/
	/**
	 * @return shuffled array 
	 */
	public int[][] shuffle() {
		int size = 9;
		int[][] cards= new int[4][size];
		
		cards = randomArray(size);
		return cards;
	}

	/**
	 * @param size is the number of cards each player receives
	 * @return the 2D array of 4x9 with random cards for 4 players
	 */
	private int[][] randomArray(int size) {
		int r=0;
		int c=0;
		int random = 0;
		int x = 0;
		int bound = 52;
		int[][] array = new int[4][size];
		while(c<4) {
			r=0;
			x=0;
			
		while(r<size) {
			if(r==0 && c==0 )
				array[c][r] = inputRandom(bound);
			else {
				int z = 0;
				x = 0;
				while(z==0) {
					random = inputRandom(bound);
					x=0;
					z=0;
					for(int i=0;i<4;i++) {
						for(int j=0;j<size;j++) {
							if(array[i][j]==random)
								x++;
						}
					}
					if(x==0) {
						array[c][r] = random;
						z++;
					}
				}
				}
			r++;
			}
		c++;
		}
		return array;
		}
		
	

	/**
	 * @param deck is the array where all the player cards are stored in random order
	 * @return the cards of each player in ascending order 
	 */
	public int[][] sort(int[][] deck) {
		int size = 9;
		int[] player1 = new int[size];
		int[] player2 = new int[size];
		int[] player3 = new int[size];
		int[] player4 = new int[size];
		for(int i=0;i<4;i++) {
			for(int j=0;j<size;j++) {
				if(i==0)
					player1[j] = deck[i][j];
				else if(i==1)
					player2[j] = deck[i][j];
				else if(i==2)
					player3[j] = deck[i][j];
				else if(i==3)
					player4[j] = deck[i][j];
			}
		}
		player1 = bubbleSort(player1);
		player2 = bubbleSort(player2);
		player3 = bubbleSort(player3);
		player4 = bubbleSort(player4);
		int[][] array = new int[4][size];
		for(int i = 0;i<4;i++) {
			for(int j=0;j<size;j++) {
				if(i==0) 
					array[i][j] = player1[j];
				else if(i==1)
					array[i][j] = player2[j];
				else if(i==2)
					array[i][j] = player3[j];
				else if(i==3)
					array[i][j] = player4[j];
			}
		}

		return array;
	}

	/**
	 * @param array
	 * @return sorted array
	 */
	private int[] bubbleSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-1;j++) {
				if((array[j]%13)>(array[(j+1)])%13) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}

	
}
