package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class YourStore extends BasePage {

	
	public YourStore(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@class='dropdown-toggle']")
	public WebElement drp_down_myAccount;
	
	
	@FindBy(xpath="//a[text()='Login']")
	public WebElement btn_login;
	
	
	
	
	
	public void doClickOnMyAccount() {
		drp_down_myAccount.click();
	}
	
	public void doClickOnbtnLogin() {
		btn_login.click();
	}

	
	
	
}
