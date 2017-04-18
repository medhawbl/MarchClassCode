package com.wbl.wrapper_PassByVal_Threads;

public class ThreadTest {

	public static void main(String[] args) {
		/*//USing Thread class
		MyThread t1 = new MyThread();
		//Thread execution starts by calling run method.
		t1.start();
		
		MyThread t2 = new MyThread();
		//Thread execution starts by calling run method.
		t2.start();
		*/
		
		//Using Runnable interface
		/*MyRunnableThread mr1 = new MyRunnableThread("chrome");
		Thread t1 = new Thread(mr1);
		//t1.setPriority(1);
		t1.start();
		MyRunnableThread mr2 = new MyRunnableThread("firefox");
		Thread t2 = new Thread(mr2);
		t2.start();
		MyRunnableThread mr3 = new MyRunnableThread("safari");
		Thread t3 = new Thread(mr3);
		t3.start();
		MyRunnableThread mr4 = new MyRunnableThread("ie");
		Thread t4 = new Thread(mr4);
		t4.start();*/
		
		AccountThread t1 = new AccountThread();
		t1.setName("Alan");
		t1.start();
		
		AccountThread t2 = new AccountThread();
		t2.setName("Sophi");
		t2.start();
		
		

	}

}
