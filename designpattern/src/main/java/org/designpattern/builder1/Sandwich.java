package org.designpattern.builder1;

import java.util.List;

public class Sandwich {
	public MeatType getMeatType() {
		return meatType;
	}

	public void setMeatType(MeatType meatType) {
		this.meatType = meatType;
	}

	private BreadType breadType;

	private CheeseType cheeseType;

	private MeatType meatType;

	private boolean hasMayo;

	private boolean isToasted;

	private boolean hasMustard;

	private List<String> vegetables;

	public void display() {
		StringBuilder sb = new StringBuilder();
		sb.append("Sandwich on " + breadType + " bread");
		if (isToasted) {
			sb.append("\nToasted");
		}
		if (hasMayo) {
			sb.append("\nWith Mayo");
		}

		if (hasMustard) {
			sb.append("\nWith Mustard");
		}

		sb.append("\nMeat: " + meatType);
		sb.append("\nCheese: " + cheeseType);
		sb.append("\nVeggies:");
		for (String vegetable : vegetables) {
			sb.append("\n\t" + vegetable);
		}

		System.out.println(sb.toString());
	}

	public BreadType getBreadType() {
		return breadType;
	}

	public void setBreadType(BreadType breadType) {
		this.breadType = breadType;
	}

	public CheeseType getCheeseType() {
		return cheeseType;
	}

	public void setCheeseType(CheeseType cheeseType) {
		this.cheeseType = cheeseType;
	}

	public boolean isHasMayo() {
		return hasMayo;
	}

	public void setHasMayo(boolean hasMayo) {
		this.hasMayo = hasMayo;
	}

	public boolean isToasted() {
		return isToasted;
	}

	public void setToasted(boolean isToasted) {
		this.isToasted = isToasted;
	}

	public boolean isHasMustard() {
		return hasMustard;
	}

	public void setHasMustard(boolean hasMustard) {
		this.hasMustard = hasMustard;
	}

	public List<String> getVegetables() {
		return vegetables;
	}

	public void setVegetables(List<String> vegetables) {
		this.vegetables = vegetables;
	}

}
