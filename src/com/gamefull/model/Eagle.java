package com.gamefull.model;

public class Eagle extends Animal implements Flying {

	public Eagle(String name, int x, int y) {
		super(name, x, y);
		// TODO Auto-generated constructor stub
	}

	public boolean fly(Animal a) {
		if(this.isInAir()==false)
		{
			this.setInAir(true);
			return true;
		}
		return false;
	}

	@Override
	public boolean land(Animal a) {
		if(this.isInAir()==true)
		{
			this.setInAir(false);
			return true;
		}
		return false;
	}

	@Override
	public String communicate() {		
		return "cui cui";
	}

}
