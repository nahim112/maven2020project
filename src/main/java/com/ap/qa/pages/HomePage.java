package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
	WebElement signInButton;
	
	@FindBy (xpath="//*[@id=\"contact-link\"]/a")
	WebElement Contact_us;
	
	@FindBy (xpath= "//*[@id=\"search_query_top\"]")
	WebElement searchInputBox;
	
	@FindBy (xpath= "//*[@id=\"searchbox\"]/button")
	WebElement submitSearch;
	
	@FindBy (xpath= "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement logOutButton;
	
	public HomePage() {
	PageFactory.initElements(driver, this);
	}
	public SearchPage srarchProduct(String productName) {
	searchInputBox.sendKeys(productName);
	submitSearch.click();
	return new SearchPage();
	}
	public void ClickOnsignin() {
	signInButton.click();
	}
	public void ClickOnContactlink() {
	Contact_us.click();
	}
	public void ClickOnLogOut() {
	logOutButton.click();
	}
	}
