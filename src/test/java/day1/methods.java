package day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");    
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		URL UL=new URL("https://testautomationpractice.blogspot.com/");
		driver.navigate().to(UL);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
