package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void normalDropDown(WebDriver driver) {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropDown = driver.findElement(By.id("country"));
		Select opions = new Select(dropDown);
		
		// different ways to select the value
		
		// 1.ByIndex
		// opions.selectByIndex(1);
		
		// 2.ByVisibleText
		// opions.selectByVisibleText("Canada");
		
		// 3.ByValue
		// opions.selectByValue("japan");
		
		// 4.ContainsValue
		//opions.selectByContainsVisibleText("Aus");
		
		//Options text
		
		List<WebElement> elements = opions.getOptions();
		System.out.println(elements.size());
		
		for(WebElement ele : elements) {
			System.out.println(ele.getText());
		}
		
	}
	
	public static void bootstrapDropDown(WebDriver driver) {
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		driver.findElement(By.xpath("//input[@value='Angular']")).click();
	}
	
	public static void hiddenDropDown(WebDriver driver) {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//normalDropDown(driver);
		
		//bootstrapDropDown(driver);
		
		//dynamic drop downs 	
		hiddenDropDown(driver);

	}
}
