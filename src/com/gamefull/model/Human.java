package com.gamefull.model;

import java.util.ArrayList;

public class Human extends Being implements Adopter, Buyer {
	private int money;
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	ArrayList<House> houseList = new ArrayList<House>();
	
	public Human(String name, int x, int y, int money) 
	{
		super(name, x, y) ;
		this.money = money;
	}

	@Override
	public boolean buy(House h) 
	{
		if(h.getHuman() == null && this.money>= h.getPrice()) 
		{
			this.houseList.add(h);
			h.setHuman(this);
			this.money -= h.getPrice();
			return true;
		}
		return false;
	}


	@Override
	public boolean sell(House h) 
	{
		boolean bool = false;
		for(int i = 0; i<houseList.size() && !bool; i++)
		{
			if(houseList.get(i) == h)
			{
				houseList.remove(i);
				bool = true;
				this.money += h.getPrice();
			}
		}
		return bool;
	}

	@Override
	public boolean adopte(Animal a) 
	{
		if(a.getHuman() == null) 
		{
			this.animalList.add(a);
			a.setHuman(this);
			return true;
		}
		return false;
	}

	@Override
	public boolean revoke(Animal a) {
		boolean bool = false;
		for(int i = 0; i<animalList.size() && !bool; i++)
		{
			if(animalList.get(i).getName() == a.getName())
			{
				animalList.remove(i);
				bool = true;
			}
		}
		return bool;
	}		

	public int getMoney() {
		return money;
	}

	@Override
	public String toString() {
		return "Human [money=" + money + ", animalList=" + animalList + ", houseList=" + houseList + ", name=" + name
				+ "]";
	}		
}
