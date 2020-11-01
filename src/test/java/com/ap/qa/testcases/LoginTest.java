package com.ap.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.base.TestBase;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;



public class LoginTest  extends TestBase{
	
LoginPage LoginPage;
HomePage Homepage;
	
public LoginTest() {
super();
}
@BeforeMethod
public void setUp() {
initialization();
LoginPage= new LoginPage();
Homepage= new HomePage();
}
	
@Test
public void loginTest() {
	
Homepage.ClickOnsignin();
Homepage= LoginPage.login(prop.getProperty("username"),prop.getProperty("password"));
Homepage.ClickOnLogOut();
}
@AfterMethod
public void tearDown() {
driver.quit();
}
	

	
}


