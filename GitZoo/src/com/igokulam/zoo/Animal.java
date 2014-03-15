package com.igokulam.zoo;

public abstract class Animal extends Base implements LivingBeing {
	int    height;
	int    weight;
	int    color;
	String type;
	String name;
	
	abstract public String getImageFile();
	abstract public void sound() throws Exception;
	
	public String whoAmI() {
		return "I am " + this.type + " [" + this.name + "]";
	}
	
	public Animal(String aType, String aName) {
		type = aType;
		name = aName;
		log(whoAmI() + ".. Hello!");
	}
	
	public void eat() {
		log(whoAmI()+ " -- I am EATING!");
	}
	
	public void sleep() {
		log(whoAmI()+ " -- I am SLEEPING!");
	}
	
	public void play() throws AnimalException {
		log(whoAmI()+ " -- I am PLAYING!");
		try {
			sound();
		}catch(Exception e) {
			throw new AnimalException(e.getMessage());
		}
	}
	
	public void die() {
		log(whoAmI()+ " -- Bye bye to this world! I am DEAD.");
	}
	
}
