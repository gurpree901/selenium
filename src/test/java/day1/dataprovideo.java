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

public class dataprovideo {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@Test(dataProvider="gs")
	void testlogin(String usr,String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		//username
		WebElement username=driver.findElement(By.xpath("//input[@id='input-email']"));
		username.sendKeys(usr);
		//password
		WebElement password=driver.findElement(By.xpath("//input[@id='input-password']"));
		password.sendKeys(pwd);
		
		//button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
		if(status==true)
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
	
	@DataProvider(name="gs")
	 Object testdata()
	{
		Object data[][]= {
				
				{"Aman@gmail.com","Aman@1234"},
				{"singh@gmail.com","aman@12345"},
				{"sing2@gmail.com","Aman@133232"},
				{"gurpreet.singhpinnacle@digital.in","123456"},
					
		};
		return data;
				
				
		
	}
}
	
	


