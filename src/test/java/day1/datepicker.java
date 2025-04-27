package day1;

import java.time.Duration;
import java.util.List;

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
		//using send keys method
		//driver.findElement(By.xpath("//input[@class='hasDatepicker']")).sendKeys("04/05/2024");
		//Expected 
		String month="june";
		String year="2025";
		String date="28";
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		
		while(true)
		{
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(current_month.equals(month) &&current_year.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			//Select the dates
			List<WebElement > alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			    
			
			for( WebElement v:alldates)
			{
				if(v.getText().equals(date))
				{
					v.click();
					break;
				}
			}
			
			
				
			
				
		}
		
	}

}
