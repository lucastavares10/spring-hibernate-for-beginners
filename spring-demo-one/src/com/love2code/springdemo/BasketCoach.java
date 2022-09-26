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
	
	public void doMyStartupStuff() {
		System.out.println("BasketCoach: inside method doMyStartupStuff");
	}

	public void doMyCleanupStuff() {
		System.out.println("BasketCoach Coach: inside method doMyCleanupStuff");
	}


}
