package day28;

import java.time.Duration;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PaginationWithCaptcha {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();

        // Username and password input
        WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
        password.clear();
        password.sendKeys("demo");

        // Login button
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        button.click();

        // Check if CAPTCHA appears
        try {
            WebElement captchaFrame = driver.findElement(By.xpath("//iframe[contains(@src, 'captcha')]"));
            if (captchaFrame.isDisplayed()) {
                System.out.println("CAPTCHA detected, attempting to solve...");
                // Solve CAPTCHA
                String siteKey = driver.findElement(By.cssSelector("div.g-recaptcha")).getAttribute("data-sitekey");
                String captchaSolution = solveCaptcha(siteKey, "your_2captcha_api_key"); // Replace with your actual API key
                System.out.println("CAPTCHA solution received: " + captchaSolution);

                // Inject the solution into the CAPTCHA field
                WebElement captchaInput = driver.findElement(By.id("g-recaptcha-response"));
                ((RemoteWebDriver) driver).executeScript("arguments[0].style.display = 'block';", captchaInput); // Make it visible if hidden
                captchaInput.sendKeys(captchaSolution);

                // Submit the form after solving CAPTCHA
                WebElement submitButton = driver.findElement(By.id("submit-button")); // Update selector accordingly
                submitButton.click();
            }
        } catch (Exception e) {
            System.out.println("No CAPTCHA detected or an error occurred: " + e.getMessage());
        }

        // Additional steps can go here (e.g., wait for successful login, check for redirects, etc.)
    }

    // Function to solve CAPTCHA using 2Captcha API
    private static String solveCaptcha(String siteKey, String apiKey) throws Exception {
        // Request the CAPTCHA solving
        String requestUrl = "http://2captcha.com/in.php?key=" + apiKey + "&method=userrecaptcha&googlekey=" + siteKey + "&pageurl=https://demo.opencart.com/admin/index.php";
        HttpURLConnection connection = (HttpURLConnection) new URL(requestUrl).openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = reader.readLine();
        reader.close();

        // Parse the response (wait for the CAPTCHA solution)
        if (response.contains("OK|")) {
            String requestId = response.split("\\|")[1];
            String solutionUrl = "http://2captcha.com/res.php?key=" + apiKey + "&action=get&id=" + requestId;
            while (true) {
                HttpURLConnection solutionConnection = (HttpURLConnection) new URL(solutionUrl).openConnection();
                solutionConnection.setRequestMethod("GET");
                BufferedReader solutionReader = new BufferedReader(new InputStreamReader(solutionConnection.getInputStream()));
                String solutionResponse = solutionReader.readLine();
                solutionReader.close();

                if (solutionResponse.contains("OK|")) {
                    return solutionResponse.split("\\|")[1]; // Return the CAPTCHA solution
                } else if (solutionResponse.contains("ERROR")) {
                    throw new Exception("Error solving CAPTCHA: " + solutionResponse);
                }

                // Wait before retrying
                Thread.sleep(5000);
            }
        } else {
            throw new Exception("Error requesting CAPTCHA solve: " + response);
        }
    }
}
