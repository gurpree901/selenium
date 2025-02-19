package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nfdpregister {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://122.160.40.168:9090/nfdp/#/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/ul/li[6]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/ul/li[9]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-dashboard/ng-component/div[2]/div[1]/span")).click();
		 
		
		

	}

}
