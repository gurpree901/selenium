package revesion;

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
	 void Setup()
	 {
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	@Test(dataProvider="dp")
	void testlogin()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin123");
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		button.click();
		
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="dp")
	Object testdata()
	{
		String testdata[][]= {
				{"aman@gmail.com","Amn@1234"},
				{"gurd@gmail.com","amn@1234"},
					
				
				
				
		};
		return testdata;
		
		
	}
	

}
