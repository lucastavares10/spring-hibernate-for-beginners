package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value("${foo.fortunes}")
	private String[] fortunes;

	private Random sorter;

	public RandomFortuneService() {
		this.sorter = new Random();
	}

	@Override
	public String getFortune() {
		return fortunes[this.sorter.nextInt(this.fortunes.length)];
	}

}
