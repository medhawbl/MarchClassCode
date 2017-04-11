package com.wbl.oops;

public class Student {

	//encapsulation
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id>0){
		this.id = id;
		}else{
			System.out.println("id cannot be negative");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
