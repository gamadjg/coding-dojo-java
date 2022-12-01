package com.dgama.zookeeper;

import com.dgama.zookeeper.models.Bat;

public class BatTest {
	public static void main(String[] args) {
		Bat batman = new Bat("Batman");
		batman.attackTown();
		batman.fly();
		batman.attackTown();
		batman.fly();
		batman.attackTown();
		batman.eatHumans();
	}

}
