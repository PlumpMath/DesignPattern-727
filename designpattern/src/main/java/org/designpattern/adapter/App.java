package org.designpattern.adapter;

public class App {

	public static void main(String[] args) {
		EnemyTank tank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();

		EnemyAttacker adaptor = new EnemyRobotAdapter(robot);
		System.out.println("The Robot");

		robot.reactToHuman("Paul");
		robot.walkForward();
		robot.smashWithHands();

		System.out.println("The Enemy Tank");
		
		tank.assignDriver("Frank");
		tank.driveForward();
		tank.fireWeapon();
		
		System.out.println("The Robot with Adaptor");
		
		adaptor.assignDriver("Mark");
		adaptor.driveForward();
		adaptor.fireWeapon();
	}
}
