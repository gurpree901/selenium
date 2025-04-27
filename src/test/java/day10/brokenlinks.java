package day10;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		//all links
		List<WebElement >alllinks=driver.findElements(By.tagName("a"));
		for( WebElement value:alllinks)
		{
			String ss=value.getAttribute("href");
			if(ss.equals("empty") || ss.equals("null"))
			{
				System.out.println("not able to find links");
			}
			URL ul=new URL(ss);
			HttpURLConnection res=(HttpURLConnection) ul.openConnection();
			if(res.getResponseCode()>=400)
			{
				System.out.println(ss+"broken links");
			}
			else
			{
				System.out.println(ss+"not broken links");

			}
		}
		

	}

}
