package com.covalense.assgnassessment.sortstudent;

import java.util.Comparator;

public class SortByPercentage {
	static Comparator<Student> comparator = (a, b) -> {
		if (a.getPercentage() > b.getPercentage()) {
			return 1;
		} else if (a.getPercentage() < b.getPercentage()) {
			return -1;
		}
		return 0;
	};

}
