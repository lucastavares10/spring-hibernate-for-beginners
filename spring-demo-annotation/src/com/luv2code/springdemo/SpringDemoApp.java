package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		SwimCoach theAlhpaCoach = context.getBean("swimCoach", SwimCoach.class);

		System.out.println(theCoach.getDailyFortune());

		System.out.println("theCoach == theAlhpaCoach: " + (theCoach == theAlhpaCoach));

		context.close();

	}

}
