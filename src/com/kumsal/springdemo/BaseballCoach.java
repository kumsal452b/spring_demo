package com.kumsal.springdemo;

public class BaseballCoach implements Coach{
	private FortuneService fortuneService;
	 public BaseballCoach(FortuneService nesne){
		this.fortuneService=nesne;
	}
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minute on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "Basball: "+fortuneService.getFortune();
	}

}
