package com.dgama.zookeeper.models;

public class Mammal {
	private int energyLevel;

	public Mammal(){
		this.energyLevel = 100;
	}

	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
