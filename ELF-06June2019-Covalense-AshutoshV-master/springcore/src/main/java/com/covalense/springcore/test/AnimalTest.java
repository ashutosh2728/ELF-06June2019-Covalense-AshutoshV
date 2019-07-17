package com.covalense.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.PetBean;

public class AnimalTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("petConfig.xml");
		PetBean petBean = applicationContext.getBean(PetBean.class);
		petBean.doSomething();

	}

}
