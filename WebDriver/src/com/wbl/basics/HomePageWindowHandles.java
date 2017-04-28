package com.wbl.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.wbl.util.WebDriverUtil;

public class HomePageWindowHandles {

	WebDriver driver;
	SoftAssert sassert;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// Load the browser with required URL.
		driver.navigate().to("http://whiteboxqa.com/");
		System.out.println("Home Page:" + driver.getTitle());
		sassert = new SoftAssert();
	}

	@Test
	public void studentLogin() {
		driver.findElement(By.id("headerfblogin")).click();
		String parentWindow = driver.getWindowHandle();

		//calling util method for handling windows
		WebDriverUtil.windowHandles(driver);

		System.out.println("child:" + driver.getTitle());
		// we are trying to access child window
		driver.findElement(By.id("email")).sendKeys("a@a.com");
		driver.findElement(By.id("pass")).sendKeys("test123");

		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);

		String actual = driver.findElement(By.cssSelector(".fsl.fwb.fcb")).getText();
		System.out.println("error msg:" + actual);
		assertEquals(actual, "Please re-enter your password");

		driver.switchTo().window(parentWindow);
		System.out.println("parent:" + driver.getTitle());
	}

	@AfterClass
	public void afterMethod() {
		// driver.close();
		driver.quit();
	}

}
