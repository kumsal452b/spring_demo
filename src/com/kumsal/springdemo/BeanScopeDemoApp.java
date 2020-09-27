package com.kumsal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("file:src/com/kumsal/springdemo/applicationContext.xml") ;
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==alphaCoach);
		
		System.out.println("\nPointing to the same Object: "+result);
		System.out.println("\nMemory location for the coach: "+theCoach);
		System.out.println("\nMemory location for the coach: "+alphaCoach);
		
		context.close();
	}

}
