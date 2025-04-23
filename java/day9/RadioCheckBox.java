package day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioCheckBox {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	
//	1.select check box
//	WebElement checkBox = driver.findElement(By.xpath("//input[@id='sunday']"));
//	System.out.println(checkBox.isSelected());
//	if(! checkBox.isSelected()) checkBox.click();
	
//	2.capturing all checkboxes
//	List<WebElement> lis = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//	System.out.println(lis.size());
	
//	3.select all the checkboxes
//	for(WebElement ele : lis) {
//		ele.click();
//	}
	
	
//	Radio Button
//	WebElement male_button = driver.findElement(By.id("male"));
//	WebElement female_button = driver.findElement(By.id("female"));
//	male_button.click();
//	
//	female_button.click();
	
	
}
}
