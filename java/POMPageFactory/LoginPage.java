package POMPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// Constructor
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(driver, this);

	}
	// Locators
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement txt_username_loc ;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password_loc ;
	@FindBy(xpath = "//button[text()=' Login ']") WebElement btn_login_loc ;
	
//	@FindBy(how=How.XPATH , using="//input[@placeholder='Password']") WebElement txt_password_loc ;
	
	// Action Methods
	
	public void setUserName(String user) {
		txt_username_loc.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		txt_password_loc.sendKeys(pass);
	}
	
	public void clickLogin() {
		btn_login_loc.click();
	}
}
