package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}
	// Locators
	
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By btn_login_loc = By.xpath("//button[text()=' Login ']");
	

	// Action Methods
	
	public void setUserName(String user) {
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void setPassword(String pass) {
		driver.findElement(txt_password_loc).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login_loc).click();
	}
}
