package com.wbl.datatypesAndLoops;

public class LoopsAndConditions {
	
	public boolean evenOrOdd(int input){
		boolean result=false;
		if(input%2 == 0){
			result = true;
		}
		return result;
	}
	
	public String evenOrOddNumber(int input){
		String result="";
		if(input%2 == 0){
			result = "even";
		}else{
			result= "odd";
		}
		return result;
	}
	
	public void daysOfWeek(String input ){
		//in switch- byte,char,int,short, String,Enum, Integer, Character, Long, Short
		switch(input){
		
		case "mon":
			System.out.println("its monday");
			break;
		case "tue":
			System.out.println("its tuesday");
			break;
		case "wed":
			System.out.println("its wednesday");
			break;
		case "thu":
			System.out.println("its thursday");
			break;
		case "fri":
			System.out.println("its friday");
			break;
		case "sat":
			System.out.println("its saturday");
			break;
		default:
			System.out.println("its sunday");
		}
		
		
	}


	public static void main(String[] args) {
		LoopsAndConditions lc = new LoopsAndConditions();
		System.out.println(lc.evenOrOdd(6));
		System.out.println(lc.evenOrOddNumber(6));
		lc.daysOfWeek("wed");
	}

}
