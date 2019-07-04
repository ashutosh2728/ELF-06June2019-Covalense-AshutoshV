package com.covalense.javaapp.assgn.assessment.list;

import java.util.List;

import lombok.extern.java.Log;

@Log
public class ListSelectionTest {
	public static void main(String[] args) {
		ListSelection t = new ListSelection();
		List list = t.getReturn(1);
		log.info("" + list.getClass());
	}

}
