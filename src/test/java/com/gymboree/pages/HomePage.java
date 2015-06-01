package com.gymboree.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{

	public static String preURL="http://www.gymboree.com/index.jsp?ASSORTMENT%3C%3East_id=1408474395917465&FOLDER%3C%3Efolder_id=2534374303003787&bmUID=kJ8XtfT";
	public final static String ready="//h2[contains(text(),'Best Sellers')]";
	
	String newURL="";
	private Logger log;
	private WebDriver driver;
	
	public HomePage(WebDriver driver, Logger logger)
	{
		this.driver=driver;
		this.log = logger;
	}
	
	public void openHomePage()
	{
		driver.get(preURL);
		log.info(" Ready Page Size: "+driver.findElements(By.xpath(HomePage.ready)).size());
		driver.quit();
	}
	public void openHomePageNewURL()
	{
		driver.get(newURL);
		log.info(" Ready Page Size: "+driver.findElements(By.xpath(HomePage.ready)).size());
		driver.quit();
	}
	public void openHomeWithURLe(String URL)
	{
		driver.get(URL);
		log.info(" Ready Page Size: "+driver.findElements(By.xpath(HomePage.ready)).size());
		driver.quit();
	}

}
