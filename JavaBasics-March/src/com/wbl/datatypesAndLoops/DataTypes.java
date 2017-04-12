package com.wbl.datatypesAndLoops;

public class DataTypes {

	public static void main(String[] args) {
		byte b= 32;
		short s= 467;
		int i=120;
		long l= 28299898;
		
		float f= 5.0f;
		double d= 66.80;
		
		char ch='a';
		boolean bool = true;
		
		//String is class in java- belowe statement means we are creating String class object.
		String greet = "hello";
		
		System.out.println(b);
		
		//TypeCasting
		//implicit cast or upcasting
		b=32;
		i = b;
		System.out.println("upcast:"+i);
		//explicit cast or downcasting	
		i=56;
		b= (byte)i;
		System.out.println("downcast:"+b);
		
		byte b1 = 34;
		float f1 = 4.4f;
		
		f1= b1;
		
		f1 = 4.4f;
		b1= (byte)f1;
		System.out.println(b1);
		

	}

}
