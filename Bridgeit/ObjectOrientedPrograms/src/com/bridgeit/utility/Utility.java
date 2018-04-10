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

		@SuppressWarnings("unchecked")
		public static void ricePulseWheat() {
			String name;
			String weight;
			String price;
			int priceInt=0,weightInt=0,totalPrice=0,weightSum=0;
			JSONParser jsonParser = new JSONParser();
			try {
				JSONArray jsonArray = (JSONArray)jsonParser.parse(new FileReader("riceInput.json"));
				for(Object obj:jsonArray) {
					JSONObject jsonObject=(JSONObject)obj;
					name = (String)jsonObject.get("name");
					//System.out.println(name);
					weight = (String) jsonObject.get("weight");
					weightInt = Integer.parseInt(weight);
					weightSum += weightInt;
					//System.out.println(weight);
					price = (String)jsonObject.get("price");
					priceInt = Integer.parseInt(price);
					//System.out.println(price);
					totalPrice =totalPrice+(priceInt*weightInt);
				}
				System.out.println(totalPrice); 
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
					System.out.println("Success");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		public static String replaceExpressionDemonstration(String st,String firstName,String lastName,String phoneNumber) {
			st=st.replaceAll("<<name>>", firstName);
			st=st.replaceAll("<<full name>>", lastName);
			st=st.replaceAll("xxxxxxxxxx", phoneNumber);
			LocalDate ldate = LocalDate.now();
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			 //Date date = new Date(0, 0, 0);
			 String day=ldate.format(formatter);  
			
			//String day = String.valueOf(date);
			st=st.replaceAll("01/01/2016", day);
			return st;
			
		}
}
