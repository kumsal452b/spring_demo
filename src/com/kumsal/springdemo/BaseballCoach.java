package com.kumsal.springdemo;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minute on batting practice";
	}

}
