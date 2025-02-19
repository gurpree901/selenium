package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kpisdatepicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@placeholder='End date']")).click();

		String month="september";
		String year="2024";
		String date="21";
		
		String currentmonth=driver.findElement(By.xpath("//span[text()='January']")).getText();
		String currentyr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		while(true)
		{
			if(currentmonth.equals(month) && currentyr.equals(year))
				{
				     
				}
		}
		
		List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
		for(WebElement v:dates)
		{
			if(v.getText().equals(date))
			{
				v.click();
				break;
			}
		}
	

	}

}
