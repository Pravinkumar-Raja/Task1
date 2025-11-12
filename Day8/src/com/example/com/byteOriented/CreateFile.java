package com.example.com.byteOriented;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File f1=new File("D:\\Program-Demo");
//		f1.mkdir();
//		System.out.println("Folder created Successfully");
		File f2=new File("D:\\Program-UST\\A.txt");
		f1.renameTo(f2);
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Folder renamed Successfully");
		System.out.println("File Created Successfully");
//		f1.isDirectory();
//		f1.canRead();
		
	}

}
