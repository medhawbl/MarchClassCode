package com.wbl.basics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CookiesExample {
	
WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void cookiesExample() throws InterruptedException{
		driver.get("http://www.ebay.com/");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie cook : cookies ){
			System.out.println("Cookies :: " + cook.getName());
		}
		System.out.println("Number of Cookies downloaded : " + cookies.size());
		
		driver.manage().addCookie(new Cookie("test", "cookieTest"));
		cookies = driver.manage().getCookies();
		for(Cookie cook : cookies ){
			System.out.println("Cookies :: " + cook.getName());
		}
		System.out.println("Number of Cookies after adding : " + cookies.size());
		
		//driver.manage().deleteCookieNamed("test");
	}

}
