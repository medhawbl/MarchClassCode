package com.wbl.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
	
	public void mapExample(){
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Java");
		map.put(2, "JavScript");
		map.put(1, "JAVA");
		map.put(3, "C++");
		map.put(null, "C++");
		map.put(null, null);
		map.put(4, null);
		map.put(5, null);
		
	//	Set<Integer> ids = map.keySet();
		
		for(Integer id :   map.keySet()){
			System.out.println(id + " , "+ map.get(id));
		}
	}
	
	public void hashTableExample(){
		Map<Integer,String> map = new Hashtable<Integer,String>();
		map.put(1, "Java");
		map.put(2, "JavScript");
		map.put(1, "JAVA");
		map.put(3, "C++");
		
		
		for(Integer id :   map.keySet()){
			System.out.println(id + " , "+ map.get(id));
		}
	}


	
	public static void main(String args[]){
		MapExample me = new MapExample();
		me.hashTableExample();
	}
}
