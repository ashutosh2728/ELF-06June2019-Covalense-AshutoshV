package com.covalense.javaapp.copy.javabean;

public class MyArrayClass {
	private Object[] myArray;
	private Object[] myArray1;
	private int index;

	public MyArrayClass() {
		this(10);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("Size should be greater than zero");
		}
		myArray = new Object[size];
		index = 0;
	}

	public void add(Object val) {
		if (index >= myArray.length) {
			myArray1 = new Object[2 * myArray.length];
			System.arraycopy(myArray, 0, myArray1, 0, myArray.length);
			myArray = myArray1;
		}
		myArray[index] = val;
		index++;

	}

	public Object get(int position) {
		return myArray[position];

	}

	public int getSize() {
		return index - 1;
	}

	public void remove(int position) {
		if (position >= myArray.length) {
			throw new ArrayIndexOutOfBoundsException("Position should be less than the size of an array");
		} else {
			myArray[position] = null;
			/*
			 * for (int i = position; i < myArray.length - 1; i++) { myArray[i] = myArray[i
			 * + 1]; }
			 */
			System.arraycopy(myArray, position + 1, myArray, position, myArray.length - 1 - position);
		}
	}

}
