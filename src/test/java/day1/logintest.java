package day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class logintest {
	@Test(priority=1,groups= {"sanity"})
	void loginbyemail()
	{
		System.out.println("this is login by email..");
	}
	@Test(priority=2,groups= {"sanity"})
	void loginbyfb()
	{
		System.out.println("this is login by email..");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginbyinsta()
	{
		System.out.println("this is login by email..");
	}

}
