package com.ap.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.ap.qa.base.TestBase;

public class productDetailsPage extends TestBase {
	
	
	@FindBy (id="quantity_wanted")
	WebElement quantityInput;
	
	@FindBy (css="[id='group_1']")
	WebElement sizeDropDown;
	
	@FindBy (xpath="//*[@id=\"add_to_cart\"]/button/span")
	WebElement addCartBotton;
	
	@FindBy (xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	WebElement proceedCheckout;
	
	@FindBy (xpath="//*[@id=\"wishlist_button\"]")
	WebElement addtoWishButton;
	
	@FindBy (xpath="//*[@id=\"product\"]/div[2]/div/div/div/div/p")
	WebElement addwishListMsg;
	
	@FindBy (xpath="//*[@id=\"product\"]/div[2]/div/div/a")
	WebElement addtowishcloseButton;
	
	
	
	public productDetailsPage() {
		PageFactory.initElements(driver, this);
		
	}

	public void verifyAddtoWishMsg() {
		Assert.assertEquals(addwishListMsg.getText(), "Added to your wishlist.");
		addtowishcloseButton.click();
	}
public productDetailsPage selectProductColor (String color) {
	String locator ="[name='"+color+ "']";
	driver.findElement(By.cssSelector(locator)).click();
	return this;
}
public productDetailsPage quantityInput (String quantity) {
	quantityInput.clear();
	quantityInput.sendKeys(quantity);
	return this;
}

public productDetailsPage selectSize(String size) {
	Select select = new Select (sizeDropDown);
	select.selectByVisibleText(size);
	return this;
}

public productDetailsPage ClickAddCart() {
addCartBotton.click();
return this;
}
public productDetailsPage ClickaddtoWishButton() {
addtoWishButton.click();
return this;
}
public OrderSummery proceedCheckOut() {
proceedCheckout.click();
return new OrderSummery();
}
}
