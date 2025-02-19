package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickers {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frmae
		driver.switchTo().frame(0);
		
		//methods send keys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/28/1996");
		
		//second method
		String month="April";
		String date="05";
		String year="2026";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();   //open date picker
		
		//validation on year and month
		while(true)
		{
		String currentmonth=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(currentmonth.equals(month)&& currentyr.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		
		
		//select the date
		List<WebElement >alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
{
	

		
		}
		
		
		
		
		

	}

}
}
