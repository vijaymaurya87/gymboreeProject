package com.gymboree.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.gymboree.testUtils.TestBaseClass;

public class LoginPage 
{
	private String userField="";
	private String passwordField="";
	private String submit="";
	
	private Logger log;
	private WebDriver driver;
	// Page URL
	private String loginPage = "UI/Common/Html/Login.jsp";
	private String failedLoginPage = "UI/Common/Html/Login.jsp?failure=true";
	
	public LoginPage(WebDriver driver, Logger logger)
	{
		this.driver=driver;
		this.log = logger;
	}
	
	private void loginAction(String userName, String password)
	{
		log.info("Attempting login with username: " + userName+ " and password: " + password);
		driver.get(loginPage);
		driver.findElement(By.xpath(userField)).sendKeys(userName);
		driver.findElement(By.xpath(passwordField)).sendKeys(password);
		driver.findElement(By.xpath(submit)).click();
		log.info("Clicked on "+submit);
	}
}
