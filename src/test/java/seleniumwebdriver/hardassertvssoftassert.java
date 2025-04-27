package seleniumwebdriver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardassertvssoftassert {
	@Test
	void test()
	{
		String a="aman";
		String b="guru";
		/*if(a.equals(b))
		{
			System.out.println("test passes");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		Assert.assertEquals(a, b);
		Assert.assertTrue(false);
		Assert.fail();
		SoftAssert as=new SoftAssert();
		as.assertEquals(true, true);
		
	}
	
	

}
