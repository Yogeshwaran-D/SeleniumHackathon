package grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupClass {
	
	@Test(priority = 1, groups= {"regression"})
	void signupByNumber() {
		System.out.println("Signup Number");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2 , groups= {"regression"})
	void signupByFacebook() {
		System.out.println("Signup Facebook");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3 , groups= {"regression"})
	void signupByEmail() {
		System.out.println("Signup Email");
		Assert.assertTrue(true);
	}
}
