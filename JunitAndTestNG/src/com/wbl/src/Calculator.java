package com.wbl.src;

public class Calculator {
	
	public double calc(double a, double b, char ch){
		double result = 0.0;
		
		switch(ch){
		case '+': result = a+b; break;
		case '-': result = a-b; break;
		case '*': result = a*b; break;
		case '/': result = a/b; break;
		
		}
		return result;
	}
}
