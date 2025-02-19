package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class traceeability {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://122.160.40.168:9090/nfdp/#/training-awareness-generation");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='normal_text1']")).click();

	}

}
