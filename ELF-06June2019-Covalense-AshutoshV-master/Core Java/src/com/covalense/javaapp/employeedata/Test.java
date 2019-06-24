package com.covalense.javapp.employeedata;

public class Test {
	public static void main(String[] args) {
		Employee e = new Employee();
		EDB1 a = new EDB1();
		EDB2 b = new EDB2();
        e.setGender('M');
		e.setName("Ashutosh");
		e.setSalary(145646);
		a.edb1(e);
		b.edb2(e);
		
	}

}
