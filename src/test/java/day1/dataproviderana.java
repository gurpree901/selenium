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

public class dataproviderana {
	WebDriver driver;  //class variable
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="dk")
	void testlogin(String username ,String password) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();


		WebElement username1=driver.findElement(By.xpath("//input[@id='input-email']"));
		username1.sendKeys(username);
		WebElement password1=driver.findElement(By.xpath("//input[@type='password']"));
		password1.sendKeys(password);
	WebElement 	button=driver.findElement(By.xpath("//input[@type='submit']"));
	button.click();
	Thread.sleep(5000);
boolean 	status=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
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
		driver.close();
	}
	
	
	
	
	@DataProvider(name="dk")
	 Object  setdata()
	{
		Object logindata [][] = {
				{"aman@gmail.com","amansingh"},
				{"amanf@gmail.com","aman@1234"},
				{"singhgurpreet56481@gmail.com","Aman@1234"},
				
				
		};
		return logindata;
	}
	
	
	

}
