package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import pageClasses.AccountLogin;
import pageClasses.YourStore;

public class TC001_VerifyLogin extends BaseClass {
	

	
	@Test
	public void verifyLogin() {
	YourStore st = new YourStore(driver);
	st.doClickOnMyAccount();
	st.doClickOnbtnLogin();
	AccountLogin al=new AccountLogin(driver);
	al.doLogin2("demo30@gmail.com", "Bayview@2020");
	}
	
}
