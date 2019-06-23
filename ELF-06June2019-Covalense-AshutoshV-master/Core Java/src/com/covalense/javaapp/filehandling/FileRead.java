package com.covalense.javaapp.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class FileRead {
	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("poem.txt");
			int i;
			while ((i = f.read()) != -1) {
				log.info("" + (char) i);
			}

		} catch (FileNotFoundException e) {
			log.severe("IO Exception");
		} catch (IOException e) {
			log.severe("IO Exception");
		} finally {
			try {
				f.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
