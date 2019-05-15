package com.javaProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JavaClass 
{


	
	
	public static void main(String[] args) throws InterruptedException 
	{
		String url = "https://www.saucedemo.com";		
		System.setProperty("webdriver.chrome.driver", "E:\\Tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/input[3]")).click();
		WebElement product = driver.findElement(By.xpath(".//*[@id='item_4_img_link']/img"));
		
		if(product.isDisplayed())
		{
			System.out.println("Logged in successfully");
		}
		else System.out.println("Login Failed");
			
		driver.close();
	}
	


}
