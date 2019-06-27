package com.covalense.javaapp.implementinglamda;

import java.util.Comparator;
import java.util.TreeSet;

import lombok.extern.java.Log;

@Log
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Ashutosh", 2345.8);
		Employee e2 = new Employee(2, "Prakash", 4644.8);
		Employee e3 = new Employee(3, "Suraj", 1544.8);
		Employee e4 = new Employee(4, "Jatin", 4789.8);
		Employee e5 = new Employee(5, "Aman", 2566.8);

		Comparator<Employee> c = (e, f) -> e.name.compareTo(f.name);

		TreeSet<Employee> ts = new TreeSet<Employee>(c);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);

		for (Employee p : ts) {
			log.info("" + p.name);
			log.info("" + p.id);
			log.info("" + p.salary);
			log.info("--------------");
		}
	}

}
