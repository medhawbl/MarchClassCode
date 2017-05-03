package com.wbl.basics;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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
		//driver.get("https://www.google.com/gmail/about/");
		//System.out.println("Home Page:" + driver.getTitle());
		// wait for 30 seconds - if element is not found
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// maximising browser window
		//driver.manage().window().maximize();
		//sassert = new SoftAssert();
	}

	/**
	 * @throws InterruptedException
	 * 
	 */
	@Test(enabled=false, priority = 1)
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

	@Test(enabled = false, priority = 0)
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
	
	@Test(enabled = false)
	public void radioButtonExample() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_1")).sendKeys("Innovapath");
		WebElement element = driver.findElement(By.id("month"));
		Select select = new Select(element);
		select.selectByVisibleText("Mar");
		
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByIndex(18);
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByValue("2000");
		
		WebElement element1 = driver.findElement(By.id("u_0_g"));
		element1.click();
		System.out.println("Element is selected : " +element1.isSelected());
		Thread.sleep(200);
		
	}
	
	@Test(enabled=false)
	public void multipleSelect() throws InterruptedException{
		driver.get("http://wenzhixin.net.cn/p/multiple-select/docs/");
		Select select = new Select(driver.findElement(By.xpath("//*[@id='e1_f']/select")));
		select.selectByVisibleText("March");
		Thread.sleep(200);
		select.selectByIndex(5);
		Thread.sleep(200);
		select.selectByValue("7");
		Thread.sleep(200);
		
		select.deselectByVisibleText("March");
		Thread.sleep(200);
		
	}
	
	@Test
	public void getLocationExample(){
		driver.get("http://whiteboxqa.com/");
		List<WebElement> elements = driver.findElements(By.cssSelector(".fa.fa-google-plus"));
		for(WebElement ele : elements){
			Point point =ele.getLocation();
			System.out.println("X : " + point.x);
			System.out.println("Y : " + point.y);
			if(point.x == 944 && point.y == 17){
				ele.click();
			}
			
			Dimension dimension = ele.getSize();
			System.out.println("X : " + dimension.height);
			System.out.println("Y : " + dimension.width);
			
		}
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		// driver.close();
		Thread.sleep(5000);
		driver.quit();
	}

}
