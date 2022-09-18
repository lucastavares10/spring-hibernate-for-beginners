package com.love2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	public CricketCoach() {
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
