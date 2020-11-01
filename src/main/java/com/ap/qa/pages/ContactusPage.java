package com.ap.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ap.qa.base.TestBase;

public class ContactusPage extends TestBase {

 @FindBy(xpath="//select[@id='id_contact']")
 WebElement headingDropdown;
 
 @FindBy(xpath="//input[@id='email']")
 WebElement emailInput;
 
 //order reference
 @FindBy(xpath = "//input[@id='id_order']")
 WebElement OrderReference;
 
 @FindBy(xpath = "//textarea[@id='message']")
 WebElement messageTextBox;
 
 @FindBy(xpath = "//button[@id='submitMessage']")
 WebElement SubmitMessageButton;
 
 @FindBy(css= "#center_column > p")
 WebElement success;


public ContactusPage() {
 PageFactory.initElements(driver, this);
 }

 public ContactusPage fillContactForm(String heading, String email, String reference, String message) {
  Select select = new Select(headingDropdown);
  select.selectByVisibleText(heading);
 
  emailInput.sendKeys(email);
  OrderReference.sendKeys(reference);
  messageTextBox.sendKeys(message);
  return this;
  
}
 public void submitMessage() {
  SubmitMessageButton.click();
}
 public String getMessage() {
  return success.getText();
 }
 }