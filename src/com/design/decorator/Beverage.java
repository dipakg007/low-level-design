package com.design.decorator;

/*
 * Notes: 
 * Beverage is an abstract class with the two methods getDescription and getCost
 * getDescription is already implemented for us, but we need to implement cost() in the subclasses.
 * 
 * Author: DGupta
 * */

public abstract class Beverage {
	public String description="unknown description";

	public String getDescription() {
		return description;
	}

	public abstract int getCost();
}
