package com.wbl.oops;

public class Training {
	
	public Training(){
		System.out.println("Default Constructor");
	}
	
	public Training(String name){
		System.out.println("parameterised Constructor"+ name);
	}
	
	public Training(String name, int id){
		System.out.println("parameterised Constructor"+ name + id);
	}
	
	public Training(String name, String id){
		System.out.println("parameterised Constructor"+ name + id);
	}
	
	protected String course="QA";
	
	public void displaySubjects(){

		System.out.println("start of displaysubjects");
		String result = subjects();
		System.out.println(result);
		System.out.println("end of displaysubjects");
		
	}
	
	public String subjects(){
		System.out.println("start of subjects");
		return "Java,Webdriver,RestAPI";
	}

}
