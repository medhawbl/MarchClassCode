package com.wbl.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("C:/Users/WBL/MedhaMarchWorkspace/JavaBasics-March/text1.txt");
			BufferedReader br = new BufferedReader(fr);
			try {
				System.out.println("Line : " + br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
