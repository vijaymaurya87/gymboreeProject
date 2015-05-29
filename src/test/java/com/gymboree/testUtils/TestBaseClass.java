package com.gymboree.testUtils;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gymboree.pages.LoginPage;

public class TestBaseClass 
{
	public static final String USER = "";
	
	protected final Logger log = Logger.getLogger(getClass().getSimpleName());
	//Set The Environment parameter
	public EnvironmentParams environmentParams=new EnvironmentParams();
	public WebDriver driver;
	
	LoginPage login;
	
	public TestBaseClass()
	{
		login=new LoginPage(driver,log);
		driver=new FirefoxDriver();
		
	}
}
