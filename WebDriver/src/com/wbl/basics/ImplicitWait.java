package com.wbl.basics;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class ImplicitWait {

	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(enabled = false)
	public void implicitWaitExample(){
		driver.get("https://www.walmart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("global-search-input")).sendKeys("Watches");
		driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
		System.out.println("Tittle before selecting : " +driver.getTitle());
		System.out.println("Tittle before selecting : " +driver.getCurrentUrl());
		driver.findElement(By.cssSelector(".chooser-option-current")).click();
		List<WebElement> elements = driver.findElements(By.cssSelector(".chooser-option"));
		System.out.println("Text from dropdown : " + elements.get(2).getText());
		elements.get(2).click();		
		System.out.println("Tittle after selecting : " + driver.getCurrentUrl());
	}
	
	@Test(enabled= false)
	public void explicitlyWaitExample(){
		driver.get("https://www.walmart.com/");
		driver.findElement(By.id("global-search-input")).sendKeys("Watches");
		WebDriverWait wait = new WebDriverWait(driver,30);
		String result = wait.until(function);
		System.out.println(result);
		Assert.assertEquals(result, "https://www.walmart.com/search/?query=watches%20for%20women&typeahead=watches");
		/*wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".header-Typeahead-row")));
		List<WebElement> elements = driver.findElements(By.cssSelector(".header-Typeahead-row"));
		//List<WebElement> elements = driver.findElements(By.cssSelector(".header-Typeahead-row"));
		System.out.println(elements.size());
		for(WebElement ele : elements){
			if(ele.getText().equalsIgnoreCase("watches for women")){
				ele.click();
				break;
			}
		}*/
		
	}
	
	Function<WebDriver, String> function = new Function<WebDriver, String>(){

		@Override
		public String apply(WebDriver arg0) {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".header-Typeahead-row")));
			List<WebElement> elements = driver.findElements(By.cssSelector(".header-Typeahead-row"));
			//List<WebElement> elements = driver.findElements(By.cssSelector(".header-Typeahead-row"));
			System.out.println(elements.size());
			for(WebElement ele : elements){
				if(ele.getText().equalsIgnoreCase("watches for women")){
					ele.click();
					break;
				}
			}
			return driver.getCurrentUrl();
		}

	};
	
	Predicate<WebDriver> predicate = new Predicate<WebDriver>(){

		@Override
		public boolean apply(WebDriver arg0) {
			// TODO Auto-generated method stub
			return false;
		}		
	};
	
	@Test
	public void fluentWaitExample(){
		driver.get("https://www.walmart.com/");
		driver.findElement(By.id("global-search-input")).sendKeys("Watches");
		FluentWait<WebDriver> fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(3, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".header-Typeahead-row")));
		List<WebElement> elements = driver.findElements(By.cssSelector(".header-Typeahead-row"));
		System.out.println(elements.size());
		for(WebElement ele : elements){
			if(ele.getText().equalsIgnoreCase("watches for women")){
				ele.click();
				break;
			}
		}
		
	}
	
	
	@AfterClass
	public void afterClass() throws InterruptedException {
		// driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
