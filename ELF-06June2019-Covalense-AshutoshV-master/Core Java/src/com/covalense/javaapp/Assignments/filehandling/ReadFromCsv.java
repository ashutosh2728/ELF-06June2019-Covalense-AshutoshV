package com.covalense.javaapp.assgn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadFromCsv {

	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			 fin = new FileInputStream("File1.csv");
			int i=0;
			
			while ((i = fin.read()) != -1) {
				System.out.print((char)i);
					
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
