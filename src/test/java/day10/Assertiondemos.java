package day10;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertiondemos {
	@Test
	void testassert()
	{
		String str1="aman";
		String str2="guru";
		/*if(str1.equals(str2))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		//Assert.assertEquals(str1, str2);
		Assert.assertTrue(false);
		
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(str1, str2);
		sf.assertTrue(true);
	}
	
	


	
		
		
		

	

}


