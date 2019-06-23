package com.covalense.javaapp.filehandling;

import java.io.File;

import lombok.extern.java.Log;


@Log
public class MkDirFile {
	public static void main(String[] args) {
		File f = new File("program/prgm");
		boolean res = f.mkdirs();

		log.info(""+res);
	}

}
