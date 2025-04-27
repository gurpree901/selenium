package revesion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		WebElement fileupload=driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		fileupload.sendKeys("C:\\fisheries\\training login");
		if(driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText().equals("fileuplod"))
				{
			        System.out.println("document uploaded");
				}
		else
		{
			System.out.println("not uploaded");
		}
	}

}
