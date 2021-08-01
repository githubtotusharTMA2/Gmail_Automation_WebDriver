package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Test_Base;

public class Mail_Fetch extends Test_Base
{
	// Step 1 -
	
	@FindBy(xpath = "(//span[@class='bog'])[1]")
	WebElement mail;
	
	@FindBy(xpath = "//div[@class='ha']//descendant::h2")
	WebElement subject;
	
	@FindBy(xpath = "//div[@class = 'gs']//descendant::div[3]//div[1]//div[1]")
	WebElement mail_Body;
	
	// Step 2 - Constructor -
	
	public Mail_Fetch()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Step 3 - Methods -
	
	public void mail_Fetch_Process()
	{
		mail.click();
		System.out.println("subject = " + subject.getText());
		System.out.println("mail_body = " + mail_Body.getText());
	}
	
}
