package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		System.out.println("Pointing to the same instance: " + new Boolean(theCoach == alphaCoach).toString());
		
		System.out.println("Memory location theCoach: " + theCoach);
		
		System.out.println("Memory location alphaCoach: " + alphaCoach);

		context.close();

	}

}
