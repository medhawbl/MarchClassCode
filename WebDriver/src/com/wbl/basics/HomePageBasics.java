package com.wbl.basics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageBasics {
	
	WebDriver driver;
	SoftAssert sassert;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		//Load the browser with required URL.
		driver.navigate().to("http://www.ebay.com/");
		System.out.println("Home Page:"+driver.getTitle());
		sassert=new SoftAssert();
	}

	@Test(enabled=false,priority=0)
	public void testRegister(){		
		//Identify the element to automate.
		//By by = By.linkText("register");
		WebElement element = driver.findElement(By.linkText("register"));
		//perform the action on the element
		element.click();
		//assert for actual and expected.
		System.out.println("Register Page:"+driver.getTitle());	
		assertEquals(driver.getTitle(), "Sign in or Register | eBay");
		driver.navigate().back();
		
		System.out.println("Back to Home Page:"+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("forward to register Page:"+driver.getTitle());
		
		driver.navigate().refresh();
	}
	
	@Test(priority=1)
	public void searchBox(){
	  WebElement element = driver.findElement(By.id("gh-ac"));
	  element.sendKeys("Laptop");
	  //or
	 //driver.findElement(By.id("gh-ac")).sendKeys("Laptop");
	  driver.findElement(By.cssSelector("#gh-btn")).click();
	  
	  //wait for 40 seconds - if element  is  not found
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  //  System.out.println("current url:" + driver.getCurrentUrl());
	 // System.out.println("current page source:" + driver.getPageSource());
	  try{
	  
	  //verifying that locator is correct which we are going to use in findelements
	  driver.findElement(By.cssSelector(".vip"));
	  
	  List<WebElement> searchResults = driver.findElements(By.cssSelector(".vip"));
	 
	  if(searchResults.size()==0){
		  String result =driver.findElement(By.cssSelector(".rsHdr")).getText();
		  System.out.println(result);
		  if(result.contains("0 results")){
			  System.out.println("Invalid search..please modify the search");
		  }else{
			  System.out.println("Please give a valid locator");
		  }
	  }
	  
	  System.out.println("results count:"+ searchResults.size());
	  //testing for broken links and title verification
	  for(WebElement elm: searchResults){
		  String hrefurl = elm.getAttribute("href");
		  String title = elm.getText();
		  System.out.println("title for search results:"+title+":href link:"+hrefurl);
		  assertNotNull(hrefurl);
		  sassert.assertTrue(title.contains("Laptop"),"Search result do not have Laptop in title");
	  }
	  
	  driver.navigate().back();
	  }catch(NoSuchElementException e){
		  System.out.println("locator is invalid");
		  throw e;
	  }
	}
	
	@AfterClass
	public void afterMethod(){
		driver.close();
	}

}
