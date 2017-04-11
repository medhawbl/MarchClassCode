package com.wbl.test;

import com.wbl.oops.Employee;
import com.wbl.oops.HREmployee;

public class EmpTest {

	public static void main(String[] args) {
		
		/*Employee e1 = new Employee("Alan", 1);
		// e1.name="Alan";
		// e1.id=1;
		e1.id = e1.id + 1;
		e1.displayDetails();

		Employee e2 = new Employee("Sunitha", 2);
		// e2.name="Sunita";
		// e2.id=2;
		e2.displayDetails();
		
		Employee e3 = new Employee("Sunitha", 2);
		// e2.name="Sunita";
		// e2.id=2;
		e3.displayDetails();
		*/
		 
		// we can access static variables/methods without an object
		System.out.println("count of objects::" + Employee.count);
		Employee.timeSheet();

		HREmployee e1 = new HREmployee();
		e1.displayDetails();
	}

}
