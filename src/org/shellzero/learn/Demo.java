package org.shellzero.learn;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player("Gyu", 01);
		System.out.println(player1.getHandleName());
		System.out.println(player1.getWeapon().getName());
		System.out.println(player1.getWeapon().getHitPoints());
		
		Weapon Axe = new Weapon("Greyskull Axe", 100, 120);
		player1.setWeapon(Axe);
		System.out.println(player1.getWeapon().getName());
		
	}

}
