package com.covalense.javaapp.assgn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;
@Log
public class ReadAndWriteData {
	public static void main(String[] args) {
		FileInputStream fin =null;
		FileOutputStream fout =null;
		try {
			 fin = new FileInputStream("File1.txt");
			 fout = new FileOutputStream("File2.txt",true);
			int i;
			while ((i = fin.read()) != -1) {
				fout.write(i);	
			}
			log.info("Content of file 1 is copied to file 2");
		
		 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
