package com.wbl.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DesiredCapabilitiesExample {
//http://www.jabong.com/
	
WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		System.out.println("Before changing :: " + dc.getCapability("javascriptEnabled"));
		dc.setCapability("javascriptEnabled", false);
		System.out.println("After changing :: " + dc.getCapability("javascriptEnabled"));
		
		
		driver = new ChromeDriver(co);
	}
	
	@Test
	public void desiredCapabilitiesExample(){
		driver.get("http://www.jabong.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mainElement = driver.findElement(By.linkText("SPORTS"));
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).perform();
		WebElement subElement = driver.findElement(By.linkText("Boy Tees"));
		action.moveToElement(subElement).click().build().perform();
	}
}
