package com.wbl.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompileExceptions {

	public static void main(String[] args){

		File fr =new File("C:/User/WBL/MedhaMarchWorkspace/JavaBasics-March/text1.txt");
		try {
			fr.createNewFile();
		} catch (FileNotFoundException e) {
			System.out.println("Path is not Correct !! ");
		} catch (IOException e) {
			System.out.println("Path is not Correct !! ");
		} catch (NullPointerException e) {
			System.out.println("Path is not Correct !! ");
		}
	}

}
