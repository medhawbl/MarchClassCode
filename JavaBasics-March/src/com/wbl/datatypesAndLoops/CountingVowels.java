package com.wbl.datatypesAndLoops;

public class CountingVowels {
	//Hello - {a,e,i,o,u} - 2
	
	public void countVowels(String input){
		String lowerCase = input.toLowerCase();
		int count = 0;
		for(int i =0;i<lowerCase.length();i++){
			if(lowerCase.charAt(i)=='a' || lowerCase.charAt(i)=='e' || lowerCase.charAt(i)=='i'
					|| lowerCase.charAt(i)=='o' || lowerCase.charAt(i)=='u' ){
				count++;
			}
		}
		System.out.println("Number of Vowels in given String : " + count);
	}
	public static void main(String[] args) {
		
		CountingVowels cv = new CountingVowels();
		cv.countVowels("Hello");

	}

}
