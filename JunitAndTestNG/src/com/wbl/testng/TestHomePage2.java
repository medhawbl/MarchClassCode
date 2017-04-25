package com.wbl.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.src.HomePage;

public class TestHomePage2 {
HomePage hp;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass(){
		hp = new HomePage();
	}
	
	@Test
	public void testDoLogin(){
		assertEquals("sucess", hp.doLogin());
	}
	
	@Test(dependsOnMethods = {"testDoLogin"}, alwaysRun=true)
	public void testPresentation(){
		assertEquals("presentations", hp.presentation());
	}
	
	@Test(dependsOnMethods = {"testDoLogin"})
	public void testRecordings(){
		assertEquals(20, hp.recordings());
	}
	
	@Test(dependsOnMethods = {"testDoLogin","testPresentation"})
	public void testLogout(){
		assertEquals("logout", hp.logout());
	}
}
