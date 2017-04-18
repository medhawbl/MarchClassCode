package com.wbl.IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinesFromFile {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("text2.txt");
			BufferedReader br = new BufferedReader(fr);
			int lines = 0, count =0;
			String line ="";
			try {
				while((line =br.readLine())!=null){
					System.out.println(line);
					lines++;
					String[] str = line.split(" ");
					for(String str1 : str){
						System.out.println(str1);
						count++;
					}
				}
				System.out.println("Number of words : " + count);
				System.out.println("Number of lines : " + lines);
				

			} catch (IOException e) {
				e.printStackTrace();
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


}
