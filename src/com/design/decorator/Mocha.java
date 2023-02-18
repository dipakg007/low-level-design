package com.design.decorator;

/*
 * Notes:
 * Mocha is a decorator, so we extends CondimentDecorator
 * Remember CondimentDecorator extends Beverage
 * In the constructor we instantiate mocha with a reference to a Beverage.
 * Remember, this class inherits the Beverage instance variable to hold the beverage we are wrapping.
 * 
 * Author: DGupta
 * */
public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		description = "Mocha";
	}

	// To compute the cost of out beverage with mocha.
	// First, we delegate the call to the object we're decorating so that it can
	// compute the cost
	// Then we add the cost of Mocha to the result
	@Override
	public int getCost() {
		return beverage.getCost() + 2;
	}

	// First we delegate to the object we are decorating to get its description then
	// append "Mocha" to that description
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + description;
	}

}
