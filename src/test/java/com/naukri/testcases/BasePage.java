package com.naukri.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.naukri.Driver.Driver;

public class BasePage {

	
	@BeforeMethod
	public void setUp()
	{
		Driver.initDriver();
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
	 //  Driver.quitDriver();	
	}
}
