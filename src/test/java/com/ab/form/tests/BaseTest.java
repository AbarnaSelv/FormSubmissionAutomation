package com.ab.form.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    }
		
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else {
			throw new IllegalArgumentException("Browser Not Supported" + browser);
		}
		
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	}
	
	
	  @AfterTest
	  public void tearDown() {
		  if(driver != null) { 
			  driver.quit(); 
			  }
		  }
	 

}
