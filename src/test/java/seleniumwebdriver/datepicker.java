package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement datepicker=driver.findElement(By.xpath("(//input[@id='datepicker'])[1]"));
		datepicker.click();
		
		String year="2026";
		String month="june";
		String date="28";
		while(true)
		{
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(current_month.equals(month) && current_year.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
			

			
		}
		
	
	}

}
