package com.wbl.wrapper_PassByVal_Threads;

public class Account {

	protected int bal=50;
	
	public void withdraw(int amountToWithDraw){
		bal-=amountToWithDraw;
	}

	
	public  int getBalance(){
		return bal;
	}
	
	public String getStatement(){
		return "Statement for April month";
	}
}
