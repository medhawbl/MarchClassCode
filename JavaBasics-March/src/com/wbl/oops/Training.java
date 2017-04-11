package com.wbl.oops;

public abstract class Training {
	
	public Training(){
		System.out.println("abstract class constructor");
	}
	
	// variables are allowed in abstract class
	public String name;
	
	//concrete methods - method which have method body/implementation
	public void getRecordings(){
		System.out.println("Recordings to qa and ui");
	}
	
	public void getPresentations(){
		System.out.println("presentations available to QA and UI");
	}
	
	//abstract methods - method which do not have method body/implementation
	public abstract String displayCourseContent();
	
	//abstract methods - method which do not have method body/implementation
	public abstract void toolsAndSetup();
	
	//abstract methods - method which do not have method body/implementation
	public abstract void interviewPrep();
	
	public abstract int countOfClasses();
	

}
