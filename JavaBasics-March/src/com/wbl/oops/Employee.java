package com.wbl.oops;

public class Employee {
	
	// static blocks are called at the time when class is loaded into memory
	static{
		System.out.println("static block - used for intialising purpose");
	}
	
	//global variables or class level variables
	public String name;
	public int id;
	String greet="helloworld";	

	public static int count=0;
	
	//final 
	public final int i=10;
	
	public Employee(){
		
	}
	
	//constructor 
	public Employee(String name,int id){
		System.out.println("constructor is called first...");
		this.name = name;
		this.id= id;		
		++count;
	}
	
	public  void displayDetails(){
		greet="hello";
		//i=10; final variables cannot be reassigned
		System.out.println("name : " + name);
		System.out.println("id : " + id);
		// u can access static variable/method inside non static methods
		System.out.println(count);
		//blocks
		{
			String day="Monday";

			System.out.println(day);
		}
		
	}
	
	public static void timeSheet(){
		// we cannot access non static variables inside static method/block
		//System.out.println(name);
		System.out.println("time sheet");
	}
	

}
