package com.Guru.UtilityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
	
	public static String getPropery(String keyName)
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+ "/src/main/java/com/Guru/ConfiLayer/Config.properties";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);
			return prop.getProperty(keyName);
			
		   }
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		return null;
		
		
		
		
	}

}
