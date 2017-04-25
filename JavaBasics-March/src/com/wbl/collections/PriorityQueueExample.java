package com.wbl.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public void priorityQueueEx(){
		PriorityQueue<String> pq = new PriorityQueue<String>(new PriorityComparator());
		pq.add("Mango");
		pq.add("Apple");
		pq.add("Grape");
		pq.add("Orange");
		
		//peek - returns the top value of the queue
		System.out.println(pq.peek());
		System.out.println("Before Poll : " + pq.size());
		//poll - returns and removes the top value of the queue
		System.out.println(pq.poll());
		System.out.println("After Poll : " + pq.size());
		
	}

	public static void main(String[] args) {
	
		PriorityQueueExample pqe = new PriorityQueueExample();
		pqe.priorityQueueEx();
		
	}

}
