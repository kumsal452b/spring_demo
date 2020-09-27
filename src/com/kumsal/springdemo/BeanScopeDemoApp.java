package com.kumsal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("file:src/com/kumsal/springdemo/applicationContext.xml") ;
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("") ;
	}

}
