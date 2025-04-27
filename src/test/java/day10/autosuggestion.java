package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) {
		WebDriver  driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement> autolist=driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@class='wM6W7d']//span"));
		
		for(int i=0;i<autolist.size();i++)
		{
			if(autolist.get(i).getText().equals("selenium webdriver"))
			{
				autolist.get(i).click();
				break;
			}
		}
		
		
			
			
		

	}

}
