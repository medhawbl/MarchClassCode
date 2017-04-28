package com.wbl.basics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.wbl.util.WebDriverUtil;

public class SelectAndRadioAndWebElementMethods {

	WebDriver driver;
	SoftAssert sassert;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		// Load the browser with required URL.
		driver.get("https://www.google.com/gmail/about/");
		System.out.println("Home Page:" + driver.getTitle());
		// wait for 30 seconds - if element is not found
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximising browser window
		driver.manage().window().maximize();
		sassert = new SoftAssert();
	}

	/**
	 * @throws InterruptedException
	 * 
	 */
	@Test(priority = 1)
	public void selectExample() throws InterruptedException {

		// select example
		WebElement element = driver.findElement(By.id("lang-chooser"));
		Select select = new Select(element);
		// displaying all options inside drop down and asserting
		List<WebElement> options = select.getOptions();
		assertEquals(options.size(), 70);
		for (WebElement elm : options) {
			System.out.println(elm.getText());
			assertNotNull(elm.getText());
		}
		// default option in dropdown is ‪English (United States)‬
				String defaultSelectedValue = select.getFirstSelectedOption().getText();
				System.out.println("default vaue:"+ defaultSelectedValue);
				assertTrue(defaultSelectedValue.contains("English (United States)"));
				
				
		// select.selectByVisibleText("‪English (United Kingdom)");
		// or
		select.selectByValue("en-GB");

		// or
		// select.selectByIndex(1);

		

		System.out.println("is multi select drop down :" + select.isMultiple());

		
		Thread.sleep(5000);

	}

	@Test(enabled = true, priority = 0)
	public void registerExampleWithWebElementMethods() throws InterruptedException {
		// webelement findelement method example
		WebElement element = driver.findElement(By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__create-account"));
		
		System.out.println("is enabled:" + element.isEnabled());
		assertTrue(element.isEnabled());

		element.click();
		WebDriverUtil.windowHandles(driver);

		// webelement findelements method example
		element = driver.findElement(By.id("footer-list"));
		List<WebElement> elms = element.findElements(By.tagName("a"));
		System.out.println("count of footer links:" + elms.size());
		assertEquals(elms.size(), 2);

		element = driver.findElement(By.id("link-signin"));
		System.out.println("css selector value font size ::" + element.getCssValue("font-size"));
		System.out.println("css selector value color::" + element.getCssValue("color"));

		element = driver.findElement(By.cssSelector(".logo.logo-w"));
		Dimension dim = element.getSize();
		System.out.println("size of webelement: height :" + dim.height + ":width:" + dim.width);

		boolean actual = driver.findElement(By.cssSelector(".logo-strip")).isDisplayed();
		System.out.println("is displayed:" + actual);
		assertTrue(actual);

		element = driver.findElement(By.id("firstname-label"));
		element.findElement(By.id("FirstName")).sendKeys("Medha");

		driver.findElement(By.id("LastName")).sendKeys("K");
		driver.findElement(By.id("GmailAddress")).sendKeys("Medha_wbl12@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("Medha123");
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("PasswdAgain")).sendKeys("Medha123");

		driver.findElement(By.cssSelector("#BirthMonth>div")).click();
		List<WebElement> elems = driver.findElements(By.cssSelector("#BirthMonth .goog-menuitem-content"));
		elems.get(1).click();

		driver.findElement(By.cssSelector("#Gender")).click();
		elems = driver.findElements(By.cssSelector("#gender-label .goog-menuitem-content"));
		elems.get(0).click();

		Thread.sleep(5000);
		driver.findElement(By.id("submitbutton")).click();
		System.out.println(driver.getTitle());
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		// driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
