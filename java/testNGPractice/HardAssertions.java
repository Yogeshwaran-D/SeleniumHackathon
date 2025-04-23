package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	@Test
	void test1() {
		Assert.assertEquals("abc", "abc");
	}
	
	@Test
	void test2() {
		Assert.assertEquals("abc", "abcd");
	}
	
	@Test
	void test3() {
		Assert.assertEquals("abc", 123);
	}
	
	@Test
	void test4() {
		Assert.assertEquals(123, 123);
	}
	
	
	@Test
	void test5() {
		Assert.assertNotEquals("abc", "abcd");
	}
	
	@Test
	void test6() {
		Assert.assertTrue(1==1);
	}
	
	@Test
	void test7() {
		Assert.assertFalse(1==1);
	}
	
	@Test
	void test8() {
		Assert.fail();
	}
	
	
}
