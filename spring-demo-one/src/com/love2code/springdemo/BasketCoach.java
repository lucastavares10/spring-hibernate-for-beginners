package com.love2code.springdemo;

public class BasketCoach implements Coach {

	private FortuneService fortuneService;

	public BasketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Spend 30 minutes on hitting baskets";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
