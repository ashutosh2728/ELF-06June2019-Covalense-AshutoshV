package com.covalense.javaapp.immutableclass1;

import lombok.Getter;

@Getter
public final class Person {
	private final String name;
 private final int age;
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
	
	

}
