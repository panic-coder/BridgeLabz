import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
public class JsonDemo {
	public static void main(String[] args) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("name", "Shubham");
		obj.put("num", new Integer(100));
		obj.put("balance", new Double(100.5));
		obj.put("is_vip", new Boolean(true));
		StringWriter out = new StringWriter();
		obj.writeJSONString(out);
		String jsonText = out.toString();
		System.out.println(jsonText);
		
		JSONArray a = new JSONArray();
		a.add("Ram");
		a.add(new Integer(10));
		a.add(new Double(10.5));
		System.out.println(a);
		
		ArrayList<Comparable> b = new ArrayList<Comparable>();
		b.add("Ravi");
		b.add(new Integer(10));
		b.add(new Double(10.5));
		String jsonT = JSONValue.toJSONString(b);
		System.out.println(jsonT);
		
		JSONParser jsonParser = new JSONParser();
		try {
			/*FileReader reader = new FileReader("file.json");
			//System.out.println("Found");
			Object objR = jsonParser.parse(reader);
			JSONArray employeeList = (JSONArray)objR;
			System.out.println(employeeList);
			employeeList.forEach(emp->parseEmployeeObject((JSONObject)emp));*/
			
			/*Object obj1 = new JSONParser().parse(new FileReader("file.json"));
			JSONObject jo = (JSONObject)obj1;
			String name = (String)jo.get("name");
			String email = (String)jo.get("email");
			System.out.println(name);
			System.out.println(email);
			*/
			JSONArray ja = (JSONArray)jsonParser.parse(new FileReader("file.json"));
			//Object ob=jsonParser.parse(new FileReader("file.json"));
			for(Object o:ja) {
			JSONObject jo = (JSONObject)o;
			
			String name = (String)jo.get("name");
			System.out.println(name);
			
			String email = (String)jo.get("email");
			System.out.println(email);
			
			String sal = (String)jo.get("number");
			int salary = Integer.parseInt(sal);
			
			System.out.println(salary+100);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void parseEmployeeObject(JSONObject emp) {
		JSONObject empObj = (JSONObject)emp.get("employees");
		String name = (String)empObj.get("name");
		System.out.println(name);
		String email = (String)empObj.get("email");
		System.out.println(email);
	}
}
