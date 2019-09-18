package com.gamefull.model;

public class MobileHome extends House implements Movable {

	
	public MobileHome(String name, int x, int y, int price, Ematerial material) {
		super(name, x, y, price, material);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean goUp(int speed) {
		this.x += speed;
		return true;
	}

	@Override
	public boolean goDown(int speed) {
		this.x -= speed;
		return true;
	}

	@Override
	public boolean goRight(int speed) {
		this.y += speed;
		return true;
	}

	@Override
	public boolean goLeft(int speed) {
		this.y -= speed;
		return true;
	}
}
