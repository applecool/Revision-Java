package org.shellzero.exp;

public class SuperSoldier extends Enemy{

	public SuperSoldier(int hitPoints, int lives) {
		super(hitPoints, lives);
	}
	
	//overwriting the takeDamage in Enemy class
	public void takeDamage(int damage){
		super.takeDamage(damage/2);
	}

	
}
