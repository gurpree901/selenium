package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderk {
	
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
	}
	@Test(dataProvider="dp")
	void testlogin(String username,String password )
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username1.sendKeys("admin");
		WebElement password1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password1.sendKeys("admin123");
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		button.click();
		
		

	}
	@AfterClass
	void teardown()
	{
		driver.close();
	}
	@DataProvider(name="dp")
	void dataprovider()
	{
		Object  data[][]= {
				
				{"admin12","admin123"},
				{"admin32","admin44"},
				{"Admin123","admin123"},
				{"Admin","admin123"},
				
				
		};
	
	};
	

}
