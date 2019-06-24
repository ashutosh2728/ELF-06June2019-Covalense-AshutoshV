package com.covalense.javaapp.singleturnclass;

public class Marker {
	private final static Marker m = new Marker();

	private Marker() {

	}

	public static Marker getMarker() {
		return m;
	}

}
