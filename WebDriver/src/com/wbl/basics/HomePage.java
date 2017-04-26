package com.wbl.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//Load the browser with required URL.
		driver.navigate().to("http://www.ebay.com/");
		System.out.println("Home Page:"+driver.getTitle());
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
	  
	  //  System.out.println("current url:" + driver.getCurrentUrl());
	 // System.out.println("current page source:" + driver.getPageSource());
	  try{
	  driver.findElement(By.className("vi"));
	  
	  List<WebElement> searchResults = driver.findElements(By.className("vi"));
	 
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
