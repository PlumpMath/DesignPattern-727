package org.designpattern.builder1;

import java.util.ArrayList;
import java.util.List;

public class MySandwichBuilder extends SandwichBuilder {

	@Override
	public void addCondiments() {
		sandwich.setHasMayo(false);
		sandwich.setHasMustard(true);
	}

	@Override
	public void applyVegetables() {
		List<String> vegetables = new ArrayList<String>();
		vegetables.add("Tomato");
		vegetables.add("Onion");

		sandwich.setVegetables(vegetables);
	}

	@Override
	public void applyMeatAndCheese() {
		sandwich.setMeatType(MeatType.Turkey);
		sandwich.setCheeseType(CheeseType.Cheddar);
	}

	@Override
	public void prepareBread() {
		sandwich.setBreadType(BreadType.White);
		sandwich.setToasted(true);
	}
}
