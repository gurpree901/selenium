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

public class dataproviderjg {
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="ds" )
	void testlogin(String email ,String password)
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		WebElement usernmae=driver.findElement(By.xpath("//input[@name='email']"));
		usernmae.sendKeys(email);
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys(password);
		WebElement button=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		button.click(); 
		
		boolean status=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
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
	@DataProvider(name="ds")
	Object testdata()
	{
		Object data[][]= {
				
				{"amansingh@gmail.com","amandhfh"},
				{"singhgurpreet56481@gmail.com","Aman@1234"},
				{"aman@gmail.com","amanjfjfj"},
					
				
	};
		return data;

}
}
