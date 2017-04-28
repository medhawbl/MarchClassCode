package com.wbl.util;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverUtil {

	public static void windowHandles(WebDriver driver) {
		// return the current window name - where the control of webdriver is
		// presently
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent:" + driver.getTitle());
		Set<String> windowNames = driver.getWindowHandles();

		// switch control from parent window to child window
		for (String name : windowNames) {
			System.out.println("name of the windows:" + name);
			// trying to identify child window and swicth to child window
			if (!name.equals(parentWindow)) {
				driver.switchTo().window(name);
				break;
			}
		}
	}
}
