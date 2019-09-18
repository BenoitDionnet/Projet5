package com.gamefull.model;

public class House extends SpacialElement{
	private int price;
	Human human;
	Ematerial material;
	
	
	public House(String name, int x, int y, int price, Ematerial material) {
		super(name, x, y);
		this.price = price;
		this.material = material;
		this.human = null;
	}


	public int getPrice() {
		return price;
	}


	public Human getHuman() {
		return human;
	}


	public void setHuman(Human human) {
		this.human = human;
	}
	
	
}
