import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("Cognizant");
		List<WebElement> list = driver.findElements(By.xpath("//li[@data-entityid='autocomplete_user_feedback_kp_id']//span"));
		
		list.get(0).click();
		
	}
}
