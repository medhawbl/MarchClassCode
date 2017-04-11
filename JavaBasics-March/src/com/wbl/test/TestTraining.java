package com.wbl.test;

import com.wbl.oops.Training;

public class TestTraining extends Training{

	public void test(){
		System.out.println(course);
		displaySubjects();
	}
	public static void main(String[] args) {
		Training tr = new Training();
		//System.out.println(tr.course);
		tr.displaySubjects();		

	}

}
