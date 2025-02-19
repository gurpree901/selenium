package seleniumwebdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String>windows= driver.getWindowHandles();   //unique id
		/*List<String> wind=new ArrayList(windows);
		String w1=wind.get(0);
		String w2=wind.get(1);
		
		driver.switchTo().window(w2);
		System.out.println(driver.getTitle());*/
		for(String value:windows)
		{
			String title=driver.switchTo().window(value).getTitle();
			if(title.equals("orangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
			
			
				
			
		}
		
		
		
		

	}

}
