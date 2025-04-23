package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://testautomationpractice.blogspot.com/");
		
//		Parent
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/parent::p")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/parent::*")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/..")).getText();
//		System.out.println(text);
		
//		Child
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/child::elemetName")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/child::*")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/elemetName")).getText();
//		System.out.println(text);
		
//		GrandChild
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/child/elemetName")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/*/elemetName")).getText();
//		System.out.println(text);
		
//		Ancestor
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/ancestor::elemetName")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/ancestor::*")).getText();
//		System.out.println(text);
		
//		Descendant	
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/descendant::elemetName")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/descendant::*")).getText();
//		System.out.println(text);
		
//		Preceding
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/preceding::elemetName")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/preceding::*")).getText();
//		System.out.println(text);
		
//		Following-sibling
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/following-sibling::elemetName")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/following-sibling::*")).getText();
//		System.out.println(text);
		
//		Preceding-sibling
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/preceding-sibling::elemetName")).getText();
//		String text = driver.findElement(By.xpath("//input[@id='txtDate']/preceding-sibling::*")).getText();
//		System.out.println(text);
		
		driver.get("https://webapps.tekstac.com/RentaCar/");
		System.out.println(driver.findElement(By.xpath("//div[@class='split right']")).getText());
		
	}
}
