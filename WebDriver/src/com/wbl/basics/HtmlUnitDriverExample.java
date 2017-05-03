package com.wbl.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HtmlUnitDriverExample {

	WebDriver driver;
	@Test
	public void htmlunit(){
		driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}
	
}
