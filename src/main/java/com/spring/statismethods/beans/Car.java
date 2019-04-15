package com.spring.statismethods.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value("#{T(java.lang.Math).PI}")
	private float circumfrence;

	@Value("Duster")
	private String name;

	@Value("3543")
	private int cost;

	public float getCircumfrence() {
		return circumfrence;
	}

	public void setCircumfrence(float circumfrence) {
		this.circumfrence = circumfrence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
