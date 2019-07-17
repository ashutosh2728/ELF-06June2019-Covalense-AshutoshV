package com.covalense.springcore.beans;

import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.springcore.interfaces.Animal;

public class PetBean {
	public String name;
	@Autowired
	// @Qualifier("donkey")
	private Animal animal;

	public void doSomething() {
		animal.eat();
		animal.makeSound();
	}
}
