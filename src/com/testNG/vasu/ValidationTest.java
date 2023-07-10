package com.testNG.vasu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationTest
{
	
	@Test
	public void validation()
	{
		String data1="Vasu";
		
		String data2="Vasu";
		
		//Assert.assertEquals(data1, data2);
		
		Assert.assertEquals(12, 12);
			
		
	}

}
