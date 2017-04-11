package com.wbl.oops;

public class SportsCar extends Car{
	
	public SportsCar(int regNo){
		//if in parent class - there is only parameterised constructor child class constructor's
		//first statement should be super(parameters reqd for parent)
		super(regNo);
		System.out.println("child class constructor");
		
	}
	
	@Override
	protected void tyres(){
		System.out.println("SportsCar - thin model");
	}
	

	@Override
	public void speed(){
		System.out.println("SportsCar- High speed");
	}

	public void test(){
		//super is used in child class to spefically get parent class methods or variables
		//which are present in both parent and child classes
		super.speed();
	}
	
	

}
