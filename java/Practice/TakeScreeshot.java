package Practice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreeshot {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	TakesScreenshot ts = (TakesScreenshot) driver; 
	
	
	File sourceFile = ts.getScreenshotAs(OutputType.FILE);
	File targetFile = new File("C:\\webautomation\\ScreenShots\\shot1.png");
	sourceFile.renameTo(targetFile);
}
}
