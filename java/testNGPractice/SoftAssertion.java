package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	void test1() {
		SoftAssert sa= new SoftAssert();
		System.out.println("Before Soft Assertion");
		sa.assertEquals("abc", "abcd");
		System.out.println("After Soft Assertion");
		sa.assertAll();
	}
	
	@Test
	void test2() {
		System.out.println("Before Hard Assertion");
		Assert.assertEquals("abc", "abcd");
		System.out.println("After Hard Assertion");
		
	}
}
