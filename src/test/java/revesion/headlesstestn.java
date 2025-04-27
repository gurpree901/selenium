package revesion;

import org.openqa.selenium.chrome.ChromeOptions;

public class headlesstestn {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("- -headless=new");

	}

}
