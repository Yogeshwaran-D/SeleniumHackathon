package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
	WebDriver driver;

	@BeforeMethod
	void openApp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test(priority = 1)
	void myInfo() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	void pim() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
	}

	@AfterMethod
	void closeApp() {
		driver.quit();
	}
}
