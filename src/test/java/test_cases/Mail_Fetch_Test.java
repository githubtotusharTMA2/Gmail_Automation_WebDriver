package test_cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Test_Base;
import pages.Login_Page;
import pages.Mail_Fetch;

public class Mail_Fetch_Test extends Test_Base
{
	// Step 1 - Global Variables -

	Login_Page lp;
	Mail_Fetch mf;
	
	// Step 2 - constructor -
	
	public Mail_Fetch_Test()
	{
		super();
	}
	
	// Step 3 - BeforeMethod -
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		lp = new Login_Page();
		mf = new Mail_Fetch();
	}
	
	// Step 4 - Tests -
	
	@Test
	public void mail_Fetch_Test()
	{
		lp.Login_Page_Process(prop.getProperty("username"), prop.getProperty("password"));
		mf.mail_Fetch_Process();
	}
	
	// Step 5 - AfterMethod -
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
