package com.kumsal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("file:src/com/kumsal/springdemo/applicationContext.xml") ;
		CricketCoach thecoach=context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getDailyWorkout());
		
		System.out.println(thecoach.getTeam());
		System.out.println(thecoach.getEmail());
	}

}
