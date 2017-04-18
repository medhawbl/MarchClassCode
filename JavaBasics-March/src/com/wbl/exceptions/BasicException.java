package com.wbl.exceptions;

public class BasicException {

	public static void main(String[] args) {
		int a = 10,b=20;
		try{
			System.out.println("Addition : " + (a+b));
			//System.out.println(args[2]);
			System.out.println("Substraction : " + (a-b));
		}catch(Exception e){
			System.out.println("Multiplication : " + (a*b));
			System.out.println("There is no element in the array");
			System.out.println("Division : " + (a/b));
		}finally{
			System.out.println("From Finally");
		}
	}

}
