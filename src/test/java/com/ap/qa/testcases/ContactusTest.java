package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.base.TestBase;
import com.ap.qa.pages.ContactusPage;
import com.ap.qa.pages.HomePage;

public class ContactusTest extends TestBase {
	
	
	
	
	HomePage homepage;
	ContactusPage contactuspage;
	
	
	public ContactusTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
	
	initialization();
	contactuspage = new ContactusPage();
	homepage = new HomePage();
	
	}
	@Test
	public void testContact() {
		homepage.ClickOnContactlink();
		contactuspage= contactuspage.fillContactForm("customer service", "nahim.mobarak@yahoo.com", " ref#12345", "received a wrong order");
		String successMsg= contactuspage.getMessage();
		Assert.assertEquals(successMsg, "your message has been seccesfully sent to the team");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
