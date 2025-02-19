package day4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
@Listeners(day4.mylistners.class)
public class ornagehrmm {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	void testlogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(status, true);
		
	}
	@Test(priority=2)
	void testurl()
	{
		String url=driver.getCurrentUrl();
		AssertJUnit.assertEquals(url ,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/logi");
		
	}
	@Test(priority=3, dependsOnMethods= {"testurl"})
	void testtitle()
	{
		AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	
	void teardown()
	{
		driver.close();
	}

}
