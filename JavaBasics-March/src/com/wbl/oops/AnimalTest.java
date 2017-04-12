package com.wbl.oops;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal("punto","lab","brown");
		animal.eatFood();
		animal.displayPetDetails();
		
		Dog dog = new Dog("princess","lab","white");
		dog.displayPetDetails();
		dog.eatFood();

	}

}
