package Brooooooo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//constructors
	WebDriver driver;
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Locators
	
	@FindBy (xpath ="//input[@placeholder='Username']")WebElement txt_Username;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']")WebElement btn_Login;
	
	//Action Methods 
		public void setUsername(String user)
		{
			txt_Username.sendKeys(user);	
		}
		public void password(String Password)
		{
			txt_password.sendKeys(Password);
		}
		public void ClickLogin()
		{
			 btn_Login.click();
		}
	


}
