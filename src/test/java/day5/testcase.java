package day5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcase {
	WebDriver driver;
	
	@BeforeClass
	void setup() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testlogin()
	{
		OrangeHRMLOGIN OM=new OrangeHRMLOGIN(driver);
		OM.setusername("Aman");
		OM.setpassword("aman@123");
		OM.clicklogin();
	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}

}
