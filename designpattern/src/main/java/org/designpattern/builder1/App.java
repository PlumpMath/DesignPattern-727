package org.designpattern.builder1;

public class App {
	public static void main(String[] args) {

		SandwichMaker maker = new SandwichMaker(new MySandwichBuilder());
		maker.buildSandwich();

		Sandwich sandwich = maker.getSandwich();
		sandwich.display();
		
		SandwichMaker other=new SandwichMaker(new ClubSandwichBuilder());
		other.buildSandwich();
		
		Sandwich clubSandwich=other.getSandwich();
		clubSandwich.display();
		
	}
}
