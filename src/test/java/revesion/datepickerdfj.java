
// Before
String date="25";

// After
String date="25";
driver.findElement(By.xpath("//a[text()='" + date + "']")).click();
package revesion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerdfj {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		String year="2025";
		String month="February";
		String date="25";
		WebElement cale=driver.findElement(By.xpath("//input[@id='datepicker']"));
		cale.click();
		
		while(true)
		{
			String current_month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_yr=driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText();
			if(current_month.equals(month)&& current_yr.equals(year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}

	}

}
