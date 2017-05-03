package com.wbl.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RobotExample {
	
WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void simpleRobotExample() throws InterruptedException, AWTException{
		driver.get("https://www.facebook.com/");//email
		driver.findElement(By.id("email")).sendKeys("test@123");
		driver.findElement(By.id("pass")).sendKeys("test@123");
				
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);		
	}
	
	@Test
	public void fileUploadExample() throws AWTException, InterruptedException, IOException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://my.indeed.com/resume?from=hp2&subfrom=rezprmstd&trk.origin=homepage&trk.variant=rezprmstd&trk.tk=1bf599v851e8j5bv&co=US&hl=en_US");
		driver.findElement(By.cssSelector(".splash-upload-btn.btn.sg-btn.sg-btn-primary.sg-btn-block>span")).click();
		//method2 - using AutoIT - only for windows
		Runtime.getRuntime().exec("C:/Users/WBL/Desktop/FileUploadAutoIT.exe");
		
		Thread.sleep(2000);
		//method1 - using robot class - for both windows n mac
		/*StringSelection selectpath = new StringSelection("file:///C:/Users/WBL/Desktop/CodingTestQuestions_UI.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectpath, null);
		
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(500);*/
		
	}

}
