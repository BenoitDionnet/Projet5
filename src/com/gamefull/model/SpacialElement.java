package com.gamefull.model;

public abstract class SpacialElement {
	protected String name;
	protected int x;
	protected int y;
	protected boolean inAir = false;
	
	
	public SpacialElement(String name, int x, int y) 
	{
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}


	public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isInAir() {
		return inAir;
	}

	public void setInAir(boolean inAir) {
		this.inAir = inAir;
	}
		
}
