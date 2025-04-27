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

public class dtaproviderbdf {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test(dataProvider="dy")
	void testlogin(String username,String pwd)
	{
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		WebElement username1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username1.sendKeys(username);
	WebElement	password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	password.sendKeys(pwd);
	WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	button.click();
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	@DataProvider(name="dy")
	Object  testdata()
	{
		Object data[][]= {
				
				{"Aman@gmail.com","Aman@1234"},
				{"singh@gmail.com","Aman@123455"},
				{"Admin","admin123"},
				
				
		};
		return data;
	}

}
