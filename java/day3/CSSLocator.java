package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.nopcommerce.com/en/index.html");
		driver.manage().window().maximize();
		
//		1. tagname#id
//		WebElement ele = driver.findElement(By.cssSelector("input#search-query"));
//		ele.sendKeys("Google");
		
//		2.optional tag name
//		driver.findElement(By.cssSelector("#search-query")).sendKeys("Google");
		
//		3.tagname.class
//		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Google");
//		driver.findElement(By.cssSelector(".form-control")).sendKeys("Google");
		
//		4.tagname[attribute]
//		driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("Google");
		
//		5.tagname.class[attribute]
//		driver.findElement(By.cssSelector("input.form-control[placeholder=\"Search\"]")).sendKeys("Google");
//		driver.findElement(By.cssSelector(".form-control[placeholder=\"Search\"]")).sendKeys("Google");

		
	
	}
}
