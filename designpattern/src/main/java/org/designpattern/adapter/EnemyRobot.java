package org.designpattern.adapter;

import java.util.Random;

public class EnemyRobot {
	private Random generator = new Random();
	
	public void smashWithHands(){
		int attackDamage = generator.nextInt(10)+1;
		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hand");
	}
	
	public void walkForward(){
		int movement =generator.nextInt(5)+1;
		
		System.out.println("Enemy Robot walks foward "+ movement + " Spaces");
	}
	
	public void reactToHuman(String humanName){
		System.out.println("Enemy Robot Tramps on " + humanName);
	}
}
