package com.gamefull.model;

public abstract class Animal extends Being {
	
	protected Human human ;
	
	public Animal(String name, int x, int y) 
	{
		super(name, x, y);
		human = null;
	}
	
	public abstract String communicate();

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}
	
	
}
