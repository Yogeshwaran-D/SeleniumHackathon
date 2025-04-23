package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//		driver.switchTo().alert().dismiss();
		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Google");
//		alert.accept();
		
		// basic auth
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//Frames
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// id , name , WebElement , index
		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("Google");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("Google");
		
	}
}
