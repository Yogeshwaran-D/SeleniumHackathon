package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(null).moveToElement(null).perform();
		
		actions.contextClick(null).perform();
		
		actions.doubleClick(null).perform();
		
		actions.dragAndDrop(null, null).perform(); 
		
		Action rightClick = actions.contextClick(null).build();
		
		rightClick.perform();
		
	}
}
