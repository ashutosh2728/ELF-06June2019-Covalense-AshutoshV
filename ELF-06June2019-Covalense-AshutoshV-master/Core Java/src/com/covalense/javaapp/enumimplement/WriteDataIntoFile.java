package com.covalense.javaapp.enumimplement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataIntoFile {
	public static void main(String[] args) {
		String msg = "Hello!!";
		byte[] by = msg.getBytes();

		try (FileOutputStream fout = new FileOutputStream("aashu.txt")) {

			fout.write(by);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
