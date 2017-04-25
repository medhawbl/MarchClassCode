package com.wbl.testng;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.src.HomePage;

public class TestHomePage {
	HomePage hp;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClass(){
		hp = new HomePage();
	}
	
	@Test(groups = {"smoketest"})
	public void testDoLogin(){
		assertEquals("success", hp.doLogin());
	}
	
	@Test(groups = {"smoketest"})
	public void testPresentation(){
		assertEquals("presentations", hp.presentation());
	}
	
	@Test(groups = {"smoketest", "functionalitytest"})
	public void testRecordings(){
		assertEquals(20, hp.recordings());
	}
	
	@Test(groups = {"functionalitytest"}, dependsOnGroups={"smoketest"})
	public void testLogout(){
		assertEquals("logout", hp.logout());
	}
	

}
