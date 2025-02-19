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

public class dataprovidll {
	WebDriver driver;
	@BeforeClass
	@Test(priority=1)
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="ds")
	void testlogin(String username , String password) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/account");
		driver.manage().window().maximize();

		WebElement username1=driver.findElement(By.xpath("//input[@name='email']"));
		username1.sendKeys(username);
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys(password);
		WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		Thread.sleep(5000);
		boolean status =driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(status=true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
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
		driver.quit();
	}
	@DataProvider(name="dl")
	Object testdata()
	{
		Object data[][]= {
				
				{"aman@gmail.com","aman1234"},
				{"singh@gmail.com","aman@12345"},
				{"singhgurpreet56481@gmail.com","Aman@1234"},
				
				
				
				
		};
		return data;
	}

}
