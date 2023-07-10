package com.testNG.vasu;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeCreationTest extends Library
{

	@Test(dataProvider = "getData")
	public void empCreation(String fName,String lName)
	{
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.name("firstName")).sendKeys(fName);
		
		driver.findElement(By.name("lastName")).sendKeys(lName);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("0456");
		
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="vasudeva1";
		data[0][1]="selenium1";
		
		data[1][0]="vasudeva2";
		data[1][1]="selenium2";
		
		return data;
		
	}
}
