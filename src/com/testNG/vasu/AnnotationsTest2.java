package com.testNG.vasu;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsTest2
{
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest Executed");
	}
	
	
	  @Test public void test1()
	  { System.out.println("test1 executed");
	  }
	  
	  
		 @Test public void test2() 
		 { 
			 System.out.println("test2 executed");
			 
		 } 
	 
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest Executed");
	}
	
	

}
