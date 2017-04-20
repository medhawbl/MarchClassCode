package com.wbl.collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	//	return ((Integer)o1.getId()).compareTo((Integer)o2.getId());
		
		// 2 values are equal- return 0
		//value1 less than value2- return -1
		//value1 greater than value2- return 1
		return (o1.getName()).compareTo(o2.getName());
	}
	
}
