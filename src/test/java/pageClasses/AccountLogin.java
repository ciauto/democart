package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class AccountLogin extends BasePage {
	
	
	
	public AccountLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@id='input-email']")
	public WebElement txtField_email;
	
	
	
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement txtField_password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	public WebElement btn_login;
	
	
	
	public void enterEmailAddress() {
		txtField_email.sendKeys("demo30@gmail.com");
	}
	
	public void enterPassword() {
		txtField_password.sendKeys("Bayview@2020");
	}
	
	public void doLogin() {
		btn_login.click();
	}
	
	public void doLogin2(String email_address, String password) {
		txtField_email.sendKeys(email_address);
		txtField_password.sendKeys(password);
		btn_login.click();
	}
	
	

}
