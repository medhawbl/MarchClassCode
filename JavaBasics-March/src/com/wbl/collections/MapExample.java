package com.wbl.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
	
	public void mapExample(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Java");
		map.put(2, "JavScript");
		map.put(1, "Python");
		map.put(3, "C++");
		map.put(null, "C++");
		map.put(null, null);
		map.put(4, null);
		map.put(5, null);
		map.put(1, "C");
	//	Set<Integer> ids = map.keySet();
		//method -1 (using enchanhed for loop)
		for(Integer id :   map.keySet()){
			System.out.println(id + " , "+ map.get(id));
		}
		
		System.out.println("******************");
		
		//method-2(using entrySet)
		Set<Entry<Integer,String>> entries = map.entrySet();
		
		for(Map.Entry<Integer,String> entry : entries){
			System.out.println(entry.getKey() + "::" + entry.getValue());
		}
		
	}
	
	public void hashTableExample(){
		Map<Integer,String> map = new Hashtable<Integer,String>();
		map.put(1, "Java");
		map.put(2, "JavScript");
		map.put(1, "Python");
		map.put(3, "C++");
		
		for(Integer id :   map.keySet()){
			System.out.println(id + " , "+ map.get(id));
		}
	}

	public void treeMapExample(){
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "Java");
		map.put(2, "JavScript");
		map.put(1, "Python");
		map.put(3, "C++");
		//map.put(null, "C++");
		map.put(3, null);
		
		for(Integer id :   map.keySet()){
			System.out.println(id + " , "+ map.get(id));
		}
	}
	
	public void linkedHashMapEx(){
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(3, "C++");
		map.put(1, "Java");
		map.put(2, "JavScript");
		map.put(1, "Python");
		map.put(3, "C++");
		//map.put(null, "C++");
		map.put(3, null);
		
		for(Integer id :   map.keySet()){
			System.out.println(id + " , "+ map.get(id));
		}
	}
	
	public void userDefinedObjectExample(){
		Map<Student,String> map = new HashMap<Student,String>();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("john"); //key:value - 1,john:smitha
		
		Student s2 = new Student();
		s2.setId(1);
		s2.setName("john");
		
		Student s3 = new Student();
		s3.setId(1);
		s3.setName("john");
		
		map.put(s1, "Smitha");
		map.put(s2,"Swetha");
		map.put(s3, "Jyothi");
		
		System.out.println("the value is : " + map.get(s2));
	}
	
	public static void main(String args[]){
		MapExample me = new MapExample();
		me.userDefinedObjectExample();
	}
}
