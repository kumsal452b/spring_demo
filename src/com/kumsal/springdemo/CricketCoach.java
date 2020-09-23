package com.kumsal.springdemo;

public class CricketCoach implements Coach{

	FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method -setFortunService");
		this.fortuneService = fortuneService;
	}

	public CricketCoach(){
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	public CricketCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practicte fast bowling for 15 minute";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
}
