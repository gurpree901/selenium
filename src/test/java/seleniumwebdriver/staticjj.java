package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticjj {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//all rows size
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("all rows:"+rows);
		
		//all columns
	int columns=	driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	  System.out.println("all columns:"+columns);
	  
	  //specific row and column
	String ss=  driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]")).getText();
	System.out.println(ss);
	
	
	//for loop
	/*for(int r=1;r<rows;r++)
	{//
		for(int c=1;c<columns;c++)
		{
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.println(value);

		}*/
	//}//
	
	//book name autor mukesh
	     
	    /* for(int i=2;i<rows;i++)
	     {
				String authorname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
				System.out.println(authorname);
				if(authorname.equals("mukesh"))
				{
					String authorna=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
					System.out.println(authorna);

				}

	     }*/
	     int total=0;
	     
	     for(int i=2;i<rows;i++)
	     {
				String pricing=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
				total=total+Integer.parseInt(pricing);
				System.out.println(pricing);

	     }
	     
	     System.out.println(total);
	
	

	}

}
