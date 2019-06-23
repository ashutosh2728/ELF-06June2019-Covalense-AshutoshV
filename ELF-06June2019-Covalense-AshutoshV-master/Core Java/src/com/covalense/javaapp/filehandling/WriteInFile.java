package com.covalense.javaapp.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

import lombok.extern.java.Log;

@Log
public class WriteInFile {
	public static void main(String[] args) {
		String msg = "How i wonder what you are";
		byte b[] = msg.getBytes();
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("poem.txt", true);
			fout.write(b);

			log.info("Data is written into the file");
		} catch (IOException e) {
			log.severe("IO Exception");
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				log.severe("IO Exception");
			}
		}

	}

}
