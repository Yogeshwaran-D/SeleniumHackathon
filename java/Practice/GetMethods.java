package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// get methods works on webpages
		
		// get(URL)
		driver.get("https://testautomationpractice.blogspot.com/");
		//getTitle()
		System.out.println(driver.getTitle());
		//getCurrentUrl()
		System.out.println(driver.getCurrentUrl());
		//getPageSource()
		//getWindowHandle()
		System.out.println(driver.getWindowHandle());
		//getWindowHandles()
		System.out.println(driver.getWindowHandles());
	}
}
