package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotationdemo {
	@BeforeClass
	void login()
	{
		System.out.println("this is login method...");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search method...");
	}
   @Test (priority=2)
	void advancesearch()
	{
		System.out.println("this is advance search ....");
	}
	@AfterClass
	void logout()
	{
		System.out.println("this is logout ...");
	}
}
