package com.testNG.vasu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminLoginTest 
{

	@Test
	public void adminLogin()
	{

		String username;
		
		username="Admin";
		
		String password="admin123";
		
		//App Launch
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//validation
		
		/*
		 * String actTtile=driver.getTitle();
		 * 
		 * if(expTitle.equals(actTtile)) { System.out.println("pass"); }else {
		 * System.out.println("fail"); }
		 */
		
		if(driver.findElement(By.name("username")).isDisplayed())
		{
			System.out.println("pass");	
		}else
		{
			System.out.println("fail");
		}
		
		//AppLogin
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//validation
		
		if(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).isDisplayed())
		{
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}
		
		//AppLogout
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		//validation
		
		if(driver.findElement(By.name("username")).isDisplayed())
		{
			System.out.println("pass");	
		}else
		{
			System.out.println("fail");
		}
			
		//AppClose
		
		driver.close();
		

	}
	
}
