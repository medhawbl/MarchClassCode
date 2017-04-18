package com.wbl.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		
		try {
			PrintWriter pw = new PrintWriter("text2.txt");
			BufferedWriter bw = new BufferedWriter(pw);
			pw.println("Hello");
			pw.println("Today is Monday");
			pw.println("World");
			pw.flush();
			pw.close();
			
			FileReader fr = new FileReader("text2.txt");			
			BufferedReader br = new BufferedReader(fr);
			try {
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
				System.out.println(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
