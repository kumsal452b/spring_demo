package com.kumsal.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Judt Do It: "+fortuneService.getFortune();
	}
	public void doMyStartupSruff(){
		System.out.println("TrackCoach: inside method doMyStartupSruff");
	}
	
	public void doMyCleanupStuffYoyo(){
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoyo");
	}

}
