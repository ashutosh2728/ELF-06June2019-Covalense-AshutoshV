package com.covalense.javaapp.assgn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudent {
public static void main(String[] args) {
	Student[] s = new Student[4];
	Student s1 = new Student();
	s1.id =1;
	s1.name ="Aman";
	s1.perc =81.8;
	
	Student s2 = new Student();
	s2.id =1;
	s2.name ="Vinay";
	s2.perc =61.8;
	
	Student s3 = new Student();
	s3.id =3;
	s3.name ="Aryan";
	s3.perc =85.8;
	
	Student s4 = new Student();
	s4.id =4;
	s4.name ="Rohan";
	s4.perc =79;
	
	FileOutputStream fout=null;
	ObjectOutputStream oos=null;
	FileInputStream fin = null;
	ObjectInputStream ois = null;
	try {
		fout = new FileOutputStream("Test4.txt");
		oos = new ObjectOutputStream(fout);
		fin = new FileInputStream("aashu.txt");
		ois = new ObjectInputStream(fin);
		oos.writeObject(s);
		int i;
			
			  while ((i = fin.read()) != -1  ) { 
				  fout.write(i); 
				 s = (Student[]) ois.readObject();
				  }
			 
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} finally {
		try {
			//fin.close();
			fout.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
}
