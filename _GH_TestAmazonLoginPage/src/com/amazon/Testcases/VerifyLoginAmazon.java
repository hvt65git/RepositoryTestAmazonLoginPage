package com.amazon.Testcases;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.TestUtils;

import com.amazon.Pages.AmazonLoginTest;
import com.amazon.Pages.BrowserFactory;
import com.amazon.Pages.BrowserType;

/***
 * 				
 * @author verifyValidLogin - Testng main file
 * 							  Logs into amazon.com with user name and password
 * 							  that are specified in the user.properties file
 *
 */
public class VerifyLoginAmazon{
	private WebDriver driver;

	@BeforeMethod
	public void initDriver(){
		try{
			//launch browser and specific URL
			driver = BrowserFactory.startBrowser(BrowserType.CHROME, "https://amazon.com", 3);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			Assert.assertTrue(false);
		}
	}

	@AfterMethod
	public void cleanup(){
		if(driver!=null){
			driver.quit();
		};
	}

	@Test
	public void test(){
		new AmazonLoginTest().verifyValidLogin(driver);;
	}
}

//OUTPUT:
//[TestNG] Running:
//	  C:\Users\focalpt\AppData\Local\Temp\testng-eclipse--933556525\testng-customsuite.xml
//
//	BrowserType enum private constructor executed...
//	BrowserType enum private constructor executed...
//	BrowserType enum private constructor executed...
//	BrowserType enum private constructor executed...
//	Starting ChromeDriver 2.25.426923 (0390b88869384d6eb0d5d09729679f934aab9eed) on port 47871
//	Only local connections are allowed.
//	Current window handle = CDwindow-12a88993-a963-4bb9-8b8f-2bd84639125c
//	iterated window handle = CDwindow-12a88993-a963-4bb9-8b8f-2bd84639125c
//	*** login_amazon - ExpectedConditions.visibilityOf... success!
//	PASSED: test
//
//	===============================================
//	    Default test
//	    Tests run: 1, Failures: 0, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 1, Failures: 0, Skips: 0
//	===============================================
//
//	[TestNG] Time taken by org.testng.reporters.JUnitReportReporter@9e89d68: 22 ms
//	[TestNG] Time taken by [FailedReporter passed=0 failed=0 skipped=0]: 0 ms
//	[TestNG] Time taken by org.testng.reporters.SuiteHTMLReporter@73a28541: 107 ms
//	[TestNG] Time taken by org.testng.reporters.XMLReporter@48cf768c: 10 ms
//	[TestNG] Time taken by org.testng.reporters.EmailableReporter2@512ddf17: 5 ms
//	[TestNG] Time taken by org.testng.reporters.jq.Main@782830e: 128 ms
