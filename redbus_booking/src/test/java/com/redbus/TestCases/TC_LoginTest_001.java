package com.redbus.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 {
@Test
	public void searchBuses() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//li[@class=\"selected\"]")).click();
		
		driver.findElement(By.id("dest")).sendKeys("Goa");
		driver.findElement(By.xpath("//li[@class=\"selected\"]")).click();
		
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]//tr[5]/td[4]")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
		
driver.findElement(By.xpath("//div[@id=\"search_div\"]//div[4]/div//following::button")).click();
		Thread.sleep(5000);
		
		
		WebElement deptime=driver.findElement(By.xpath("//label[@title=\"After 6 pm\"]"));
		deptime.click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[@title=\"AC\"]")).click();
		Thread.sleep(5000);
		
		
		
	}
	
	
	
	
	
	
	
	
}
