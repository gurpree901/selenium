package revesion;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatepickerTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        
        // Switch to iframe that contains the datepicker
        driver.switchTo().frame(0);

        // Click the datepicker input field
        driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();

        String year = "2026";
        String month = "June";
        String date = "28";

        // Wait for the month element to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Loop until the correct month and year are displayed
        while (true) {
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if (currentMonth.equalsIgnoreCase(month) && currentYear.equals(year)) {
                break;
            }

            // Click to go to the next month
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

            // Optional: Add a wait for the next month to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='ui-datepicker-month']")));
        }

        // Now, select the date
      List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
      for(WebElement dt:dates)
      {
    	  if(dt.getText().equals(date))
    	  {
    		  dt.click();
    		  break;
    	  }
      }
      
    }
}
