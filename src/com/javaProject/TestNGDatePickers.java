package com.javaProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TestNGDatePickers 
{

	public String urlType1 = "http://demo.guru99.com/test/";
	String driverPath = "E:\\Tools\\chromedriver.exe";
	public static WebDriver driver ; 	
		
	
	  
	  @BeforeTest
	  public void login() 
	  {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  
	  @Test(priority=0)
	  public void DatePickerType1() 
	  {
		  driver.get(urlType1);
		  WebElement datepicker1 = driver.findElement(By.xpath("//*[@name='bdaytime']"));
		  datepicker1.sendKeys("01012018");
		  datepicker1.sendKeys(Keys.TAB);
		  datepicker1.sendKeys("0330PM");
		  datepicker1.sendKeys(Keys.TAB);
	  }

	
	  @AfterTest
	  public void logout() 
	  {
		  //driver.close();
	  }

}
