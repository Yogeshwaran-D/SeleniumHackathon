package grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginClass {
	
	@Test(priority = 1 , groups= {"sanity"})
	void loginByNumber() {
		System.out.println("Login Number");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2 , groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("Login Facebook");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3 , groups= {"sanity"})
	void loginByEmail() {
		System.out.println("Login Email");
		Assert.assertTrue(true);
	}
}
