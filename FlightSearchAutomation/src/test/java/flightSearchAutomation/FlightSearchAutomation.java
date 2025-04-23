package flightSearchAutomation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightSearchAutomation {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	public static String mainWindow;

	// Method to set up the WebDriver based on the specified browser
	public static void setupWebDriver(String browser) {
		switch (browser.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		}

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	// Method to open the web site and handle the initial pop up
	public static void openWebSite() {
		String baseUrl = "https://www.ixigo.com/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		mainWindow = driver.getWindowHandle();
		
		List<WebElement> iframes = driver.findElements(By.xpath("//*[@id='wiz-iframe-intent']"));
		if (!iframes.isEmpty()) {
			WebElement popupFrame = iframes.get(0);
			driver.switchTo().frame(popupFrame);
			driver.findElement(By.xpath("//*[@id='closeButton']")).click();
			driver.switchTo().defaultContent();
		}
		
		ScreenshotOperations.takeScreenshot(driver, "homepage");
	}

	// Method to select the departure place
	public static void selectDeparturePlace() {
		driver.findElement(By.xpath("//p[@data-testid='originId']")).click();

		List<WebElement> departureList = driver.findElements(
				By.xpath("//p[@class=\"body-sm text-secondary\" and text()='Chennai International Airport']"));
		departureList.get(0).click();
		ScreenshotOperations.takeScreenshot(driver, "selectDeparturePlace");

	}

	// Method to select the destination place
	public static void selectDestinationPlace() {

		List<WebElement> destinationList = driver.findElements(
				By.xpath("//p[@class=\"body-sm text-secondary\" and text()='Indira Gandhi Intl Airport']"));
		destinationList.get(1).click();
		ScreenshotOperations.takeScreenshot(driver, "selectDestinationPlace");
	}

	// Method to select the departure date
	public static void selectDepartureDate() {
		driver.findElement(By.xpath("//p[@data-testid=\"departureDate\"]")).click();

		driver.findElement(By.xpath("//abbr[@aria-label='April 2, 2025']")).click();

		ScreenshotOperations.takeScreenshot(driver, "selectDepartureDate");
	}

	// Method to select the return date
	public static void selectReturnDate() {

		js.executeScript("window.scrollTo(0,0);", "");

		driver.findElement(By.xpath("//span[text()=\"Return\"]")).click();

		driver.findElement(By.xpath("//abbr[@aria-label='April 5, 2025']")).click();

		ScreenshotOperations.takeScreenshot(driver, "selectReturnDate");
	}

	// Method to select the number of travelers and class
	public static void selectTravelAndClass() {

		driver.findElement(By.xpath(
				"/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/button[2]"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/button[2]"))
				.click();

		driver.findElement(By.xpath("//span[@class=\"px-5px\" and text()=\"Economy\"]")).click();
		ScreenshotOperations.takeScreenshot(driver, "selectTravelAndClass");

		driver.findElement(By.xpath("//button[text()=\"Done\"]")).click();

	}

	// Method to click the search button
	public static void selectSearch() {
		driver.findElement(By.xpath("//button[text()=\"Search\"]")).click();
	}

	// Method to switch to the new window
	public static void switchWindow() {
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			if (!handle.equals(mainWindow)) {
				driver.switchTo().window(handle);
				break;
			}
		}
		ScreenshotOperations.takeScreenshot(driver, "switchWindow");
	}

	// Method to retrieve flight details and write them to an Excel file
	public static void retriveDetails() throws FileNotFoundException, IOException {

		WebElement button = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Flight Details ']")));
		button.click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[@data-testid=\"airline-number\"]/span")));
		List<WebElement> flightList = driver.findElements(By.xpath("//p[@data-testid=\"airline-number\"]/span"));
		List<WebElement> timeList = driver.findElements(By.xpath("//h4[@class=\"h4 text-primary mb-5 font-medium\"]"));
		wait.until(ExpectedConditions.visibilityOfAllElements(timeList));
		String dFlightName = flightList.get(0).getText();
		String dDepartureTime = timeList.get(0).getText();
		String dArrivalTime = timeList.get(1).getText();

		String rFlightName = flightList.get(1).getText();
		String rDepartureTime = timeList.get(2).getText();
		String rArrivalTime = timeList.get(3).getText();

		String[][] data = { { "Flight", "Flight Name", "Departure Time", "Arrival Time" },
				{ "Departure Flight", dFlightName, dDepartureTime, dArrivalTime },
				{ "Return Flight", rFlightName, rDepartureTime, rArrivalTime } };

		ExcelOperations.writeData(data);

		ScreenshotOperations.takeScreenshot(driver, "retriveDetails");

	}

	// Method to quit the browser
	public static void quitBrowser() {
		driver.quit();
	}

}
