package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.qa.base.TestBase;

public class OrderSummery  extends TestBase{
	
	@FindBy(css= "[class='btn btn-default button button-medium'][title='Proceed to checkout']")
	WebElement proceedCheckoutButton;
	
	@FindBy (css="[name='processAddress']")
	WebElement processAddressButton;
	
	@FindBy (css="[id='cgv']")
	WebElement termsAndConditioncheckBox;
	
	@FindBy (css="[name='processCarrier']")
	WebElement processCarrierButton;
	
	@FindBy (css= "[class='bankwire'][title='Pay by bank wire']")
	WebElement PayByBankwire;
	
	@FindBy (css="[class='button btn btn-default button-medium'][type='submit']")
	WebElement confirmOrder;
	
	@FindBy(xpath= "//strong[text()='Your order on My Store is complete.']")
	WebElement OrderConfirm;
	
	public OrderSummery() {
	PageFactory.initElements(driver, this);
	}
	public OrderSummery proceedCheckout() {
		proceedCheckoutButton.click();
		return this;
	}
	public OrderSummery processAddress() {
		processAddressButton.click();
		return this;
	}
	public OrderSummery proceedshipping() {
		termsAndConditioncheckBox.click();
		processCarrierButton.click();
		return this;
	
	}
	public OrderSummery confirmOrder() {
		PayByBankwire.click();
		confirmOrder.click();
		
		return this;
	}
	
	public String getConfirmMessage() {
		return OrderConfirm.getText();
	}
	
	}


