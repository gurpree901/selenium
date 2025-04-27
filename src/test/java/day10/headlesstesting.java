package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class headlesstesting {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://demo.opencart.com/");
		String title=driver.getTitle();
		if(title.equals("your store"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}

	}

}
