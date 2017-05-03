package com.wbl.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class javaScriptEx {

WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void javaScriptExecutorExample() throws InterruptedException{
		driver.get("http://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(200);
		WebElement element = driver.findElement(By.cssSelector(".heros-heading>h2"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
		Thread.sleep(400);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,800)");
		Thread.sleep(400);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-600)");*/
		//WebElement element = driver.findElement(By.cssSelector("#gh-btn"));
		WebElement ele = (WebElement)((JavascriptExecutor)driver).executeScript("return document.getElementById('gh-btn')");
		ele.click();
		((JavascriptExecutor)driver).executeScript("alert('Hello!!!')");
	}
	
}
