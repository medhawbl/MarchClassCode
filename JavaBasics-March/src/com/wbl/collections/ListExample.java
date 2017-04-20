package com.wbl.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
	
	public void arrayList(){		
		List<String> names = new ArrayList<String>();
		names.add("Jovy");
		names.add("Srikanth");
		names.add("Srikanth");
		names.add("alan");
		names.add(null);
		names.add("Pushpa");
		
		// to iterate the data in ArrayList - method 1
		for(String name: names){
			System.out.println(name);
		}
		
		// to iterate the data in ArrayList - method 2
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
		
		names.add(2, "sabitha");
		
		names.remove(0);
		
		// to iterate the data in ArrayList - method 3
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		if(names.contains("Pushpa")){
			System.out.println("element found!!!!");
		}		
		
	}
	
	public void linkedList(){		
		List<String> names = new LinkedList<String>();
		names.add("Jovy");
		names.add("Srikanth");
		names.add("Srikanth");
		names.add("alan");
		names.add(null);
		names.add("Pushpa");
		
	/*	// to iterate the data in ArrayList - method 1
		for(String name: names){
			System.out.println(name);
		}
		
		// to iterate the data in ArrayList - method 2
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}*/
		
		names.add(2, "sabitha");
		
		names.remove(0);
		
		((LinkedList)names).addFirst("Alan");
		((LinkedList)names).addLast("Sophi");
		// to iterate the data in ArrayList - method 3
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		if(names.contains("Pushpa")){
			System.out.println("element found!!!!");
		}	
			
	}
	
	public void vector(){		
		List<String> names = new Vector<String>(8,5);
		names.add("Jovy");
		names.add("Srikanth");
		names.add("Srikanth");
		names.add("alan");
		names.add(null);
		names.add("Pushpa");
		
	/*	// to iterate the data in ArrayList - method 1
		for(String name: names){
			System.out.println(name);
		}
		
		// to iterate the data in ArrayList - method 2
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}*/
		
		names.add(2, "sabitha");
		names.add("Jovy");
		names.add("Srikanth");
		names.add("Srikanth");
		names.add("alan");
		names.add("Jovy");
		names.add("Srikanth");
		names.add("Srikanth");
		names.add("alan");
		
		System.out.println(((Vector)names).capacity());
		
		names.remove(0);
		
		// to iterate the data in ArrayList - method 3
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		if(names.contains("Pushpa")){
			System.out.println("element found!!!!");
		}	
			
	}
	
	public void sortList(){
		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("car");
		list.add("ball");
		list.add("dell");
		list.add("eikon");
		list.add("java");
		Collections.sort(list);
		for(String str:list){
			System.out.println(str);
		}
	}
	

	public static void main(String[] args) {
		ListExample le = new ListExample();
		le.sortList();
	}

}
