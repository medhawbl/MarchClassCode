package com.wbl.oops;

public class CarTest {
/*
	
	public Car getCar(String cartype, Car car){
		if(cartype=="sports"){
			return new SportsCar();
		}
		return new Car();			
	}*/
	
	public static void main(String[] args) {
		/*Car car = new Car();
		car.color="white";
		car.price=10000;
		car.model="nissan";
		System.out.println(car.getCarDetails());
		
		//same reference can hold different objects
		car= new Car();
		car.color="black";
		car.price=50000;
		car.model="ford";
		System.out.println(car.getCarDetails());
		
		*/
		
		
		/*Car car = new SportsCar();
		//child class method is called
		car.speed();
		
		Car car1 = new Car();
		//Parent class method is called
		car1.speed();
*/
		
		Car car = new SportsCar(6879);
		/*SportsCar sportCar = new SportsCar();
		
		//child class reference to parent class reference
		//upcasting or implicit casting
		car = sportCar;
		car.driveIt();
		
		// when we are downcasting make sure parent reference still hold child object
		Car car1 = new SportsCar();
		SportsCar sportCar1 = new SportsCar();
		//downcasting or explcit casting
		sportCar1 = (SportsCar)car1;
		sportCar1.driveIt();
		
		// this is wrong-- class cast exception  is thrown at run time at line-50
		Car car2 = new Car();
		SportsCar sportCar2 = new SportsCar();
		//downcasting or explcit casting
		sportCar2 = (SportsCar)car2;
		sportCar2.driveIt();*/
		
	}

}
