package com.wbl.test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.wbl.src.PrimeNumber;

@RunWith(Parameterized.class)
public class TestPrimeNumberParameters {
	
	static PrimeNumber pn;
	int input;
	boolean expectedOutput;
	

	//it will be executed for each test methods/data
	public TestPrimeNumberParameters(int input, boolean expectedOutput){
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameterized.Parameters//it is executed once
	public static Collection dataForTest(){
		Object[][] testData = {{5,true},{1,false},{0,false},{10,false}};
		return Arrays.asList(testData);
	}
	 
		@BeforeClass
		public static void beforeClass(){
			pn = new PrimeNumber();
			System.out.println("This will excecuted once before all test methods");
		}
	
	@Test
	public void IsPrime(){
		boolean result = pn.isPrime(input);
		System.out.println(input);
		assertEquals(expectedOutput, result);
	}
	


}
