package day1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethod {
	@Test(priority=1)
	void openapp()
	{
		AssertJUnit.assertTrue(false);
		
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		AssertJUnit.assertTrue(true);
	}
	@Test(priority=3,dependsOnMethods= {"login"})
	void search()
	{
		AssertJUnit.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods= {"search"})
	void logout()
	{
		AssertJUnit.assertTrue(true);
	}
	
	

}
