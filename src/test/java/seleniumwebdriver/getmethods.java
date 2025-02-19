package seleniumwebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //launch the browser
		Thread.sleep(5000);
		//System.out.println(driver.getTitle());
		//driver.getCurrentUrl();
		//driver.getPageSource();
		String windowow=driver.getWindowHandle();
		System.out.println("window id:"+windowow);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();  //new browser window
		 Set <String>windowids=driver.getWindowHandles();//doenot allow duplicate
		System.out.println( windowids);
		driver.close();
		 
		 

	}

}
