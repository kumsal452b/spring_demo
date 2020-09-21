package com.kumsal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorld {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContex.xml");
		Coach theCoach=context.getBean("myCoach",Coach.class);
	}

}
