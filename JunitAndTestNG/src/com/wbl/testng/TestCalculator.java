package com.wbl.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.src.Calculator;

public class TestCalculator extends BaseTest{

	@Test
	public void testCalc1(){
		System.out.println("In TestCal");
		Calculator cal = new Calculator();
		double result = cal.calc(4.0, 2.0, '+');
		Assert.assertEquals(result, 6.0);
		}
	
/*	@Test
	public void testCalc2(){
		Calculator cal = new Calculator();
		double result = cal.calc(4.0, 2.0, '-');
		Assert.assertEquals(result, 2.0);
		}
	
	@Test
	public void testCalc3(){
		Calculator cal = new Calculator();
		double result = cal.calc(4.0, 2.0, '*');
		Assert.assertEquals(result, 8.0);
		}
	
	@Test
	public void testCalc4(){
		Calculator cal = new Calculator();
		double result = cal.calc(4.0, 2.0, '/');
		Assert.assertEquals(result, 2.0);
		}*/
	
	}
	

