package com.example.com.characterOriented;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterOriented {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:\\Program-UST\\c.txt");
		String str="Congrats on completing the Project";
		fw.write(str);
		System.out.println("File written Successfully");
		fw.close();
		
		FileReader fr=new FileReader("D:\\Program-UST\\c.txt");
		int i=0;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		fr.close();
	}
}
