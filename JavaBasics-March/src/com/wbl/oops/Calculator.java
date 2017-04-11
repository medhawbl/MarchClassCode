package com.wbl.oops;

public class Calculator {
	
	public int add(int a, int b){
		System.out.println("int sum");
		return a+b;
	}
	
	public int add(int a, int b, int c){
		System.out.println("int sum 3 vars");
		return a+b;
	}
	
	protected void add(float a, float b){
		System.out.println("float sum");
		System.out.println(a+b);
	}
	
	public int add(int a, int b, float c){
		System.out.println("int  and float sum");
		return a+b;
	}

}
