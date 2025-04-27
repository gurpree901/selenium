package day10;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source_file=ts.getScreenshotAs(OutputType.FILE);
		File target_file=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		source_file.renameTo(target_file);
		
		WebElement phone=driver.findElement(By.xpath("//input[@id='phone']"));
		File source_file1=ts.getScreenshotAs(OutputType.FILE);
		File target_file1=new File(System.getProperty("user.dir")+"\\screenshots\\phone.png");
		source_file.renameTo(target_file1);
	}

}
