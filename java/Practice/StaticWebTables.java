package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTables {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@name='callout']"));
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
	driver.switchTo().defaultContent();
	
	driver.findElement(By.xpath("//*[@name='q']")).click();
	List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@class='wM6W7d']//span"));
	for(WebElement ele : options) {
		System.out.println(ele.getText());
	}
}
}
