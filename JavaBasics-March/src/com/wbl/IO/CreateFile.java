package com.wbl.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFile {

	public static void main(String[] args) {
		
		File file = new File("text1.txt");
		try {
			file.createNewFile();
			System.out.println(file.exists());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileWriter fw = new FileWriter(file);
			fw.write("Hello World, Good Morning!!!");
			fw.flush();
			fw.close();
			FileReader fr = new FileReader(file);
			char[] ch = new char[200];
			fr.read(ch);
			for(int i = 0; i<ch.length;i++){
				System.out.print(ch[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
