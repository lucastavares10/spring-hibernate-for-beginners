package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;

	}

	@Override
	public String getDailyWorkout() {
		return "Training your backhand volley...";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
