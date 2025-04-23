package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class Demo {
	
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://testautomationpractice.blogspot.com/");
//		
//		driver.findElement(By.cssSelector("#name")).sendKeys("Google");
//		driver.findElement(By.cssSelector(".form-control[placeholder='Enter EMail']")).sendKeys("Google@gmail.com");
//		driver.findElement(By.cssSelector("input.form-control[placeholder='Enter Phone']")).sendKeys("9876543210");
		
//		WebDriver driver =  new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		
//		File target = new File("C:\\webautomation\\seleniumwebdriver\\Screenshots\\amazon.png");
//		
//		source.renameTo(target);
		
//		WebElement sell = driver.findElement(By.id("Sell"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		js.executeScript("arguments[0].click()", sell);
		

//		WebElement sell = driver.findElement(By.id("twotabsearchtextbox"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		//js.executeScript("arguments[0].setAttribute('value','iphone')", sell);
//		
//		js.executeScript("window.scrollBy(0,200)", "");
		
//		WebElement ele = driver.findElement(By.cssSelector("div.nav-search-field "));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//WebElement ele = wait.until(ExpectedConditions.visibilityOf(""));
		
//	}
		
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://amazon.in");
			
			driver.manage().window().maximize();
			
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			
//			driver.findElement(By.id(""));
//			driver.findElement(By.xpath(""));
//			driver.findElement(By.cssSelector(""));
//			driver.findElement(By.className(""));
//			driver.findElement(By.linkText(""));
//			driver.findElement(By.partialLinkText(""));
//			driver.findElement(By.tagName(""));
//			
//			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
//			
//			driver.findElement(By.xpath("//button[@id='search']/parent::input"));
//			
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			
//			File target = new File(System.getProperty("user")+"\\Screenshots\\test.png");
//			
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			
//			source.renameTo(target);
//			
//			FileInputStream file = new FileInputStream("url");
//			
//			XSSFWorkbook workBook = new XSSFWorkbook(file);
//			
//			XSSFSheet sheet = workBook.getSheet("sheet1");	
//			
//			FileOutputStream file1 = new FileOutputStream("url");
//			
//			XSSFWorkbook workBook1 = new XSSFWorkbook(file);
//			
//			XSSFSheet sheet1 = workBook1.getSheet("sheet1");	
//			
//			XSSFRow row1 = sheet1.getRow(0);
//			
//			XSSFCell cell1 = row1.createCell(0);
//			
//			cell1.setCellValue("Hello");
//			
//			workBook.write(file1);
//			
//			file1.close();
//			
//			JavascriptExecutor js = (JavascriptExecutor) driver ; 
//			
//			js.executeScript("arguments[0].click()", args);
//			
//			js.executeScript("window.scrollBy(0,200)", "");
//			
//			js.executeScript("arguments[0].setAttribute('value','Hello')", args);
//			
//			List<WebElement> = driver.findElements(By.xpath(""));
			
			
			
//			System.out.println(driver.getWindowHandle());
//					
//			Set<String> setHandles = driver.getWindowHandles();
//			setHandles.
//			List<String> handles = (List<String>) setHandles;
//			driver.switchTo().window(handles[0]);
//			
			
			
			
		}
		
		
}
