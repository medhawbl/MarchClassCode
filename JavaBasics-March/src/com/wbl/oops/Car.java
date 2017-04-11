package com.wbl.oops;

public class Car {
	
	protected String model;
	protected String color;
	protected float price;
	
	/*public Car(){
		//calling parmeterised constructor from default constructor by using this
		this(5678);
		System.out.println("parent class constructor");
		
	}*/
	
	public Car(int regNo){
		System.out.println("parent class constructor"+ regNo);
	}
	
	
	
	public void driveIt(){
		System.out.println("Car - driving....");
	}
	
	public float calculateTotalPrice(int discount){
		float result = price-((price*discount)/100);
		return result;
	}
	
	public String getCarDetails(){
		System.out.println("Car - Parent class methos");
		String details = model + "::" + color + "::"+ price;
		return details;
	}
	
	protected void tyres(){
		System.out.println("Car- Thick model");
	}
	
	public void speed(){
		System.out.println("Car-Normal speed");
	}

}
