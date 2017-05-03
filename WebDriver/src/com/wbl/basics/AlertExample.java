package com.wbl.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AlertExample {

WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void simpleAlert(){
		driver.get("file:///C:/Users/WBL/MedhaMarchWorkspace/WebDriver/src/First.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("ibutton")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	
	//#closewelcomeRedirectPopupDialog
	@Test
	public void simpleAlert1(){
		driver.get("http://www.rightstart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#closewelcomeRedirectPopupDialog")).click();
		Alert al = driver.switchTo().alert();
		al.accept();
		//al.dismiss();
		
	}
}
