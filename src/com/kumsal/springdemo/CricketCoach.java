package com.kumsal.springdemo;

public class CricketCoach implements Coach{

	FortuneService fortuneService;
	private String email;
	private String team;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method -setEmailAdress");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method -setTeam");
		this.team = team;
	}
	
	
}
