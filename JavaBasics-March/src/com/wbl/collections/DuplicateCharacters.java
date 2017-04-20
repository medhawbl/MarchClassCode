package com.wbl.collections;

import java.util.HashSet;

public class DuplicateCharacters {
	
	//method that returns first duplicate character
	public static char firstDuplicateCharInString(String input){
		char dupOutputChar = ' ';
		HashSet<Character> set = new HashSet<Character>();
		//hello-01234
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);//h. e. l . l.o
			if(set.contains(ch)){
				dupOutputChar=ch;
				break;
			}else{
				set.add(ch);
			}
			//or
			/*if(!set.add(ch)){
				chr=ch;
				break;
			}*/
		}
		return dupOutputChar;		
	}
	
	//find all duplicates and their count 
	
	

	public static void main(String[] args) {
		System.out.println(firstDuplicateCharInString("heeello"));
	}

}
