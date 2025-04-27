package revesion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginationnn {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();

        // Logging in
        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");

        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        button.click();

        // Navigating to the product list page after login
        WebElement menu = driver.findElement(By.xpath("//i[@class='fa fa-cogs fa-fw']"));
        menu.click();  // Clicking the Settings menu or whatever menu leads to the product list

        WebElement productList = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
        productList.click();  // Navigating to the Products page
        
        // Pagination Handling - Example of navigating through pages
        while (true) {
            // Extracting product details from the current page
            // Let's assume there's a list of product names on the page
            List<WebElement> products = driver.findElements(By.xpath("//table//tr/td[2]"));
            for (WebElement product : products) {
                System.out.println(product.getText());
            }
            
            // Check if there is a "Next" button for pagination
            WebElement nextButton = driver.findElement(By.xpath("//ul[@class='pagination']//li[@class='next']//a"));
            if (nextButton != null && nextButton.isEnabled()) {
                nextButton.click();  // Click to go to the next page
            } else {
                break;  // Exit the loop if there's no next page
            }
        }

        // Close the browser
        driver.quit();
    }
}
