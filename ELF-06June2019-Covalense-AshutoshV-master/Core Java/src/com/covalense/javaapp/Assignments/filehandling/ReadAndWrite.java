package com.covalense.javaapp.assgn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class ReadAndWrite {
public static void main(String[] args) {
	FileInputStream fin =null;
	FileInputStream fin1 =null;
	FileOutputStream fout =null;
	try {
		 fin = new FileInputStream("File1.txt");
		 fin1 = new FileInputStream("File2.txt");
		 fout = new FileOutputStream("File3.txt",true);
		int i, j;
		while ((i = fin.read()) != -1 ) {
			fout.write(i);	
		}
		while ((j = fin1.read())!= -1) {
			fout.write(j);
		}
		log.info("Content of file 1 and file2 is copied to file 3");
	
	 
		
	} catch (FileNotFoundException e) { 
		log.severe("FileNotFoundException");
	} catch (IOException e) {
		log.severe("IOException");
	} finally {
		try {
			fin.close();
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
