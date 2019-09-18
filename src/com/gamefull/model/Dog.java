package com.gamefull.model;

public class Dog extends Animal {

	public Dog(String name, int x, int y) {
		super(name, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String communicate() {
		return "woof woof";
	}
}
