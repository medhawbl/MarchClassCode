package com.wbl.wrapper_PassByVal_Threads;

import com.wbl.basics.Employee;

public class PassByValue {
	
	public static void incrementAndSaveToDB(int i){
		i++;
		//store to db(i);
		System.out.println(i);
	}

	public static void calcSalaryAndSaveToDB(Employee e){
		e.salary += 200;
	}
	public static void main(String[] args) {
		int i=10;
		System.out.println("Before method call : "+i);//10
		//Java passes copy of value - pass by value
		incrementAndSaveToDB(i);
		System.out.println("After method call : "+i);//10
		
		
		Employee e= new Employee("Sunitha",1,1200);
		System.out.println("Before method call : "+ e.salary);//1200
		//Java passes copy of reference value - pass by value
		calcSalaryAndSaveToDB(e);
		System.out.println("After method call : "+  e.salary);//1400
				
	}

}
