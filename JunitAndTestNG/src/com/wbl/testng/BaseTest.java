package com.wbl.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

		@BeforeSuite
		public void beforeSuite(){
			System.out.println("It Executes Before suite");
		}
		@AfterSuite
		public void afterSuite(){
			System.out.println("It Executes After suite");
		}
		
		@BeforeTest
		public void beforeTest(){
			System.out.println("It Executes Before test");
		}
		@AfterTest
		public void afterTest(){
			System.out.println("It Executes After test");
		
	}
	
}
