package com.wbl.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsExample {

WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(enabled=false)
	public void mouseHoverExample(){
		driver.get("http://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement mainLink = driver.findElement(By.linkText("Fashion"));
		Actions action = new Actions(driver);
		action.moveToElement(mainLink).perform();
		WebElement subLink = driver.findElement(By.linkText("Watches"));
		action.moveToElement(subLink).click().build().perform();
		System.out.println("Current URL on SubPage : " + driver.getCurrentUrl());
		System.out.println("Text on SubPage : " + driver.findElement(By.cssSelector("h1")).getText());
	}
	
	@Test
	public void dragndropbyExample(){
		driver.get("http://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		Actions a = new Actions(driver);
		driver.switchTo().frame(frame);
		WebElement src = driver.findElement(By.id("draggable"));
		a.dragAndDropBy(src, 800, 500).perform();		
	}
	
	@Test
	public void dragndropExample(){
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.className("demo-frame"));
		Actions a = new Actions(driver);
		driver.switchTo().frame(frame);
		WebElement src = driver.findElement(By.cssSelector("#draggable>p"));
		WebElement dstn = driver.findElement(By.cssSelector("#droppable"));
		a.dragAndDrop(src, dstn);	
	}
	
}
