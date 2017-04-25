package com.wbl.testng;

import org.junit.Test;

public class BasicTest {

	/*@Test(invocationCount = 20, invocationTimeOut = 200 )
	public void test() throws InterruptedException{
		Thread.sleep(300);
		System.out.println("Hello World..");
	}*/
	@Test
	public void test(){
		System.out.println("Junit Method");
	}
}
