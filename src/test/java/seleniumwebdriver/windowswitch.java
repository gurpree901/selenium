package seleniumwebdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowswitch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); //child window
		Set<String>windowids=driver.getWindowHandles();  //multiple ids 
		/*List<String> window=new ArrayList(windowids);
		String parentid=window.get(0);
		String childid=window.get(1);
		
		//switch
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());*/
		
		for(String title:windowids)
		{
			driver.switchTo().window(title).getTitle();
			if(title.equals("orangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		

	}

}
