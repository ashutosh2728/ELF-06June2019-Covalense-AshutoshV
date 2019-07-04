package com.covalense.javaapp.assgn.assessment.countobjects;

import java.util.ArrayList;
import java.util.function.Predicate;

import lombok.extern.java.Log;

@Log
public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> arrayList = new ArrayList<Animal>();
		Cow cow = new Cow();
		Lion lion = new Lion();
		Dog dog = new Dog();
		arrayList.add(cow);
		arrayList.add(cow);
		arrayList.add(cow);
		arrayList.add(cow);
		arrayList.add(lion);
		arrayList.add(lion);
		arrayList.add(lion);
		arrayList.add(lion);
		arrayList.add(dog);
		arrayList.add(dog);
		arrayList.add(dog);
		Predicate<Animal> cowPredicate = (i) -> i.equals(cow);
		Predicate<Animal> lionPredicate = (i) -> i.equals(lion);
		long cowObj = arrayList.stream().filter(cowPredicate).count();
		log.info("Cow Objects are " + cowObj);

		long lionObj = arrayList.stream().filter(lionPredicate).count();
		log.info("Lion Objects are " + lionObj);

		log.info("Dog Objects are " + (arrayList.size() - (cowObj + lionObj)));

	}
}
