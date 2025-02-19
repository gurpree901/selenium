package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class classanootatio {
	@BeforeClass
	void login()
	{
		System.out.println("this is login method");
	}
	@Test
	void search()
	{
		System.out.println("this is search method");
	}
	@Test
	void advancesearch()
	{
		System.out.println("this is advancesearch method");
	}
	@AfterClass
	void logout ()
	{
		System.out.println("this is logout method");
	}
	
	

}
