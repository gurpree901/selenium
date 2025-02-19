package seleniumwebdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowids {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String>windowids = driver.getWindowHandles();
		/*List<String> wind=new ArrayList(windowids);
		String w1=wind.get(0);
		String w2=wind.get(1);
		
		//switch
		driver.switchTo().window(w2);
		System.out.println(driver.getTitle());*/
		driver
		
		
		for( String value:windowids)
		{
			String wind=driver.switchTo().window(value).getTitle();
			if(wind.equals("orangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
