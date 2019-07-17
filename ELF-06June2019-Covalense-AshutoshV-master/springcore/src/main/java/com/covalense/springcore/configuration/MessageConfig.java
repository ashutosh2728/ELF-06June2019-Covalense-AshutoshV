package com.covalense.springcore.configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.covalense.springcore.beans.MessageBean;

import lombok.extern.java.Log;

@Log
@Configuration
public class MessageConfig {
	@Bean
	@Scope("prototype")
	public MessageBean getMessageBean() {
		MessageBean messageBean = new MessageBean();
		messageBean.setMessage("Hello World");
		return messageBean;
	}

	@PostConstruct
	public void init() {
		log.info("Initialisation phase");
	}

	@PreDestroy
	public void destroy() {
		log.info("destroy phase");
	}
}
