package com.wbl.oops;

public class TestMobile {

	public static void main(String[] args) {
		
		Mobile iPhone = new Mobile();
	
		iPhone.cloor = "White";
		iPhone.setNoOfButtons(1);
		iPhone.size = 10;
		iPhone.clickAPic();
		iPhone.makeACall();
		iPhone.sendAnEmail();
		iPhone.displayDetails();
		
		Mobile samsung = new Mobile();
		//samsung.cloor = "Black";
		samsung.setColor("Purple");
		samsung.setNoOfButtons(1);
		samsung.size = 12;
		samsung.clickAPic();
		samsung.makeACall();
		samsung.sendAnEmail();
		samsung.displayDetails();

	}

}
