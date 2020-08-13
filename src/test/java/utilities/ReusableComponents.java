package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReusableComponents {
	
//	static ReusableComponents reusable=new ReusableComponents();
	
//	public JSONObject readjsonData(String value) throws IOException, ParseException{
//		JSONParser jsonparser=new JSONParser();
//		
//		FileReader jsonFile=new FileReader(".\\src/test/resources/TestData.json");
//		
//		Object obj=jsonparser.parse(jsonFile);
//		
//		JSONObject jsonobject= (JSONObject)obj;
//		
//		if(value==null){
//			jsonparser=null;
//			jsonFile=null;
//			jsonobject=null;
//		}
//		
//		return jsonobject;
//		
//	}
	
	
//	public static String readJSONArrayData(String objectName,String keyName) throws IOException, ParseException{
//		String output=null;
//		
//		JSONObject jsonobj=reusable.readjsonData(objectName);
//		
//		JSONArray array=(JSONArray)jsonobj.get(objectName);
//		
//		System.out.println("size of the array"+array);
//		System.out.println("size of the array"+array.size());
//		
//		for (int i = 0; i < array.size(); i++) {
//			JSONObject arrayObj=(JSONObject)array.get(i);
//			output= (String)arrayObj.get(keyName);
//		} 
//		return output;
//	}
	
	
//	public static String readJSONValue(String keyName) throws IOException, ParseException{
//		 
//		JSONObject jsonobj=reusable.readjsonData(keyName);
//		
//		return (String)jsonobj.get(keyName); 
//	}

}
