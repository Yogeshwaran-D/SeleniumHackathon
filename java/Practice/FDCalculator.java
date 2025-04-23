package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("//*[@id=\"principal\"]")).sendKeys("1000");
		driver.findElement(By.id("//*[@id=\"interest\"]")).sendKeys("7");
		driver.findElement(By.id("//*[@id=\"tenure\"]")).sendKeys("7");
		WebElement dropDown1 = driver.findElement(By.id("//*[@id=\"tenurePeriod\"]"));
		Select selectDropDown1 = new Select(dropDown1);
		dropDown1.click();
		selectDropDown1.selectByVisibleText("year(s)");
		
		WebElement dropDown2 = driver.findElement(By.id("//*[@id=\"tenurePeriod\"]"));
		Select selectDropDown2 = new Select(dropDown2);
		dropDown2.click();
		selectDropDown2.selectByVisibleText("Compounded Yearly");
		
		System.out.println("Returns : "+ driver.findElement(By.xpath("//*[@id=\"lumpsum_return\"]/p[3]/span")).toString());
		
	}
}
