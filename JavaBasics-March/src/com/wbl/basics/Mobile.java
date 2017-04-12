package com.wbl.basics;

public class Mobile {
	
	//color, size, buttons – variables
	public String cloor;
	protected int size;
	private int noOfButtons =3;
	//default noOfCamera;
	
	
	
	//make a call, send a email, click pic, post, delete – operations/ methods
	public void makeACall(){
		System.out.println("I can make a call now..");
	}
	
	public void sendAnEmail(){
		System.out.println("I can send a email..");
	}
	
	public void clickAPic(){
		System.out.println("I can take pictures now..");
	}
	
	public void setColor(String inputColor){
		cloor = inputColor;
	}
	
	public void displayDetails(){
		System.out.println("Color Of Mobile is : " + cloor);
		System.out.println("Size Of Mobile is : " + size);
		System.out.println("Number Of Buttons Of Mobile is : " + getNoOfButtons());
	}

	public int getNoOfButtons() {
		return noOfButtons;
	}

	public void setNoOfButtons(int noOfButtons) {
		this.noOfButtons = noOfButtons;
	}
	
}
