package org.shellzero.learn;

public class Player {

	//instance variables for the Player Class
	private String handleName;
	private int lives;
	private int score;
	private int level;
	private Weapon weapon;
	
	//default constructor
	public Player(){
		this.handleName = "Unknown player";
		this.lives = 3;
		this.score = 0;
		this.level = 1;
		setDefaultWeapon();
		
	}
	
	public Player(String name){
		this();
		setHandleName(name);
		
	}
	public Player(String name, int level){
		this();
		setHandleName(name);
		setLevel(level);
	}
	public void setDefaultWeapon(){
		this.weapon = new Weapon("Sword", 10, 20);
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	//getters
	public String getHandleName(){
		return handleName;
	}
	
	public int getLives(){
		return lives;
	}
	
	public int getScore(){
		return score;
	}
	
	public int getLevel(){
		return level;
	}
	
	//setters
	public void setHandleName(String name){
		if(name.length() <3){
			return;
		}
		this.handleName = name;
	}
	

	public void setLives(int lives) {
		this.lives = lives;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	}
