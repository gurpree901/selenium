package seleniumwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlesu {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		String windowid=driver.getWindowHandle();
		System.out.println(windowid);
		WebElement windowids=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		windowids.click();
		Set<String>windowids1=driver.getWindowHandles();
		System.out.println(windowids);
		

	}

}
