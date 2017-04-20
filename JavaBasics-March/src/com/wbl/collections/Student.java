package com.wbl.collections;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	private String adress;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode(){
		return id*17;
	}
	
	@Override
	public boolean equals(Object o2){
		boolean result=false;
		if(o2 instanceof Student && ((Student)o2).id==this.id &&
				 ((Student)o2).name==this.name	){
			result=true;
		}		
		return result;
	}
	
	public static void main(String args[]){
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
		
		Student std1 = new Student();
		std1.setId(1);
		std1.setName("Swetha");
		System.out.println(std1.hashCode());
		
		Student std2 = new Student();
		std2.setId(1);
		std2.setName("Swetha");
		System.out.println(std2.hashCode());
		
		System.out.println(std1.equals(std2));
	}

	@Override
	public int compareTo(Student o) {
		return ((Integer)this.getId()).compareTo((Integer)o.getId());
	}
	
}
