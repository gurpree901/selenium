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

public class brokenlinksj {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement lnk:links)
		{
			String ss=lnk.getAttribute("href");
			if(ss.equals("empty") || ss.equals("null"))
			{
				System.out.println("not able to find the links");
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
