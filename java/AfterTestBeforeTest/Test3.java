package AfterTestBeforeTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Test3 {
	@BeforeSuite
	void beforeSuite() {
		System.out.println("Before Suit");
	}
	@AfterSuite
	void afterSuite() {
		System.out.println("After Suit");
	}
}
