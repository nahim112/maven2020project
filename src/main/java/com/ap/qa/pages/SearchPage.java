package com.ap.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.base.TestBase;

public class SearchPage extends TestBase {
	
	
	@FindBy (xpath="//*[@id=\"add_to_cart\"]")
	WebElement addCartButton;
	
	@FindBy (xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement checkout;
	
	@FindBy (xpath="//*[@id=\"search_query_top\"]")
	WebElement searchHeading;
	
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public productDetailsPage selectProduct( String productName) {
		String locator = "[class='product-name'][title='"+ productName+"']";
		driver.findElement(By.cssSelector(locator)).click();
		return new productDetailsPage();
	}
public String getHeader() {
	return searchHeading.getText();
}

}
