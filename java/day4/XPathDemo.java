package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://docs.nopcommerce.com/en/index.html");
	
//	driver.findElement(By.xpath("//*[@id=\"search-query\"]")).sendKeys("Google");
//	driver.findElement(By.xpath("//input[@id=\"search-query\"]")).sendKeys("Google");
	
//	multiple attributes
//	driver.findElement(By.xpath("//input[@id=\"search-query\"][@class=\"form-control\"]")).sendKeys("Google");

//	And Or operator
//	driver.findElement(By.xpath("//*[@id=\"search-query\" and @class=\"form-control\"]")).sendKeys("Google");
//	driver.findElement(By.xpath("//*[@id=\"search-query\" or @class=\"form-control \"]")).sendKeys("Google");

//	xpath with text all linktext are innertext but all innertext are not linktexts
//	driver.findElement(By.xpath("//*[text()='hosting company']")).click();
//	boolean displayStatus = driver.findElement(By.xpath("//h1[text()='nopCommerce Documentation']")).isDisplayed();
//	System.out.println(displayStatus);
	
//	xptah with contains()
//	driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Google");
//	xpath with starts-with
//	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Google");
	// "//button[starts-with(@id,'st')]"  "//button[@id='start' or @id='stop']" "//button[contains(@id,'st')]"

//  chained xpath  @div[@id='parent']/a/img
//	driver.findElement(By.xpath("//form[@id='search']/div/input")).sendKeys("Google");
	
//	css locator is one direction top to down but xpath is two directioanl 
	
	
}
}
