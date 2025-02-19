package seleniumwebdriver;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesscreenshot {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		/*TakesScreenshot ts=(TakesScreenshot) driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("usr.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);*/
		
		
		//highlight single elemnt
		WebElement box=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sorce=box.getScreenshotAs(OutputType.FILE);
		File taregt=new File(System.getProperty("user.directory")+"\\screenshot\\box.image");
		sorce.renameTo(taregt);
		driver.quit();
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File f=new File(System.getProperty("user.dir")+"scrrenshot\\logo.image");
		sourcefile.renameTo(f);

	}

}
