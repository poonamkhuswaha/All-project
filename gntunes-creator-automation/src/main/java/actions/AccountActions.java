package actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.SignUp;
import pages.Login;        // <-- Make sure this path is correct
import utils.Config;
import utils.TestData;
import utils.TestDataforlogin;

public class AccountActions
{

    private WebDriver driver;
    private SignUp sp;

    // Constructor for SignUp actions
    public AccountActions(WebDriver driver) {
        this.driver = driver;
       this.sp = new SignUp(driver);
    }

  
    public void openPage() 
    {
    	driver.get(Config.BASE_URL);
    }

    public void SignUpPage() {

        sp.getEmail().sendKeys(TestData.EMAIL);
        sp.getPw().sendKeys(TestData.PASSWORD);
        sp.getCPw().sendKeys(TestData.ConfirmPASSWORD);
        sp.getYourPrimaryRole().click();

        // Scroll into view and click signup
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sp.getSignupBtn());
        
        sp.getSignupBtn().click();
    }

  
}
