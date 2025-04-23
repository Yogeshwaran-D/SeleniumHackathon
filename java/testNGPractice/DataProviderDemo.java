package testNGPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}
	
	@Test(dataProvider="dp")
	void login(String email , String pass) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		boolean status = driver.findElement(By.id("my home")).isDisplayed();
		
		Assert.assertTrue(status);
	}
	
	@AfterClass
	void close() {
		driver.close();
	}
	
	@DataProvider(name="dp" , indices= {0,1})
	Object[][] loginData() {
		Object [][] loginData= {
				{"test1@gmail.com" , "password1@123"},
				{"test2@gmail.com" , "password2@123"},
				{"test3@gmail.com" , "password3@123"}
		};
		return loginData;
	}
}
