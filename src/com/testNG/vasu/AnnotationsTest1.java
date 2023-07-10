package com.testNG.vasu;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest1 
{

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforemethod Executed");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 executed");
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("test2 executed");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("aftermethod Executed");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass Executed");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass Executed");
	}
	
}
