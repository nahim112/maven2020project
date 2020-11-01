package com.ap.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ap.datamodel.ProductData;
import com.ap.qa.base.TestBase;
import com.ap.qa.dataprovider.DataProviders;
import com.ap.qa.pages.HomePage;
import com.ap.qa.pages.LoginPage;
import com.ap.qa.pages.OrderSummery;
import com.ap.qa.pages.SearchPage;
import com.ap.qa.pages.productDetailsPage;


public class CheckOutProductTest extends TestBase{

HomePage homePage;
LoginPage loginPage;
productDetailsPage productDetails;
OrderSummery orderSummary;
SearchPage searchPage;

public CheckOutProductTest() {
super();
}
@BeforeMethod
public void setUp() {
initialization();

homePage= new HomePage();
loginPage = new LoginPage();
productDetails = new productDetailsPage();
orderSummary= new OrderSummery();

}

@Test(dataProvider="ProductData", dataProviderClass=DataProviders.class)
public void testCheckoutProcess(ProductData data) {
String product = data.GetProductName();
homePage.ClickOnsignin();
homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
searchPage = homePage.srarchProduct(product);
String header = searchPage.getHeader();
System.out.println(header);
Assert.assertTrue(header.toLowerCase().contains(product.toLowerCase()));
productDetails = searchPage.selectProduct(product);

productDetails.quantityInput(data.Getquantity());
productDetails.selectProductColor(data.GetColor());
productDetails.selectSize(data.Getsize());
productDetails.ClickAddCart();
orderSummary = productDetails.proceedCheckOut();

orderSummary.proceedCheckout();
orderSummary.proceedCheckout();
orderSummary.proceedshipping();
orderSummary.confirmOrder();

String message = orderSummary.getConfirmMessage();
Assert.assertEquals("Your order on My Store is complete.", message);
homePage.ClickOnLogOut();

}

@AfterMethod
public void tearDown() {
driver.quit();
}


}

