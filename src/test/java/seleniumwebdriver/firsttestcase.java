package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttestcase {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://122.160.40.168:9090/nfdp/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));;
		driver.findElement(By.xpath("//a[normalize-space()='Education Corner']")).click();
		driver.close();
		

	}

}
