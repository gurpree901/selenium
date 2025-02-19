package seleniumwebdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationnn {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://122.160.40.168:9090/nfdp/#/");
		driver.manage().window().maximize();
		URL urls=new URL("http://122.160.40.168:9090/nfdp/#/");
		driver.navigate().to(urls);
		driver.quit();

	}

}
