package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class paramtest {
	WebDriver driver;  //class variable
	

	@BeforeClass        //void setup method exceute only 1 time
	@Parameters({"browser"})    //parameters from testng xml file
	void setup(String br) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome":	driver=new ChromeDriver(); break;
		case "edge"   :   driver=new EdgeDriver(); break;
		case "firefox": driver=new FirefoxDriver(); break;
		default :System.out.println("invalid browser");return;

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=1)
	void TestLogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		AssertJUnit.assertEquals(status, true);
	}
	@Test(priority=2)
	void Testitle()
	{
		AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test(priority=3)
	void testurl()
	{
		AssertJUnit.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
	}
	
	@AfterClass
	void Teardown()
	{
		driver.quit();
	}
	
	
}
