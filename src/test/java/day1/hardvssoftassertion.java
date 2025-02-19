package day1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardvssoftassertion {
@Test
	void hardassertion()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		AssertJUnit.assertEquals(1, 2);
		System.out.println("testng...");
		System.out.println("testing...");
	}
     @Test
     void softassert()
     {
    	 System.out.println("testing..");
    	 System.out.println("testing...");
    	 SoftAssert sf=new SoftAssert();
    	 AssertJUnit.assertEquals(1, 2);
    	 System.out.println("testing...");
    	 System.out.println("testing...");
    	 sf.assertAll();
     }
}
