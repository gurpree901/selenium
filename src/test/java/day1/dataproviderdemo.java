package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	@Test(dataProvider="dp")
	void testlogin()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	WebElement	username=driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys("admin123");
	WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
	boolean logo=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	if(logo=true)
	{
		Assert.assertTrue(true);
	}
	else
	{
		Assert.fail();
	}
		
		
	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}

	@DataProvider(name="dp")
	Object[] []logindata()
	{
		Object data[][]= {
				{"abc@gmail.com","abc123"},
				{"aman@gmail.com","abcd@123"},
				{"guru@gmail.com","aman@1234"},
				
					
				
				
				
		};
		return data;
	}
}
