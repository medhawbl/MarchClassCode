package com.wbl.wrapper_PassByVal_Threads;

public class AccountThread extends Thread{
	
	protected Account acct = new Account();
	
	@Override
	public void run(){
		System.out.println("Hello Account Thread");	
		for(int i=1;i<10;i++){
		int amountToWithDraw = 10;
		try {
			if(acct.getBalance()<0){
				System.out.println("account bal is negative!!!");
			}
			withdraw(amountToWithDraw);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
	}
	
	public synchronized void withdraw(int amountToWithDraw) throws InterruptedException{
		System.out.println(getName()  + " started withdraw");
		if(acct.getBalance()>amountToWithDraw){
		 System.out.println("withdraw starts!!!");
		 //logic to interact with DB
		 Thread.sleep(500);// temporarily pause current thread exceution
		 acct.withdraw(amountToWithDraw);
		}else{
			System.out.println("bal is negative");
		}
	}
	
	public static void main(String[] args) {
		AccountThread t1 = new AccountThread();
		t1.setName("Alan");
		t1.start();
		
		AccountThread t2 = new AccountThread();
		t2.setName("Sophi");
		t2.start();
		
		

	}


}
