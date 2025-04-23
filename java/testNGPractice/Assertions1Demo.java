package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions1Demo {

	@Test(priority = 1)
	void testTitle1() {
		String expTitle = "One Shop";
		String actTitle = "Two Shop";

		Assert.assertEquals(expTitle, actTitle);
	}

	@Test(priority = 2)
	void testTitle2() {
		String expTitle = "One Shop";
		String actTitle = "One Shop";

		Assert.assertEquals(expTitle, actTitle);
//		Assert.assertTrue(true);
	}
}
