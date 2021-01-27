package com.naukri.Driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.naukri.FrameworkConstants.naukriFrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	
	
	public static void initDriver()
	{
		if (Objects.isNull(DriverManager.getDriver())) {
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(naukriFrameworkConstants.getBaseurl());
			
			
		}
	}
	
	
	public static void quitDriver()
	{
		if (Objects.nonNull(DriverManager.getDriver())) {
			
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}
	
	
	
}
