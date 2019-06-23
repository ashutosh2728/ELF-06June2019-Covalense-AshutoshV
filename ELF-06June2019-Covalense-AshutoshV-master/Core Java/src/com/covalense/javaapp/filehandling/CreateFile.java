package com.covalense.javaapp.filehandling;

import java.io.File;

import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class CreateFile {

	public static void main(String[] args) {
		File f = new File("aashu.txt");
		try {
			boolean res = f.createNewFile();
			
			log.info(""+res);
			log.info("Done");
		} catch (IOException e) {
			log.severe("IO Exception");;
		}
	}

}
