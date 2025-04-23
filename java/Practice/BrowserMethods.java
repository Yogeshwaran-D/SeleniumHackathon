package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Close closes only the current window
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.close();
	
//	driver.get("https://www.browserstack.com/guide/handle-multiple-windows-in-selenium");
//	driver.manage().window().maximize();
//
//	js.executeScript("window.scrollBy(0,500)", "");
//	driver.findElement(By.xpath("//*[@id=\"singlePageArticle\"]/div[1]/div[1]/div[3]/p[1]/a[1]")).click();
//	
//	driver.close();
	
	//Quit closes all the windows
	
	driver.get("https://www.browserstack.com/guide/handle-multiple-windows-in-selenium");
//	driver.manage().window().maximize();
//
//	js.executeScript("window.scrollBy(0,500)", "");
//	driver.findElement(By.xpath("//*[@id=t\"singlePageArticle\"]/div[1]/div[1]/div[3]/p[1]/a[1]")).click();
//	
//	
//	
//	driver.quit();
	
//	navigation methods
//	driver.navigate().to(null); // accepts string and object it calls the get method internally
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();
	
	

}
}
