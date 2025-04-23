package flightSearchAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Main {
	// ExtentSparkReporter instance for configuring the report
	public static ExtentSparkReporter sparkReporter;
	// ExtentReports instance for populating the info to the report
	public static ExtentReports extent;
	// ExtentTest instance for creating test case entries and updating status of the test methods
	public static ExtentTest test;

	@BeforeTest
	// Method to set up the WebDriver and configure the report
	public static void driverSetup() {

		FlightSearchAutomation.setupWebDriver("chrome");
		// Initialize the ExtentSparkReporter with the report file path
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//reports//report.html");
		// Configure the report properties
		sparkReporter.config().setDocumentTitle("Flight Search Automation");
		sparkReporter.config().setReportName("Automation Report");
		sparkReporter.config().setTheme(Theme.STANDARD);
		// Initialize the ExtentReports and attach the reporter
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		// Set system information for the report
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Yogeshwaran D");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("Browser name", "Chrome");
	}

	@Test(priority = 1)
	// Method to test the web site launch
	public static void launchWebsite() {

		try {
			// Create a test entry for web site launch
			test = extent.createTest("Testing Website Launch");
			FlightSearchAutomation.openWebSite();
			// Log the test status as passed and attach a screenshot
			test.pass("Ixigo homepage launched", MediaEntityBuilder
					.createScreenCaptureFromPath(System.getProperty("user.dir") + "/Screenshots/homepage.png").build());
		} catch (Exception e) {
			// Log the test status as failed and attach the error message
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 2)
	// Method to test the selection of departure place
	public static void selectDeparturePlace() {

		try {
			test = extent.createTest("Testing Departure Place Selection");
			FlightSearchAutomation.selectDeparturePlace();
			test.pass("Departure Place selected", MediaEntityBuilder.createScreenCaptureFromPath(
					System.getProperty("user.dir") + "/Screenshots/selectDeparturePlace.png").build());
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 3)
	// Method to test the selection of destination place
	public static void selectDestinationPlace() {
		try {
			test = extent.createTest("Testing Destination Place Selection");
			FlightSearchAutomation.selectDestinationPlace();
			test.pass("Destination Place selected",
					MediaEntityBuilder
							.createScreenCaptureFromPath(
									System.getProperty("user.dir") + "/Screenshots/selectDestinationPlace.png")
							.build());
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 4)
	// Method to test the selection of departure date
	public static void selectDepartureDate() {
		try {
			test = extent.createTest("Testing Departure Date Selection");
			FlightSearchAutomation.selectDepartureDate();
			test.pass("Departure date selected", MediaEntityBuilder.createScreenCaptureFromPath(
					System.getProperty("user.dir") + "/Screenshots/selectDepartureDate.png").build());
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 5)
	// Method to test the selection of travel and class
	public static void selectTravelAndClass() {

		try {
			test = extent.createTest("Testing Travel And Class Selection");
			FlightSearchAutomation.selectTravelAndClass();
			test.pass("Travel And Class selected",
					MediaEntityBuilder
							.createScreenCaptureFromPath(
									System.getProperty("user.dir") + "/Screenshots/selectTravelAndClass.png")
							.build());
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 6)
	// Method to test the selection of return date
	public static void selectReturnDate() {

		try {
			test = extent.createTest("Testing Return Date Selection");
			FlightSearchAutomation.selectReturnDate();
			test.pass("Return date selected", MediaEntityBuilder
					.createScreenCaptureFromPath(System.getProperty("user.dir") + "/Screenshots/selectReturnDate.png")
					.build());
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 7)
	// Method to test the selection of search button
	public static void selectSearch() {

		try {
			test = extent.createTest("Testing Search Button Selection");
			FlightSearchAutomation.selectSearch();
			test.pass("Search Selected");
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 8)
	// Method to test the window switch
	public static void switchWindow() {

		try {
			test = extent.createTest("Testing Window Switch");
			FlightSearchAutomation.switchWindow();
			test.pass("Window Switched", MediaEntityBuilder
					.createScreenCaptureFromPath(System.getProperty("user.dir") + "/Screenshots/switchWindow.png")
					.build());
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@Test(priority = 9)
	// Method to test the retrieval of details
	public static void retriveDetails() {

		try {
			test = extent.createTest("Testing Details Retrive");
			FlightSearchAutomation.retriveDetails();
			test.pass("Details Retrived", MediaEntityBuilder
					.createScreenCaptureFromPath(System.getProperty("user.dir") + "/Screenshots/retriveDetails.png")
					.build());
		} catch (Exception e) {
			test.fail("Test FAILED: " + e.getMessage());
		}
	}

	@AfterTest
	// Method to flush the report and quit the browser
	public static void quitBrowser() {
		// Flush the report
		extent.flush();
		// Quit the browser
		FlightSearchAutomation.quitBrowser();
	}
}
