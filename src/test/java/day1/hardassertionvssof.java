package day1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertionvssof {
	@Test
	void hardvssoft()
	{
		String str1="guru";
		String str2="guru";
		/*if(str1.equals(str2))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		Assert.assertEquals(str1, str2);
		Assert.assertTrue(true);
	}

}
