package com.testNG.vasu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Library 
{
	ChromeDriver driver;
	@BeforeSuite
	public void appLaunch()
	{
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//validation
		
		Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());

	}
	
	@BeforeTest
	public void appLogin()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	}
	
	@AfterTest
	public void appLogout()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterSuite
	public void appClose()
	{
		driver.close();
	}
	
}
