package com.wbl.datatypesAndLoops;

public class WhilenDoWhile {
	
	public void whileLoop(){
		int i=11;
		while(i<=10)
		{
		System.out.println("from while loop" +i);
		i= i+2;
		}
	}
	
	public void doWhileLoop(){
		int i=11;
		do{
			System.out.println("from Dowhile loop" + i);
			i++;
		}while(i<=10);
	}

	public static void main(String[] args) {
		
		WhilenDoWhile wdw = new WhilenDoWhile();
		//wdw.whileLoop();
		wdw.doWhileLoop();
	}

}
