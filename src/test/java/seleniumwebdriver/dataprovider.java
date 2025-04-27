package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="fj")
	void Test(String password,String user)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys(user);
	  WebElement	pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
	 pwd.sendKeys(password);)
	} 
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name="fj")
	Object  testdata()
	{
		Object a[][]= {
				{"mana@gmail.com","AMan123"},
				{"ams@gmail.com","Aman@1234"},
				{"asn@1234","djf"},
				
				
		};
		return a;
	}
	

}
