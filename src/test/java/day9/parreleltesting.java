package day9;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parreleltesting {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"Browser"})
	void setup(String br) throws InterruptedException
	{
		switch(br.toLowerCase())
		{
		case "chrome" :driver=new ChromeDriver(); break;
		case "edge" :driver=new ChromeDriver(); break;
		case "firefox" :driver=new ChromeDriver(); break;


		}
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test
	void testlogin()
	{
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("Admin");
		WebElement passowrd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		passowrd.sendKeys("admin123");
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		button.click();
	}
	
	void teardown()
	{
		driver.quit();
	}
	

}
