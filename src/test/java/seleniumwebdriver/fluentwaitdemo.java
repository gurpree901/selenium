package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentwaitdemo {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		Wait <WebDriver> mywait=new FluentWait<WebDriver>(driver);
		.withTimeout(Duration.ofSeconds(10));

	}

	private static void withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		
	}

}
