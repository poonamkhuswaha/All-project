package actions;

import org.openqa.selenium.WebDriver;


import pages.Login;        // <-- Make sure this path is correct
import pages.Profile;
import utils.Config;
import utils.TestDataforlogin;

public class AccountActions2Login
{

    private WebDriver driver;
    private Login lg;
    private Profile p;

    public AccountActions2Login(WebDriver driver) {
        this.driver = driver;
        this.lg= new Login(driver);
    }

    // Overloaded constructor for Login actions  
    public AccountActions2Login(WebDriver driver, boolean isLogin)
    {
        this.driver = driver;
        this.lg = new Login(driver);
        this.p = new Profile(driver);
    }

    public void openPage() 
    {
        driver.get(Config.Base_URL1);
    }

    public void LoginPage() {

        lg.getEmail().sendKeys(TestDataforlogin.EMAIL);
        lg.getPass().sendKeys(TestDataforlogin.PASSWORD);
        lg.getSignInButton().click(); 
            
    }
    
    
    public void ProfileIcon()
    {

     p.getProfileIcon().click();  
            
    }


}
