package seleniumwebdriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardvdsh {
	@Test
	void test()
	{
		String a="gurusingh";
		String b="amansingh";
		
		/*if(a.equals(b))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		//Assert.assertEquals(a, b);
		Assert.assertTrue(false);
		Assert.fail();
	}

}
