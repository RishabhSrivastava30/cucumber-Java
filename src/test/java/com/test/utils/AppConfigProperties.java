package com.test.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppConfigProperties {
	private static final Properties PROPERTIES= new Properties();
	/*public static String getProperty(String propertyKey)
	{
		Properties properties= new Properties();
		try {
			File file = new File("src/test/resources/test-data.properties");
			FileInputStream fileInput = new FileInputStream(file);
			 
			properties.load(fileInput);
			fileInput.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return properties.getProperty(propertyKey);
		
		
	}*/
	
	public static Properties getApplicationProperties()
	{
		
		if (PROPERTIES.size()==0)
		{
			try {
				File file = new File(AppConstants.PROPERTY_FILE_PATH+"\\"+AppConstants.PROPERTY_FILE_NAME);
				FileInputStream fileInput = new FileInputStream(file);
				 
				PROPERTIES.load(fileInput);
				fileInput.close();
				

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return PROPERTIES;
	}

}
