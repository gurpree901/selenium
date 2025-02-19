package seleniumwebdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlesk {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//single id
		String windowid=driver.getWindowHandle();
		System.out.println("window id :"+windowid);
		
		//multiple id
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	Set<String>	windowids=driver.getWindowHandles();
	System.out.println("window ids:"+windowids);
	
	List<String> win1=new ArrayList();
	win1.get(0);
		
	

	}

}
