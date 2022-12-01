package com.dgama.zookeeper.models;

public class Bat extends Mammal{
	private String name;

	public Bat(){
		super(300);
		this.name = "bat";
	}

	public Bat(String name) {
		super(300);
		this.name = name;
	}

	public Bat(int energyLevel) {
		super(energyLevel);
		this.name = "bat";
	}

	public Bat(int energyLevel, String name) {
		super(energyLevel);
		this.name = name;
	}

	public void fly(){
		System.out.println("(wooshing flying noises)");
		int energyLevel = this.getEnergyLevel() - 50;
		this.setEnergyLevel(energyLevel);
	}

	public void eatHumans(){
		System.out.println("(wails of... lunch)");
		int energyLevel = this.getEnergyLevel() + 25;
		this.setEnergyLevel(energyLevel);
	}

	public void attackTown(){
		System.out.printf("(%s attacking noise)\n", this.name);
		int energyLevel = this.getEnergyLevel() - 100;
		this.setEnergyLevel(energyLevel);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
