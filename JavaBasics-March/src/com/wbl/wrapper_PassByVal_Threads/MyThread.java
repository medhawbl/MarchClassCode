package com.wbl.wrapper_PassByVal_Threads;

public class MyThread extends Thread{
	
	@Override
	public void run(){
		System.out.println("Hello Thread : " + getName());
		//process that should run in parallel should be written here or call that methods from here
		for(int i=0;i<20;i++){
			System.out.println(i);
		}
	}

}
