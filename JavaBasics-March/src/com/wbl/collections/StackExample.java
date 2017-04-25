package com.wbl.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(45);
		stack.push(35);
		stack.push(65);
		stack.push(25);
		
		Iterator<Integer> itr = stack.iterator();
		while(itr.hasNext()){
			System.out.println(stack.pop());
		}
	}

}
