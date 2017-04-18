package com.wbl.wrapper_PassByVal_Threads;

public class MyRunnableThread implements Runnable{

	protected String browserName;
	
	public MyRunnableThread(String browserName){
		this.browserName = browserName;
	}
	
	@Override
	public void run() {
		System.out.println("Hello runnable");
		if(browserName.equals("chrome")){
			System.out.println("Run automation scripts for chrome");
			for(int i=0;i<10;i++){
				System.out.println("chrome : " + i);
			}
		}else if(browserName.equals("firefox")){
			System.out.println("Run automation scripts for firefox");
			for(int i=0;i<10;i++){
				System.out.println("firefox : " + i);
			}
		}else if(browserName.equals("safari")){
			System.out.println("Run automation scripts for safari");
			for(int i=0;i<10;i++){
				System.out.println("safari : " + i);
			}
		}else{
			System.out.println("Run automation scripts for ie");
			for(int i=0;i<10;i++){
				System.out.println("ie : " + i);
			}
		}
	}

}
