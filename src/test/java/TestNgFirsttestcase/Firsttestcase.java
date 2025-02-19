package TestNgFirsttestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

/*open app
 * login app
 * logout app
 */

public class Firsttestcase {
	@Test(priority=1)
	void openAPP()
	{
		System.out.println("this is open application");
		
	}
    @Test(priority=2)
	void loginapp()
	{
		System.out.println("this is login application");
	}
	
	void logoutapp()
	{
		System.out.println("this is logout application");
	}
}
