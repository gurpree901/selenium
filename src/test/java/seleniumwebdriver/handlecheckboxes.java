package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlecheckboxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='friday']"));
		//System.out.println("before selection:"+checkbox.isSelected());
		//driver.findElement(By.xpath("//input[@id='friday']")).click();
		//System.out.println("after selection:"+checkbox.isSelected());
		
		
		//capturing all checkboxes
		
		List<WebElement >checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input'and @type='checkbox']"));
		System.out.println("number of checkboxes:"+checkboxes.size());
		String Ttext=driver.findElement(By.xpath("//input[@class='form-check-input'and @type='checkbox']")).getText();
		System.out.println(Ttext);
		
		//select all checkboxes
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		for(WebElement check:checkboxes)
		{
			check.click();
		}
		
		

	}

}
