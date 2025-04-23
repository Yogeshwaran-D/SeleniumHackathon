package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter  {
	public static void main(String[] args){
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	//sendKeys()
//	WebElement input = driver.findElement(By.id("email"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].setAttribute('value','Google')", input);
	//click()
	WebElement radioMale = driver.findElement(By.id("male"));
	js.executeScript("arguments[0].click()", radioMale);
	//scrolling 
	//till pixel no
	js.executeScript("window.scrollBy(0,3000)", "");
//	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	js.executeScript("window.scrollTo(0,0)", "");
	
	//till element is visible
	
//	WebElement element = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
//	js.executeScript("arguments[0].scrollIntoView();", element);
//	System.out.println(js.executeScript("return window.pageYOffset;"));
	
	
	//till the end
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	System.out.println(js.executeScript("return window.pageYOffset;"));
	
//	Zoom
//	js.executeScript("document.body.style.zoom='50%'");
	
//	upload files
	//single file upload
//	driver.findElement(By.xpath("id")).sendKeys("path");
//	driver.findElement(By.xpath("ul[]//li")).getText();
	
//	Send two files
//	driver.findElement(By.xpath("")).sendKeys(file1+"\n"+file2);
	
	}
}
