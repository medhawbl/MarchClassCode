package com.wbl.wrapper_PassByVal_Threads;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int i=10;
		Integer id=20;
		Integer id1=new Integer(20);
		System.out.println((id+id1));
		//to convert Integer to String
		String s = id.toString();
		
		//to convert int to String
		s = Integer.toString(i);
		System.out.println(s+30);// new string object with val 1030 is created but with no reference
		System.out.println(s);// String is immutable- so s is 10
		
		
		String s1="100";
		//parseInt - convert string to integer primitive
		int i1 = Integer.parseInt(s1);
		System.out.println(i1+30);

		//valueOf - convert String to wrapper class Integer type
		Integer i2 = Integer.valueOf(s1);
		//valueOf also convert primitive int to wrapper class Integer type
		Integer i3 = Integer.valueOf(i1);
		
		
		s1="100a";
		//string to integer - Number format exception is thrown as string has non digit value
		//i1 = Integer.parseInt(s1);
		
		System.out.println(Integer.max(10,20));

	}

}
