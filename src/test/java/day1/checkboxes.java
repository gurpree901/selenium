package day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		System.out.println("before selecting:"+checkbox.isSelected());
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		System.out.println("after selection:"+checkbox.isSelected());
		
		//capture checkboxes
		List<WebElement > checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("print checkboxes:"+checkboxes.size());
		
		/*for(int i =0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		for(WebElement ch:checkboxes)
		{
			ch.click();
		}
		
		//select 3 checkboxes
		for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
			
		}
		

	}

}
