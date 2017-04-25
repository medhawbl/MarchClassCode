package com.wbl.test;

import static junit.framework.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.wbl.src.PrimeNumber;

public class TestPrimeNumber1 {
	
	static PrimeNumber pn;
	
	@BeforeClass
	public static void beforeClass(){
		pn = new PrimeNumber();
		System.out.println("This will excecuted once before all test methods");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("This will excecutd once before all test methods");		
	}
	
	@Before
	public void before(){
		System.out.println("This will excecute before all the methds");
	}
	
	@After
	public void after(){
		System.out.println("This will excecute after all the methds");		
	}
	
	@Test
	public void IsPrime(){
		boolean result = pn.isPrime(5);
		assertEquals(true, result);
	}
	
	@Test
	public void IsPrime1(){
		boolean result = pn.isPrime(1);
		assertEquals(false, result);
	}
	
	@Test
	@Ignore
	public void IsPrime2(){
		boolean result = pn.isPrime(0);
		assertEquals(false, result);
	}
	
	@Test(timeout =200)
	public void IsPrime3(){
		boolean result = pn.isPrime(10);
		assertEquals(false, result);
	}
}
