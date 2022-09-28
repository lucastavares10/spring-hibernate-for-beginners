package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes;
	private Random sorter;

	public RandomFortuneService() {
		this.sorter = new Random();
		this.fortunes = new String[] { "Behind every great fortune lies a great crime.",
				"Fortune favors the prepar ed mind.", "All things are difficult before they are easy." };
	}

	@Override
	public String getFortune() {
		return fortunes[this.sorter.nextInt(this.fortunes.length)];
	}

}
