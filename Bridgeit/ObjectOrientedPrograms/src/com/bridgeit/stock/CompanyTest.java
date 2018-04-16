package com.bridgeit.stock;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

public class CompanyTest {
	public static void main(String[] args) throws Exception, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		//List<Company> myObj = mapper.readValue(new File("stockAccountInput.json"), new TypeReference<List<Company>>() {});
		//Company[] myObj = mapper.readValue(new File("stockAccountInput.json"),Company[].class);
		/*for(int i=0;i<myObj.length;i++) {
			System.out.println(myObj[i]);
		}*/
		//System.out.println(myObj);
		Company myObj = mapper.readValue(new FileReader("stockAccountInput.json"), Company.class);
		ObjectWriter writer = mapper.defaultPrettyPrintingWriter();
		System.out.println(writer.writeValueAsString(myObj));
	}
}
