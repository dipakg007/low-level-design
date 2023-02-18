package com.design.decorator;

public class Whip extends CondimentDecorator {

	public Whip(Beverage beverage) {
		this.beverage = beverage;
		description = "Whip";
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + description;
	}

	@Override
	public int getCost() {
		return beverage.getCost() + 1;
	}

}
