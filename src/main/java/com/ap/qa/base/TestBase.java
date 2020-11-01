package com.ap.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.ap.qa.util.TestUtil;
import com.ap.qa.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public TestBase() {
	try {
	prop= new Properties();
	FileInputStream ip=  new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ap\\qa\\config\\config.properties");
	prop.load(ip);	
	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}catch(IOException e) {
	e.printStackTrace();
	}}
	public static void initialization(){
	String browserName = prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("chrome")) {
	System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("FF")) {
	System.setProperty("Webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\geckodriver.exe"); 
	driver= new FirefoxDriver();
	}
	e_driver = new EventFiringWebDriver(driver);
	eventListener= new WebEventListener();
	driver= e_driver;
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("appurl"));
	}
	}
	
