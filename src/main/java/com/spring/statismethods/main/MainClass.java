package com.spring.statismethods.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.statismethods.beans.Car;
import com.spring.statismethods.config.AppConfig;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Car car = (Car) context.getBean("car");
		System.out.println(car.getCircumfrence());
		System.out.println(car.getName());
		System.out.println(car.getCost());
	}

}
