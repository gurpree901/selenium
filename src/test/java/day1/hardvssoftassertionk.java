package day1;

import org.testng.Assert;

public class hardvssoftassertionk {
	void hardassertion()
	{
		String a="aman";
		String b="aman";
		if(a.equals(b))
		{
			System.out.println("test passed");
			System.out.println("test passed");
			Assert.assertEquals(a,b);
			Assert.assertTrue(false);
			Assert.assertTrue(true);
			
		}
	}
	
	
	

}
