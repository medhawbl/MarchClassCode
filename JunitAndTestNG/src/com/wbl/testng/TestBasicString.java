package com.wbl.testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.xml.XmlSuite;

import com.wbl.src.BasicString;

public class TestBasicString implements IReporter{

	BasicString bs;

	@Test(priority = 1)
	public void test() {
		bs = new BasicString();
		System.out.println(bs.stringBasic("Hello"));
	}
	
	
	@Test(priority = 0)
	@Parameters({"input","input1"})
	public void test2(String inputString,String inputString1) throws InterruptedException{
		Thread.sleep(300);
		System.out.println("Hello World..");
		System.out.println("Data from TestNG.XML :: " + inputString);
		System.out.println("Data from TestNG.XML :: " + inputString1);
		assertEquals("Hello World",inputString);
		assertEquals("How are You",inputString1);
		System.out.println("Lines Before assert fails");
		SoftAssert sa = new SoftAssert();
		assertTrue(5>10);
		System.out.println("Lines After assert fails");
		assertNull(null);
		assertNotNull("Hello");
		assertFalse(5>10);
		
	}


	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

		
	}


	/*@Test(expectedExceptions = {NullPointerException.class})
	public void test() {
		bs = new BasicString();
		System.out.println(bs.stringBasic(null));
	}
	@Test(enabled = true)
	public void test() {
		bs = new BasicString();
		System.out.println(bs.stringBasic("Hello"));*/
	}

