package com.testNG.vasu;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationTest
{

	@Test(dataProvider = "getData")
	public void sample(String username,String password, String empName)
	{
		System.out.println("UserName is :"+username);
		System.out.println("Password is :"+password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="vasudeva1";
		data[0][1]="selenium1";
		data[0][2]="vasu1";
		data[1][0]="vasudeva2";
		data[1][1]="selenium2";
		data[1][2]="vasu2";
		return data;
		
	}

}
