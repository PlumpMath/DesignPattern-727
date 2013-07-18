package org.designpattern.builder1;

public class SandwichMaker {
	private SandwichBuilder builder;

	public SandwichMaker(SandwichBuilder builder) {
		this.builder = builder;
	}

	public void buildSandwich() {
		builder.createNewSandwich();

		builder.prepareBread();
		builder.applyMeatAndCheese();
		builder.applyVegetables();
		builder.addCondiments();
	}

	public Sandwich getSandwich() {
		return builder.getSandwich();
	}
}
