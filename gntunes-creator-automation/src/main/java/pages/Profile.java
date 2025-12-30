package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	
	WebDriver driver;
	
	public Profile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//button[.//img[contains(@src,'firebasestorage.googleapis.com')]]")
	private WebElement profileIcon;


	public WebElement getProfileIcon() 
	{
		return profileIcon;
	
		
	}		
	
}
