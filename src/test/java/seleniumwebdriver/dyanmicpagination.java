package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class dyanmicpagination {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();

        // Login
        
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
        username.sendKeys("demo");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.clear();
        password.sendKeys("demo");
        
        // Click the login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        clickButtonWhenReady(driver, loginButton);

        // Wait for the page to load after login
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='menu-catalog']//a"))).click(); // Navigate to Catalog menu

        // Assume we're now on the product list page which has dynamic pagination
        boolean hasNextPage = true;
        while (hasNextPage) {
            // Wait for the page of products to load
            wait.until(ExpectedConditions.visibili
            		tyOfElementLocated(By.xpath("//table[@class='table table-bordered table-hover']//tbody")));
            
            // Process the products on the current page (e.g., print product names)
            for (WebElement product : driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody/tr"))) {
                WebElement productName = product.findElement(By.xpath(".//td[2]"));
                System.out.println("Product Name: " + productName.getText());
            }

            // Check if the next page exists and click it
            WebElement nextPageButton = driver.findElement(By.xpath("//ul[@class='pagination']//li[@class='page-item']//a[text()='›']"));
            if (nextPageButton.isEnabled()) {
                clickButtonWhenReady(driver, nextPageButton);  // Click next page button
                // Wait for the new page to load
                wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody"))));
            } else {
                hasNextPage = false; // No next page, stop the loop
            }
        }

        // Close the browser after completing the action
        driver.quit();
    }

    // Method to click the button when it is ready
    private static void clickButtonWhenReady(WebDriver driver, WebElement button) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(button));  // Wait for the button to be clickable
        button.click();  // Click the button

        // If regular click does not work, try clicking via JavaScript
        if (!button.isEnabled()) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", button);  // JavaScript click
        }
    }
}
