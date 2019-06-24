package com.covalense.javaapp.assgn.filehandling;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class AppendContent {
	public static void main(String[] args) {
		FileInputStream fin = null;
		FileWriter fw = null;
		try {
			fin = new FileInputStream("File1.txt");

			fw = new FileWriter("File2.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				fw.append((char) i);
			}
			log.info("Content of file 1 is copied to file 2");

		} catch (FileNotFoundException e) {
			log.severe("File Not Found");
		} catch (IOException e) {
			log.severe("IO Exception");
		} finally {
			try {
				fin.close();
				fw.close();
			} catch (IOException e) {
				log.severe("IO Exception");
			}
		}
	}
}
