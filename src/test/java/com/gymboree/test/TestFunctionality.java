package com.gymboree.test;

import org.testng.annotations.Test;

import com.gymboree.testUtils.TestBaseClass;

public class TestFunctionality extends TestBaseClass
{
	
	@Test
	public void test()
	{
		log.info("Passed");
		driver.quit();
	}

}
