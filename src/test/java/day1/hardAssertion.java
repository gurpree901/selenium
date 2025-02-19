 package day1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertion {
	@Test
	void test()
	{
		AssertJUnit.assertEquals("aman", 1234);
		AssertJUnit.assertEquals(123, 1234);
		AssertJUnit.assertTrue(true);
		AssertJUnit.assertTrue(false);
		AssertJUnit.assertTrue(1==2);
	}

}
