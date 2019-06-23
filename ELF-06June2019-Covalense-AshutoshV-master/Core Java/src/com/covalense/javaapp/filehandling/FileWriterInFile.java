package com.covalense.javaapp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class FileWriterInFile {
	public static void main(String[] args) {
		String msg = "Ding ding digana.. dam dam dagana";
		char c[]= msg.toCharArray();
		FileWriter fw=null;
		try {
			 fw = new FileWriter("password.txt");
			fw.write(c);
			
			
			log.info("Done");
		} catch (IOException e) {
			log.severe("IO Exception");
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				log.severe("IO Exception");
			}
		}
	}

}
