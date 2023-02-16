package com.hocinbouarara.springdemo;

public class TrackCoach implements Coach {

	//
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFotune() {

		return "Just Do It: "+fortuneService.getFortune();
	}
	
	// add an initial method 
	public void doMyStartStuff() {
		System.out.println("TrackCoach: inside method doMyStartStuff");
	}
	
	// add a destroy method
	public void doMyCleanStuff() {
		System.out.println("TrackCoach: inside method doMyCleanStuff");
	}

}
