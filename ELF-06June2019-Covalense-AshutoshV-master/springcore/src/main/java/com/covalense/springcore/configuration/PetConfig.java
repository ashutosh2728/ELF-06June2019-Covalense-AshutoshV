package com.covalense.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.covalense.springcore.beans.PetBean;
import com.covalense.springcore.interfaces.Animal;
import com.covalense.springcore.interfaces.Donkey;
import com.covalense.springcore.interfaces.Monkey;

import lombok.Data;

@Data
@Configuration
public class PetConfig {
	// @Bean(name = "monkey")
	public Animal getAnimal() {
		return new Monkey();
	}

	//@Bean
	public PetBean getPet() {
		return new PetBean();
	}

	// @Bean(name = "donkey")
	public Animal getAnimal2() {
		return new Donkey();
	}
}
