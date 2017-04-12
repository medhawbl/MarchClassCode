package com.wbl.oops;

public class Animal {
	
	protected String name;
	protected String breed;
	protected String color;
	
	
	// constructor - used to initialse global variables at the time of object creation
	public Animal(String name, String breed, String color){
		this.name = name;
		this.breed = breed;
		this.color= color;
	}
	
	public void eatFood(){
		System.out.println("Animal- eats food");
	}
	
	public void makeNoise(){
		System.out.println("It makes noise");
	}
	
	public void displayPetDetails(){
		System.out.println(name + "::" + breed + "::"+ color);
	}

}
