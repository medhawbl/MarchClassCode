package com.wbl.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.src.Calculator;

public class TestCalculator2 extends BaseTest{

	@DataProvider(name ="testData")
	public Object[][] getData(){
		Object[][] data = {{4.0,2.0,'+',6.0},{4.0,2.0,'-',2.0},{4.0,2.0,'*',8.0},{4.0,2.0,'/',2.0}};
		return data;
	}
	
	@Test(dataProvider = "testData")
	public void testCalc1(double a, double b, char c, double expected){
		System.out.println("In TestCal2");
		Calculator cal = new Calculator();
		double result = cal.calc(a, b, c);
		Assert.assertEquals(result, expected);
		}
	
	/*@Test
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
