package seleniumwebdriver;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tkessss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source_file=ts.getScreenshotAs(OutputType.FILE);
		File target_file=new File(System.getProperty("user.dir")+"scrresnshot.png");
		source_file.renameTo(target_file);

	}

}
