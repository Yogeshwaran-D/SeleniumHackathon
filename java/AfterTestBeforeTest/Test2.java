package AfterTestBeforeTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	void testput() {
		System.out.println("Put");
	}
	@AfterTest
	void beforeT() {
		System.out.println("After Test");
	}
}
