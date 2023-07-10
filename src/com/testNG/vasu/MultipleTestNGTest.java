package com.testNG.vasu;

import org.testng.annotations.Test;

public class MultipleTestNGTest 
{

	@Test(groups = "Smoke Testing")
	public void ankitha()
	{
		System.out.println("ankitha");
	}
	@Test(groups = "Regression Testing")  
	public void vasu()
	{
		System.out.println("vasu");
	}
	@Test(groups = "Smoke Testing")
	public void smruthi()
	{
		System.out.println("smruthi");
	}
	
}
