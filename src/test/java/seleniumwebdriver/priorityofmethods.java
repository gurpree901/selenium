package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class priorityofmethods {
	WebDriver driver;
    @BeforeClass
	void login()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
    @Test(priority=1)
    void testlogin()
    {
    	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }
    
    @Test(priority =2)
    void testurl()
    {
    	Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    

}
