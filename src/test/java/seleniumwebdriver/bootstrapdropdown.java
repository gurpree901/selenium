package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		//selct single
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		 
		
		//single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//capture all options
		List<WebElement >options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("all options:"+options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());  
		}
		
		for(WebElement b:options)
		{
			System.out.println(b.getText());
		}
		
		//select multiple ptions
		
		for(WebElement op:options)
		{
			String optio=op.getText();
			
			if(optio.equals("java")  || optio.equals("python"));
			{
				op.click();
			}
		}
		
			
		
			
		
		
		
		
		

	}

}
