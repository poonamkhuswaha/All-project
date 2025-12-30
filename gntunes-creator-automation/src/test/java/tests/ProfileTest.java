package tests;

import org.testng.annotations.Test;

import actions.AccountActions2Login;

public class ProfileTest extends BaseTest {

	    @Test
	    public void testProfile() {

	        AccountActions2Login ac1 = new AccountActions2Login(driver);

	        ac1.openPage();
	        ac1.LoginPage();
	        ac1.ProfileIcon();
	    }
	
}
