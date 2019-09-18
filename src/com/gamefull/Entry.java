package com.gamefull;

import com.gamefull.model.*;

public class Entry {

	public static void main(String[] args) {
		Dog d = new Dog("milou",0,0);
		
		Human h = new Human("bob", 1, 0, 2000);
		
		House maison = new House("palace", 1, 1, 1000, Ematerial.Wood);
		
		h.buy(maison);
		h.sell(maison);
		h.adopte(d);
		h.revoke(d);
		
		System.out.println(maison.getHuman().toString());
		
		
	}

}
