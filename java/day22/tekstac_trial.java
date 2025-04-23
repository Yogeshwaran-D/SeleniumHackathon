package day22;

//package selenium_practice.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class tekstac_trial {
 
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://cognizant.tekstac.com/blocks/tekfeedback/feedback.php?mid=5558341431661349&uid=7012&redirect=mandate";
		
		driver.get(baseUrl);
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement star = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div/section[1]/div[1]/div[7]/div[1]/div[2]/span[5]"));
		star.click();
		
		WebElement submit_feedback = driver.findElement(By.id("savefeedback"));
		submit_feedback.click();
 
	}
 
}
 
 
