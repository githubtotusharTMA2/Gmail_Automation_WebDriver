package test_cases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Test_Base;
import pages.Login_Page;

public class Login_Page_Test extends Test_Base
{

	// Step 1 - Global Variables -
	
	Login_Page login_Page;
	
	// Step 2 - Constructor -
	
	public Login_Page_Test()
	{
		super();
	}
	
	// Step 3 - BeforeMethod -
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		login_Page = new Login_Page();
	}
	
	// Step 4 - Tests -
	
	@Test
	public void login_Page_Test()
	{
		login_Page.Login_Page_Process("tma2tushar@gmail.com", "Maa@1world@2");
		Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(text(), 'Primary')])[1]")).isDisplayed());
	}
	
	// Step 5 - AfterMethod -
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	
}
