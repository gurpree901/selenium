package day2;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class classb {

	@Test
	void c()
	{
		System.out.println("this is test methods");
	}
	@AfterTest
	void b1()
	{
		System.out.println("this is aftr test method");
	}
}
