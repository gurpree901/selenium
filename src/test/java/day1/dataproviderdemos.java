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

public class dataproviderdemos {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="do")
	void testlogin(String email, String password) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
	     WebElement username=driver.findElement(By.xpath("//input[@id='input-email']"));
	     username.sendKeys(email);
	    WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys(password);
		WebElement button=driver.findElement(By.xpath("//input[@type='submit']"));
		button.click();
		Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status=true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
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
	
	
	@DataProvider(name="do",indices= {0,3})
	Object[][] logindata()
	{
		Object data[][]= {
				{"singh@gmail.com","aman@1234"},
				{"aman@gmail.com","amanfhfh"},
				{"singhgurpreet56481@gmail.com","Aman@1234"},
				{"amansinghj@gmail.com","1234aman"},
				{"gudu5383@gmail.com","aman@1234"},
				{"aman@gmailf.com","aman12345"},
					
				
				
				
		};
		return data;
	}

}
