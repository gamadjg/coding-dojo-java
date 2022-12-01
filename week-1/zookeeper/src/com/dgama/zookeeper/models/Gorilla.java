package com.dgama.zookeeper.models;

public class Gorilla extends Mammal{

	private String name;

	public Gorilla(){
		super();
		this.name = "gorilla";
	}

	public Gorilla(String name) {
		super();
		this.name = name;
	}

	public Gorilla(int energyLevel) {
		super(energyLevel);
		this.name = "gorilla";
	}

	public Gorilla(int energyLevel, String name) {
		super(energyLevel);
		this.name = name;
	}

	public void throwSomething(){
		System.out.printf("Barrel throw by %s \n", this.name);
		int energyLevel = this.getEnergyLevel() - 5;
		this.setEnergyLevel(energyLevel);
	}

	public void eatBananas(){
		System.out.println("Bannanas eaten");
		int energyLevel = this.getEnergyLevel() + 10;
		this.setEnergyLevel(energyLevel);
	}

	public void climb(){
		System.out.println("Climbing again");
		int energyLevel = this.getEnergyLevel() - 10;
		this.setEnergyLevel(energyLevel);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
