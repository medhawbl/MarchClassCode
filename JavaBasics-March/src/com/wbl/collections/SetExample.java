package com.wbl.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {
	
	public void hashset(){		
		Set<String> names = new HashSet<String>();
		System.out.println(names.add("Jovy"));
		System.out.println(names.add("Srikanth"));
		System.out.println("duplicate added :"+names.add("Srikanth"));
		System.out.println(names.add("alan"));
		System.out.println(names.add(null));
		System.out.println(names.add("Pushpa"));
		
		// to iterate the data in ArrayList - method 1
		for(String name: names){
			System.out.println(name);
		}	
		/*
		// to iterate the data in ArrayList - method 3
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		if(names.contains("Pushpa")){
			System.out.println("element found!!!!");
		}	*/	
		
	}
	
	public void hashsetWithUserDefinedObjects(){		
		Set<Student> students = new HashSet<Student>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Swetha");
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		s2.setId(1);
		s2.setName("Swetha");
		System.out.println(s2.hashCode());
		
		//as hashcode is different it treats s1 and s2 as 2 different objects
		//and it adds to HashSet
		students.add(s1);
		students.add(s2);
			
		System.out.println(students.size());// 1 or 2
		
		for(Student std: students){
			System.out.println(std.getId() +" , "+std.getName());
		}
		
	}
	
	public void treeSetStudents(){	
		Set<Student> students = new TreeSet<Student>();
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Swetha");
		
		Student s2 = new Student();
		s2.setId(3);
		s2.setName("Joe");
		
		Student s3 = new Student();
		s3.setId(2);
		s3.setName("Alan");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
			
		
		for(Student std: students){
			System.out.println(std.getId() +" , "+std.getName());
		}
		
		
	}
	
	
	public void treeSet(){	
		Set<String> names = new TreeSet<String>();
		names.add("ball");
		names.add("apple");
		names.add("dog");
		names.add("cat");
		//names.add(null);
		
		Set<Integer> ids = new TreeSet<Integer>();
		ids.add(23);
		ids.add(12);
		ids.add(36);
		ids.add(1);
		
		for(Integer id: ids){
			System.out.println(id);
		}	
		
	}
	public void linkedHashSet(){	
		Set<Integer> ids = new LinkedHashSet<Integer>();
		ids.add(23);
		ids.add(12);
		ids.add(36);
		ids.add(1);
		ids.add(null);
		
		for(Integer id: ids){
			System.out.println(id);
		}	
		
	}

	public static void main(String[] args) {
		SetExample set = new SetExample();		
		set.treeSetStudents();
	}

}
