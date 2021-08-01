package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Test_Base;


public class Login_Page extends Test_Base
{
	// Step 1 - Global Variables -
	
	@FindBy(name = "identifier")
	WebElement email_Field;
	
	@FindBy(xpath = "//span[contains(text(), 'Next')]")
	WebElement next_Button;
	
	@FindBy(name = "password")
	WebElement password_Field;
	
	// Step 2 - Constructor -
	
	public Login_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Step 3 - Methods -
	
	public void Login_Page_Process(String email_in_method, String password_in_method)
	{
		email_Field.sendKeys(email_in_method);
		next_Button.click();
		password_Field.sendKeys(password_in_method);
		try
		{
			next_Button.click();
		}
		catch(Exception e)
		{
			System.out.println("clicking on next_Button in catch body");
			next_Button.click();
		}
	}
	
}
