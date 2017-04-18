package com.wbl.IO;

import java.io.File;
import java.io.IOException;

public class CreateDir {

	public static void main(String[] args) {
		
		File file = new File("My Directory");
		file.mkdir();
		File file1 = new File("My Directory","text3.txt");
		System.out.println("File Exists :" + file1.exists());
		try {
			file1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File Exists :" + file1.exists());
	}

}
