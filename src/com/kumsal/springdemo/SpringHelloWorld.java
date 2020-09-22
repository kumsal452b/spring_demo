package com.kumsal.springdemo;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringHelloWorld {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\keski\\Desktop\\github-sample\\spring_demo\\src\\com\\kumsal\\springdemo\\applicationContext.xml");
		System.out.println(file.exists());
		System.out.println(file.canRead());
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("file:src/com/kumsal/springdemo/applicationContext.xml") ;
		context.refresh();
		Coach theCoach=context.getBean("myCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
			
	}

}
