package seleniumwebdriver;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takessccc {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;  
		File source_file=ts.getScreenshotAs(OutputType.FILE);
		File f=new File(System.getProperty("user.getdirectory")+"\\screenshot+\\fullpage.png");

	}

}
