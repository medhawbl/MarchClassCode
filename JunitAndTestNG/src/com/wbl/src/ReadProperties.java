package com.wbl.src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public String propertiesExample(String str) throws IOException{
		Properties prop = new Properties();
//		try {
			FileInputStream inputStream =new FileInputStream("C:/User/WBL/Desktop/dataprop.properties");
			prop.load(inputStream);
			System.out.println("City : " + prop.getProperty("City"));
/*		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			
		} */
		return prop.getProperty("City");
		
	}
}
