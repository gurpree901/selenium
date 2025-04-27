package revesion;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutorExample {

    public static void main(String[] args) {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        // Open the URL
        driver.get("https://testautomationpractice.blogspot.com/");
        
        // Locate the WebElement
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        
        // Cast the driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Example JavaScript code to fill the username input field
        js.executeScript("arguments[0].setAttribute('value','john')", username);
        
        // Close the browser
        driver.quit();
    }
}
