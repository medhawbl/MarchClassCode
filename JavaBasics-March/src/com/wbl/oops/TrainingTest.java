package com.wbl.oops;

public class TrainingTest {

	public static void main(String[] args) {
		Training tr = new QaTraining();
		System.out.println(tr.displayCourseContent());
		tr.getRecordings();
		
		tr = new UITraining();
		System.out.println(tr.displayCourseContent());
		tr.getRecordings();

	}

}
