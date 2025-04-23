package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	//Thread
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	
	//Implicit Wait
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	
	
	//Explicit Wait
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
	
}
}
