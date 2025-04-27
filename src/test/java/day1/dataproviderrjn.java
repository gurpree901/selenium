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

public class dataproviderrjn {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="fh")
	void testlogin(String user,String pwd) throws InterruptedException
	{
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
	   driver.manage().window().maximize();
	 WebElement  username= driver.findElement(By.xpath("//input[@name='email']"));
	 username.sendKeys(user);
	WebElement pwd1= driver.findElement(By.xpath("//input[@id='input-password']"));
	pwd1.sendKeys(pwd);
	WebElement button =driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	button.click();
	Thread.sleep(5000);
	boolean logo=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
	if(logo==true)
	{
		WebElement button1=driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']"));
		button.click();
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
	@DataProvider(name="fh")
	Object  testdata()
	{
		String testdatah[][]= {
				{"aman@gmail.com","aman@1234"},
				{"singhgurpreet56481@gmail.com","Aman@1234"},
				{"singh@gmail.com","man@1234"},
				
				
		};
		return testdatah;
	};
	
	

}
