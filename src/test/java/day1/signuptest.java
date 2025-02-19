package day1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class signuptest {
	@Test(priority=1,groups= {"reggresion"})
	void signupbyemail()
	{
		System.out.println("this is signup mail..");
	}
	@Test(priority=2,groups= {"reggresion"})
	void signupbyfb()
	{
		System.out.println("this is signup mail..");
	}
	
	@Test(priority=3,groups= {"reggresion"})
	void signupbyinsta()
	{
		System.out.println("this is signup mail..");
	}

}
