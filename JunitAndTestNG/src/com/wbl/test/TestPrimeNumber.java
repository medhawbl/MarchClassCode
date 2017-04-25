package com.wbl.test;

import com.wbl.src.PrimeNumber;

import junit.framework.TestCase;

public class TestPrimeNumber extends TestCase{

	public void setUp(){
		System.out.println("This will excecute before all the methds");
	}
	
	public void tearDown(){
		System.out.println("This will excecute after all the methds");		
	}
	
	public void testIsPrime(){
		PrimeNumber pn = new PrimeNumber();
		boolean result = pn.isPrime(5);
		assertEquals(true, result);
	}
	
	public void testIsPrime1(){
		PrimeNumber pn = new PrimeNumber();
		boolean result = pn.isPrime(1);
		assertEquals(false, result);
	}
	public void testIsPrime2(){
		PrimeNumber pn = new PrimeNumber();
		boolean result = pn.isPrime(0);
		assertEquals(false, result);
	}
	public void testIsPrime3(){
		PrimeNumber pn = new PrimeNumber();
		boolean result = pn.isPrime(10);
		assertEquals(false, result);
	}
	
}
