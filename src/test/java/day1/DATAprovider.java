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

public class DATAprovider {
	WebDriver driver;
	@BeforeClass
	void Setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		

		
	}
	@Test(dataProvider="dk")
	void testlogin(String username, String password)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement usrname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usrname.sendKeys("Admin");
		WebElement password1=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password1.sendKeys("admin123");
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		button.click();
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
		
	}
	@DataProvider(name="dk")
	public void testdata()
	{
		Object data[][]= {
				
				{"aman@1234","amand"},
				{"aman@1234","amanddf"},
				{"Admin","admin123"},
				{"amand","adminn"},
				
				
				
	};

}
}
