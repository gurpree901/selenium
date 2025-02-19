package day1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertiondemo {
	@Test
	void testtitle()
	{
		String act_title="gurpreet";
		String exp_title="gurpree";
		
		/*if(act_title.equals(exp_title))
		{
			System.out.println("thest passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		//Assert.assertEquals(act_title, exp_title);
		
		if(act_title.equals(exp_title))
		{
			System.out.println("test passed");
			AssertJUnit.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			AssertJUnit.assertTrue(false);
		}
		
	}

}
