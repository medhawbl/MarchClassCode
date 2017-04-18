package com.wbl.exceptions;


public class TestMyException {

	public static void main(String[] args) throws MYException {
		int id=-5;
		if(id<5){
			throw new MYException("exception");
		}
	}
	

}
