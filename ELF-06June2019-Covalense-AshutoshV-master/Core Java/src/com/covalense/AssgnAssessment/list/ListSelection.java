package com.covalense.javaapp.assgn.assessment.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSelection {

	public List getReturn(int i) {
		if (i == 1) {
			return new ArrayList();
		} else if (i == 2) {
			return new LinkedList();
		} else if (i == 3) {
			return new Vector();
		}
		return null;
	}

}
