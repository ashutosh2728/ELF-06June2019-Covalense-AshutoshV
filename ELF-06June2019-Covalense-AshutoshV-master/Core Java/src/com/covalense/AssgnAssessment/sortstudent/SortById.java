package com.covalense.assgnassessment.sortstudent;

import java.util.Comparator;

public class SortById {
	public static Comparator<Student> comparator = (i,j)-> {
		if(i.getId()>i.getId()) {
			return 1;
		} else if(i.getId()<i.getId()) {
			return 1;
		}
		return 0;
	};
}
	
	
