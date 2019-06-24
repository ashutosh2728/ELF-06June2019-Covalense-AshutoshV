package com.covalense.javapp.passingobject;

public class TestB 
{
	public static void main(String[] args) {
		Water w = new Water();
		Drinker d = new Drinker();
		d.recieve(w);
	}
}
