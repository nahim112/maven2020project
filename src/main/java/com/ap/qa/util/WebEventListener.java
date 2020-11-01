package com.ap.qa.util;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.ap.qa.base.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener {
public void beforeNavigateTo(String url, WebDriver driver) {
System.out.println("Before navageting to: "+ url+"'");
}
public void afterNavegatingTo(String url, WebDriver driver) {
System.out.println("After navegating to url:"+ url+"'");
}
public void beforeChangeValueof(WebElement element, WebDriver driver) {
System.out.println("Before Element value change: "+ element.toString());
}
public void afterChangeValueof(WebElement element, WebDriver driver) {
System.out.println("after Element value change: "+ element.toString());
}
public void beforeClickon(WebElement element, WebDriver driver) {
System.out.println("Before clcik on element: "+ element.toString());
}
public void afterClickon(WebElement element, WebDriver driver) {
System.out.println("After clcik on element: "+ element.toString());
}
public void beforeNavigateBack(WebDriver driver) {
System.out.println("Navagating back to pages page");
}
public void afterNavigateBack(WebDriver driver) {
System.out.println("Navagating forward to pages page");
}
public void beforeNavigateforward(WebDriver driver) {
System.out.println("Navagating forward to pages page");
}
public void afterNavigateforward(WebDriver driver) {
System.out.println("Navagating forward to prevoiuspage");
}

public void onException(Throwable error, WebDriver driver) {
System.out.println("Exception Occured: "+ error);
try {
	TestUtil.takeScreenShotAtEndofTest();
} catch (IOException e) {
	e.printStackTrace();
}
	
}
public void beforeFindby( By by, WebElement element, WebDriver driver) {
	System.out.println("Trying to by Element by: "+ by.toString());
}
public void afterFindby( By by, WebElement element, WebDriver driver) {
	System.out.println("found Element by: "+ by.toString());
}
public void beforeScript(String script, WebDriver driver) {
	
}
public void afterAlertAccept(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void afterAlertDismiss(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
	// TODO Auto-generated method stub
	
}
public void afterClickOn(WebElement arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	// TODO Auto-generated method stub
	
}
public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
	// TODO Auto-generated method stub
	
}
public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
	// TODO Auto-generated method stub
	
}
public void afterNavigateForward(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void afterNavigateRefresh(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void afterNavigateTo(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
public void afterScript(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
public void afterSwitchToWindow(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
public void beforeAlertAccept(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void beforeAlertDismiss(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
	// TODO Auto-generated method stub
	
}
public void beforeClickOn(WebElement arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
	// TODO Auto-generated method stub
	
}
public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
	// TODO Auto-generated method stub
	
}
public void beforeGetText(WebElement arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
public void beforeNavigateForward(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void beforeNavigateRefresh(WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
}
