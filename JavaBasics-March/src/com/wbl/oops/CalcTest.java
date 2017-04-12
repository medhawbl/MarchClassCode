package com.wbl.oops;

public class CalcTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		float a=10f;
		float b=11f;
		
		//At compile time-Java knows which method to be called based on no of arguments or
		//data type of arguments - virtual method invocation- static polymorphism
		calc.add(5f, 6f);

		calc.add(a, b);

		calc.add(5, 6);

	}

}
