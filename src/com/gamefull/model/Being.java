package com.gamefull.model;

public abstract class Being extends SpacialElement implements Movable {
	protected int maxSpeed = 1;


	public Being(String name, int x, int y) 
	{
		super(name, x, y);
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
