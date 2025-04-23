package grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentClass {
	@Test(priority = 1 , groups= {"sanity","regression","functional"})
	void paymentRupees() {
		System.out.println("Payment Rupees");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2 , groups= {"sanity","regression","functional"})
	void paymentDollar() {
		System.out.println("Payment Dollar");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 3 , groups= {"sanity","regression","functional"})
	void paymentEuro() {
		System.out.println("Payment Euro");
		Assert.assertTrue(true);
	}
}
