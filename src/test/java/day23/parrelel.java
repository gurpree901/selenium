package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parrelel {
	
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	void setup(String br)
	{
		switch(br.toLowerCase())
		{
		case 	"chrome":	driver=new ChromeDriver(); break;
		case 	"edge":	driver=new EdgeDriver(); break;
		case 	"firefox":	driver=new FirefoxDriver(); break;
		default :	System.out.println("invalid browser"); return;




		
		}
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	void testLogin()
	{
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
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

}
