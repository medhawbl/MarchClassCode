package com.wbl.basics;

public class HREmployee extends Employee{
	
	public void test(){
		System.out.println(name);
	}
	
	//method overriding- final method cannot be overridden 
	public void displayDetails(){
		System.out.println("child class logic");
	}
	
}
