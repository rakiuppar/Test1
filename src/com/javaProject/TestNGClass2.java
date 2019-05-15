package com.javaProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TestNGClass2 
{

	public String url= "https://www.saucedemo.com";
	String driverPath = "E:\\Tools\\chromedriver.exe";
	public static WebDriver driver ; 	
		
	
	  
	  @BeforeTest
	  public void login() 
	  {
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver= new ChromeDriver();
		  driver.get(url);
		  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		  Reporter.log("Running Class 1");
	  }
	  
	  @Test(priority=0)
	  public void verifyLogin() 
	  {
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();
			WebElement product = driver.findElement(By.xpath(".//*[@id='item_4_img_link']/img"));
			
			if(product.isDisplayed())
			{
				Reporter.log("Logged in successfully");
			}
			else Reporter.log("Login Failed");
	  }

	
	  @AfterTest
	  public void logout() 
	  {
		  driver.close();
	  }

}
