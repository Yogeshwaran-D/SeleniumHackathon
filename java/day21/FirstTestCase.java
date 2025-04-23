package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	public static void main(String[] args) {
		// 1. Launch the browser "Chrome"
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// 2. Open URl https://www.opencart.com/
		
		driver.get("https://www.opencart.com/");
		
		// 3. Validate the title "Your Store"
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals("OpenCart - Open Source Shopping Cart Solution")) System.out.println("Test Passed");
		else System.out.println("Test Falied");
		
		// 4. Close browser
		driver.close();
		
	}
}
