package com.wbl.datatypesAndLoops;

import com.wbl.oops.Animal;
import com.wbl.oops.Dog;

public class Operators {

	public static void main(String[] args) {
		/*int a=10;
		int b=5;
		
		//Arithmetic Operators
			
		System.out.println(a+b);

		System.out.println(a-b);

		System.out.println(a*b);

		System.out.println("div - quotient: "+(a/b));
		System.out.println("div - remainder: "+(a%b));
		
		//unary operators
		int i = +10;
		int j = -10;
		
		int d=3;
		d++;
		System.out.println(d);
		
		//++c or c++ => c=c+1
		int c=3;
		System.out.println(c++);//3
		System.out.println(c);//4
		System.out.println(++c);//5
		System.out.println(c);//5
		
		int d=2;
		int e = ++d + d++;
		System.out.println(d);
		System.out.println(e);
		
		boolean b= true;
		System.out.println(!b);*/
		
		//equality and relational operators
		/*int a =10;
		int b=4;
		if(a>b){
			System.out.println("a is greater");
		}else if(a<b){
			System.out.println("b is greater");
		}else if(a==b) {
			System.out.println("both are equal");
		}*/
		
		//conditional operators
		//&& and || - are called short circuit operators in java
		/*int a=7;
		if(a%3==0 && a%5==0){
			System.out.println("div by 3 and 5");
		}else if(!(a%3==0 || a%5==0)){
			System.out.println("not div by 3 or 5");
		}else if(a%3 ==0){
			System.out.println("div by 3");
		}else if(a%5 ==0){
			System.out.println("div by 5");
		}*/
		
		//ternary ?:- short cut for simple if else
		/*int a=10;
		int b=5;
		String result = (a>b) ? "a is greater" : "b is greater ";
		System.out.println(result);*/
		
		//instanceof - check is a relation
		/*Animal ani = new Dog("princess","lab","white");
		
		if(ani instanceof Animal){
			System.out.println("dog is a animal");
		}
		
		if(ani instanceof Object){
			System.out.println("ani is a Object");
		}*/
		
		int i=4;
		int j=5;
		System.out.println(i&j);
		System.out.println(i|j);
		System.out.println(i^j);
		System.out.println(i<<1);
		System.out.println(j>>>2);
		
		int f=10;
		f+=10;//f=f+10
		System.out.println(f);

		
	}

}
