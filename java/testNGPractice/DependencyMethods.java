package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

	@Test(priority = 1)
	void login() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2 , dependsOnMethods = {"login"})
	void openapp() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3 , dependsOnMethods = {"openapp"})
	void search() {
		Assert.assertTrue(false);
	}
	
	@Test(priority = 4 , dependsOnMethods = {"openapp","search"})
	void advanceSearch() {
		Assert.assertTrue(true);
	}
	
	@Test(priority = 5 , dependsOnMethods = {"openapp"})
	void logout() {
		Assert.assertTrue(true);
	}
}
