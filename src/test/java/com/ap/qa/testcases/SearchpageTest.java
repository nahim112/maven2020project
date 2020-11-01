package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.qa.base.TestBase;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.SearchPage;

public class SearchpageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;
	SearchPage searchpage;
	
	public SearchpageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage= new LoginPage();
		homepage= new HomePage();
		searchpage= new SearchPage();
	}

public void testSearchItem(){  
  String product = "Evening";
  homepage.ClickOnsignin();
  homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password")); 
  //Special, Casual, Evening, Summer
  searchpage = homepage.srarchProduct("Evening");
  String header = searchpage.getHeader();
  System.out.println(header);
  Assert.assertTrue(header.toLowerCase().contains(product.toLowerCase()));
  homepage.ClickOnLogOut();  
 }
 @AfterMethod
 public void tearDown(){
  driver.quit();
 }
 

}
