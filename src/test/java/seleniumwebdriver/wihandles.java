package seleniumwebdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wihandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		String widnwowid=driver.getWindowHandle();
		System.out.println(widnwowid);
		Set<String>windowids=driver.getWindowHandles(); //uniquwe id
		System.out.println(windowids);
		List<String> wi=new ArrayList(windowids);
		String parent=wi.get(0);
		String child=wi.get(1);
		
		//switch to parent 
		driver.switchTo().window(child);
		for( String w:windowids)
		{
			String tite=driver.switchTo().window(child).getTitle();
			if(tite.equals("orangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	
		
		
		
		
		
		
		
		
		
				

	}

}
