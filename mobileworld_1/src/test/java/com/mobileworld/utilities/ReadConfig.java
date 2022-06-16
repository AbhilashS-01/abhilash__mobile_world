//utility file
package com.mobileworld.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	// creating constructor 
	public void Readconfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
 
	//creating method to get url
	
	public String getApplicationUrl()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	//creating method to get username
	public String getUsername()
	{
		String username=prop.getProperty("username");
		return username;
	}
	
	//creating method to get password 
	public String getPassword()
	{
		String password=prop.getProperty("password");
		return password;
	}
	
	//creating method to get chromepath
	public String getChromepath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
				
	}
}
