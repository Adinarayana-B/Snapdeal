package com.redbus.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.redbus.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	ReadConfig readconfig=new ReadConfig();
	public static WebDriver driver;
	public String baseUrl=readconfig.getApplicationUrl();
	public String fromCity=readconfig.getFromPlace();
	public String tocity=readconfig.getToPlace();
	public String depdate=readconfig.getDepDate();
	
	
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(br.equals("Firefox"))	
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		driver.get(baseUrl);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		
	}
	
	
	
	
	
	
	

}
