package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// id name tagName className linkText partialLinkText name xpath
		
		
		/*CSSSelectors
		
		driver.findElement(By.cssSelector("#name")).sendKeys("Google");
		driver.findElement(By.cssSelector(".form-control[placeholder='Enter EMail']")).sendKeys("Google@gmail.com");
		driver.findElement(By.cssSelector("input.form-control[placeholder='Enter Phone']")).sendKeys("9876543210");
		*/
		
		/* xpath
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Google");
		driver.findElement(By.xpath("//*[@class='form-control'][@placeholder='Enter EMail']")).sendKeys("Google@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Enter Phone']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[text()='Phone:']"));
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Phon')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Enter Phon')]")).sendKeys("9876543210");
		
//		css locator is one direction top to down but xpath is two directioanl 
		*/
		
//		driver.findElement(By.xpath("//*[text()='Name:']/following-sibling::input")).sendKeys("Google");
//		driver.findElement(By.xpath("//*[@id='phone']/preceding-sibling::input[1]")).sendKeys("Google@gmail.com");
		
	}
}
