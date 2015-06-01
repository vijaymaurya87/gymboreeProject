package com.gymboree.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.gymboree.pages.HomePage;
import com.gymboree.testUtils.TestBaseClass;

public class TestHomePage extends TestBaseClass
{
	HomePage homePage=new HomePage(driver, log);
	
	@Test
	public void testHomePageURL()
	{
		homePage.openHomePage();
		
	}

}
