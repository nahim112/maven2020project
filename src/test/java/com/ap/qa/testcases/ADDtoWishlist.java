package com.ap.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.ap.qa.base.TestBase;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.SearchPage;

public class ADDtoWishlist extends TestBase {
	
	
	LoginPage loginpage;
	HomePage homepage;
	SearchPage searchpage;
	
	public ADDtoWishlist() {
	super();
	}
	@BeforeMethod
	public void setUp() {
	initialization();
	loginpage= new LoginPage();
	homepage= new HomePage();
	searchpage= new SearchPage();
	}

	public void Additemtowishlist() {
	homepage.ClickOnsignin();
	homepage= homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	searchpage = homepage.srarchProduct("shiffron printed dress");
	}
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	}
}
