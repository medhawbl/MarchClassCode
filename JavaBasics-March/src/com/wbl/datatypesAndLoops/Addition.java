package com.wbl.datatypesAndLoops;

public class Addition {
	
	// for global variables - if we do not intialise them- default values are taken
	public int a;
	public int b;
	float c;
	public String greet;
	
	public int sum(){
		//local variables should be intilased before you use them - else you get error as
		//they do not take any default values like global variables
		int a=1;
		int b=3;
		
		return a+b;
	}

	public static void main(String args[]){		
		Addition add = new Addition();
		System.out.println(add.greet);
		System.out.println(add.c);
		System.out.println(add.sum());
	}
}
