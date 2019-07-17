package com.covalense.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.springcore.beans.MessageBean;
import com.covalense.springcore.configuration.MessageConfig;

import lombok.extern.java.Log;

@Log
public class MessageTest {
	public static void main(String[] args) {
		/*
		 * ApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext("beans.xml"); MessageBean bean = (MessageBean)
		 * applicationContext.getBean("messageBean"); log.info("" + bean.getMessage());
		 */

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfig.class);
		MessageBean message1 = applicationContext.getBean(MessageBean.class);
		MessageBean message2 = applicationContext.getBean(MessageBean.class);

		log.info("Message 1 " + message1.getMessage());
		log.info("Message 2 " + message1.getMessage());

		message2.setMessage("Welcome to spring");

		log.info("Message 1 " + message1.getMessage());
		log.info("Message 2 " + message1.getMessage());

		((ConfigurableApplicationContext) applicationContext).close();
	}

}
