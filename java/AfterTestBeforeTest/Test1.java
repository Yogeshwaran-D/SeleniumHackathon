package AfterTestBeforeTest;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	void testTake() {
		System.out.println("Take");
	}
	@BeforeTest
	void beforeT() {
		System.out.println("Before Test");
	}
}
