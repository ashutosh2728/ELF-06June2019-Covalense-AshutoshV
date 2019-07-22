package com.covalense.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class CourseTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CourseConfig.xml");
		Course course = applicationContext.getBean(Course.class);
		log.info("Course id is: " + course.getCourseId());
		log.info("Course Nasme is: " + course.getCourseName());
		log.info("Faculty is: " + course.getFaculty());
	}

}
