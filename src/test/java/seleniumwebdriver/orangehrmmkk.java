package seleniumwebdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmmkk {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
        
        // Set the implicit wait time (in seconds)
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        
        // Navigate to the URL	
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        // Maximize the browser window
        driver.manage().window().maximize();
 List<WebElement> links = driver.findElements(By.tagName("a"));
        
        // Print the number of links
        System.out.println("Number of links: " + links.size());
        
        // Optionally, print the link text for debugging or further use
        // for (WebElement link : links) {
        //     System.out.println(link.getText());
        // }
        
        // Close the browser
        driver.quit();

	}
}


