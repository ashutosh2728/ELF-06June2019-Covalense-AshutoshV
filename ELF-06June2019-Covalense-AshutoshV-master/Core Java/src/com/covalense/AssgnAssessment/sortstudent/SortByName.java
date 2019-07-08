package com.covalense.assgnassessment.sortstudent;

import java.util.Comparator;

public class SortByName {
	
	static Comparator<Student> comparator = (i,j) -> i.getName().compareTo(j.getName());


}
