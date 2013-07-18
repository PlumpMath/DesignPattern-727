package org.designpattern.builder1;

import java.util.ArrayList;
import java.util.List;

public class ClubSandwichBuilder extends SandwichBuilder {

	@Override
	public void prepareBread() {
		sandwich.setBreadType(BreadType.White);
		sandwich.setToasted(true);

	}

	@Override
	public void applyMeatAndCheese() {
		sandwich.setMeatType(MeatType.Chicken);
		sandwich.setCheeseType(CheeseType.Swiss);

	}

	@Override
	public void applyVegetables() {
		List<String> vegetables = new ArrayList<String>();
		vegetables.add("Tomato");
		vegetables.add("Onion");
		vegetables.add("Lettuce");
		sandwich.setVegetables(vegetables);
	}

	@Override
	public void addCondiments() {
		sandwich.setHasMayo(true);
		sandwich.setHasMustard(true);

	}

}
