package com.test.utils;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TestData {
	
	
	
	@SuppressWarnings("unchecked")
	public static String getTestDataValue(String tcNum,String strVal)
	{
	JSONParser jsonParser = new JSONParser();
    FileReader reader = null;
    JSONObject testData = null;
    HashMap<String, String> hm=null;
    try
    {
    	
    	if(reader == null)
    	{
    	reader = new FileReader("Cucumber-Java-Files\\testData.json");
    	testData = (JSONObject) jsonParser.parse(reader);
    	
    	}
	
	hm=(HashMap<String, String>)testData.get(tcNum);
    //	System.out.println(hm.get(strVal));
    	
    	//System.out.println("JSON"+ testData.get("TC_001"));
        
    }catch (Exception e) {
			// TODO: handle exception
    	e.printStackTrace();
}

return hm.get(strVal);
}
}
	

