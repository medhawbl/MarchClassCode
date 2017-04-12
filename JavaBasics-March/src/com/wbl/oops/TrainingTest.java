package com.wbl.oops;

public class TrainingTest {
	

	public static void main(String[] args) {
		Training tr = new QaTraining();
		System.out.println(tr.displayCourseContent());
		//At run time - which method to be called - whether method in parent or child-
		//jvm knows based on object passed - virtual method invocation- dynamic polymorphism
		tr.getRecordings();
		
		tr = new UITraining();
		System.out.println(tr.displayCourseContent());
		tr.getRecordings();

	}

}
