package com.wbl.oops;

public class Dog  extends Animal{
	
	public Dog(String name, String breed, String color){
		super(name, breed, color);
	}
	
	@Override
	public void makeNoise(){
		System.out.println("Dog - says bow");
	}
	
	@Override
	public void displayPetDetails(){
		super.displayPetDetails();
		System.out.println("Dog has been since 5 years");
	}

}
