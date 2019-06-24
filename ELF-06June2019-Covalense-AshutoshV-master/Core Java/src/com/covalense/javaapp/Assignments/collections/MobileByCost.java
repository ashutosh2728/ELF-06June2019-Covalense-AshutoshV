package com.covalense.javaapp.assgn.collections;

import java.util.Comparator;

public class MobileByCost implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		if(o1.cost>o2.cost) {
			return 1;
		}
		else if(o1.cost<o2.cost) {
			return -1;
		}return 0;
	}

}
