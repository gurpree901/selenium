package revesion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        // Open the URL
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Cast the WebDriver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,3000)", "");
        	//System.out.println(js.executeScript("return window.pageYOffset;"));
      WebElement  logo= driver.findElement(By.xpath("//h2[normalize-space()='Static Web Table']"));
      js.executeScript("arguments[0].scrollIntoview();",logo);
  	System.out.println(js.executeScript("return window.pageYOffset;"));

       

        

        
        
    }
}
