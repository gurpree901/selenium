package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider="dp")
	public void testlogin(String username,String password)
	{
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.manage().window().maximize();
		WebElement username1=driver.findElement(By.xpath("//input[@id='input-email']"));
		username1.sendKeys(username);
		WebElement password1=driver.findElement(By.xpath("//input[@id='input-password']"));
		password1.sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	@DataProvider(name="dp")
	Object setdata()
	{
		String data[][]= {
				{"Aman@gmail.com","12345"},
				{"ss@gmail.com","aman1234"},
				{"singhgurpreet56481@gmail.com","Aman@1234"},
				
				
		};
		return data;
	}
	

}
