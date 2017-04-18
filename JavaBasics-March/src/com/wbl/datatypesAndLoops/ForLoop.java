package com.wbl.datatypesAndLoops;

public class ForLoop {
	
	//printing numbers from 1 to 10
	public void forLoop(){
		
		for(int i=0;i<=10;i+=2){
			System.out.println(i);
			}
	}
	
	public void dupElement(){
		int arr1[] = {20,30,40,50,60};
		int arr2[] = {10,30,50,20,60,70,80};
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	public void breakCondition() {
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
	
		ForLoop fl = new ForLoop();
		//fl.forLoop();
		//fl.dupElement();
		fl.breakCondition();
	}

}
