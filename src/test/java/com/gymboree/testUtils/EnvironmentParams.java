package com.gymboree.testUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EnvironmentParams 
{
	String URL;
	String user;
	String password;
	String environmentProperties="src\\test\\resources\\env.properties";
	Properties properties=new Properties();
	
	public EnvironmentParams() 
	{
		try
		{
			 properties.load(new FileInputStream(environmentProperties));
			 setURL(properties.getProperty("browser.url"));
			 setUser(properties.getProperty("browser.user"));
			 setPassword(properties.getProperty("browser.password"));
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public String getEnvironmentProperties() {
		return environmentProperties;
	}

	
	public void setEnvironmentProperties(String environmentProperties) {
		this.environmentProperties = environmentProperties;
	}


	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String login) {
		this.user = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
		

}
