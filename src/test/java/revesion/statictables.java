package revesion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("number of rows:"+rows);
		
		int coln=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
         System.out.println("number of rows:"+coln);
         
        String specific= driver.findElement(By.xpath("//table[@name='BookTable']//tr[3]//td[1]")).getText();
        System.out.println("specif value:"+specific);
        
        for(int r=2;r<rows;r++)
        {
        	for(int c=1;c<coln;c++)
        	{
        	
        		String allrows=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();  
        		System.out.println(allrows+"/t");
        	}
        	System.out.println();
        }
        
	}

}
