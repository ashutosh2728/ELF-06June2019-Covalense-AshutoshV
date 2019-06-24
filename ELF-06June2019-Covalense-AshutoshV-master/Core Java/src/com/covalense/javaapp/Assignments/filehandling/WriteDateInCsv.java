package com.covalense.javaapp.assgn.filehandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDateInCsv {
	public static void main(String[] args) {
		FileWriter fw = null;
		String name = "Ashutosh Verma";
		int age = 23;
		String designation = "Software Trainee";
		double salary = 15000;
		
		try {
			  fw = new FileWriter("File1.csv");
			 fw.write("Name : "+name+"\n");	
			 fw.write("Age : "+age+"\n");
			 fw.write("Designation : "+designation+"\n");
			 fw.write("Salary : "+(int) salary+"\n");
			 
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
