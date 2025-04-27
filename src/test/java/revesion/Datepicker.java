package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        String year="2025";
        String month="may";
        String date="20";
    WebElement   cal=  driver.findElement(By.xpath("//input[@id='datepicker']"));
    cal.click();
    
    //current month and year
    while(true)
    {
    	  String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
          String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
          if(currentMonth.equals(month) && currentyear.equals(year))
          {
        	  break;
          }
          driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
    }
        
   List<WebElement > dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
        for(WebElement dt:dates)
        {
        	if (dt.getText().equals(dates))
        			{
        		        dt.click();
        		        break;
        			}
        }
        
    }
}

        // Switch to the frame that contains the date
