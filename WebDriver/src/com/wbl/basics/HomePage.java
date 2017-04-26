package com.wbl.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/WBL/MedhaMarchWorkspace/WebDriver/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Load the browser with required URL.
		driver.get("http://www.ebay.com/");
		System.out.println(driver.getTitle());
		
		//Identify the element to automate.
		//By by = By.linkText("register");
		WebElement element = driver.findElement(By.linkText("register"));
		//perform the action on the element
		element.click();
		//assert for actual and expected.
		System.out.println(driver.getTitle());
		

	}

}
